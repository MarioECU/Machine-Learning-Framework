package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.common.Util;
import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.Feature;
import uoc.dpoo.preprocessing.Preprocessing;
import uoc.dpoo.io.CSV;

import java.util.ArrayList;
import java.util.List;

public class DiscretizeEqualWidth extends Preprocessing {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to discretize
	 */
	public DiscretizeEqualWidth(CSV csv) {
		super(csv);
	}

	/**
	 * Perform the CSV discretization of a single column
	 * 
	 * @param column name of the column (feature) to discretize
	 * @param bins   number of bins or categories to use
	 * @return csv discretized
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String column, int bins) throws Exception {
		if (!csv.getColumnsNames().contains(column)) {
			throw new CSVException(CSVException.NO_FEATURE_EXCEPTION, column);
		}

		CSV newCsv = csv.clone();
		Feature feature = newCsv.getFeature(column);
		List<String> values = feature.getValues();
		List<String> discretizedValues = new ArrayList<>();

		Double max = Util.convertToDouble(values).max().getAsDouble();
		Double min = Util.convertToDouble(values).min().getAsDouble();

		for (String value : values) {
			String dValue = "";
			if (value != null) {
				double val = Double.parseDouble(value);
				dValue = discretize(val, min, max, bins);
			}
			discretizedValues.add(dValue);
		}

		feature.setValues(discretizedValues);
		newCsv.addOrUpdateFeature(feature);

		return newCsv;
	}

	/**
	 * Perform the CSV discretization of a single column
	 * 
	 * @param columns name of the columns (features) to discretize
	 * @param bins    number of bins or categories to use
	 * @return csv discretized
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String[] columns, int bins) throws Exception {
		CSV newCsv = csv.clone();

		for (String column : columns) {
			if (!csv.getColumnsNames().contains(column)) {
				throw new CSVException(CSVException.NO_FEATURE_EXCEPTION, column);
			}

			Feature feature = newCsv.getFeature(column);
			List<String> values = feature.getValues();
			List<String> discretizedValues = new ArrayList<>();

			Double max = Util.convertToDouble(values).max().getAsDouble();
			Double min = Util.convertToDouble(values).min().getAsDouble();

			for (String value : values) {
				String dValue = "";
				if (value != null) {
					double val = Double.parseDouble(value);
					dValue = discretize(val, min, max, bins);
				}
				discretizedValues.add(dValue);
			}
			feature.setValues(discretizedValues);
			newCsv.addOrUpdateFeature(feature);
		}

		return newCsv;
	}

	/**
	 * Clamps the value to discretize, i.e. returns the bin index in which the value
	 * yields
	 * 
	 * @param value numerical value to discretize
	 * @param min   lower threshold (always 0)
	 * @param max   upper threshold (binCount - 1)
	 * @return clamped value
	 */
	private static int clamp(int value, int min, int max) {
		if (value < min) {
			return min;
		} else if (value > max) {
			return max;
		} else {
			return value;
		}
	}

	/**
	 * Discretizes a single value. Should return a character in the A-Z range
	 * 
	 * @param value    numerical value to discretize
	 * @param min      minimum value of the collection to discretize
	 * @param max      maximum value of the collection to discretize
	 * @param binCount number of bins to use
	 * @return discretized value in the A-Z range
	 */
	private static String discretize(double value, double min, double max, int binCount) {
		String alphabet[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
				"S", "T", "U", "V", "W", "X", "Y", "Z" };

		double normalizedValue = NormalizeMINMAX.normalize(value, min, max);
		int discretizedValue = clamp((int) (normalizedValue * binCount), 0, binCount - 1);
		return alphabet[discretizedValue];
	}
}
