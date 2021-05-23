package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.common.Util;
import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;

import java.util.ArrayList;
import java.util.List;

import uoc.dpoo.io.Feature;
import uoc.dpoo.io.FeatureType;
import uoc.dpoo.preprocessing.Preprocessing;

public class NormalizeMINMAX extends Preprocessing {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to normalize
	 */
	public NormalizeMINMAX(CSV csv) {
		super(csv);
	}

	/**
	 * Perform the CSV normalization of a single column
	 * 
	 * @param column name of the column (feature) to normalize
	 * @return csv normalized
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String column) throws Exception {
		CSV newCSv = csv.clone();
		Feature feature = newCSv.getFeature(column);
		List<String> values = feature.getValues();

		List<String> normalizedValues = new ArrayList<>();
		double max = Util.convertToDouble(values).max().getAsDouble();
		double min = Util.convertToDouble(values).min().getAsDouble();

		for (String value : values) {
			double val = Double.parseDouble(value);
			double nValue;

			if (val == min) {
				nValue = 0.0;
			} else if (val == max) {
				nValue = 1.0;
			} else {
				nValue = normalize(val, min, max);
			}
			normalizedValues.add(String.valueOf(nValue));
		}

		feature.setValues(normalizedValues);
		newCSv.addOrUpdateFeature(feature);

		return newCSv;
	}

	/**
	 * Perform the CSV normalization of multiple columns
	 * 
	 * @param columns name of the columns (features) to normalize
	 * @return csv normalized
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String[] columns) throws Exception {
		CSV newCSv = new CSV(csv.getPath(), csv.getSep());

		for (String column : columns) {
			Feature feature = newCSv.getFeature(column);
			List<String> values = feature.getValues();

			List<String> normalizedValues = new ArrayList<>();
			double max = Util.convertToDouble(values).max().getAsDouble();
			double min = Util.convertToDouble(values).min().getAsDouble();

			for (String value : values) {
				double val = Double.parseDouble(value);
				double nValue;

				if (val == min) {
					nValue = 0.0;
				} else if (val == max) {
					nValue = 1.0;
				} else {
					nValue = normalize(val, min, max);
				}
				normalizedValues.add(String.valueOf(nValue));
			}

			feature.setValues(normalizedValues);
			newCSv.addOrUpdateFeature(feature);
		}

		return newCSv;
	}

	/**
	 * Normalize a value
	 * 
	 * @param value to normalize through min-max normalization (value - min) / (max
	 *              - min)
	 * @param min   minimum value of the collection to normalize
	 * @param max   maximum value of the collection to normalize
	 * @return normalized value
	 */
	public static double normalize(double value, double min, double max) {
		return (value - min) / (max - min);
	}
}
