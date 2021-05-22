package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.stream.DoubleStream;

public class Median extends Statistics<Double> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Median(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the median element in the feature.
	 * 
	 * @param column Column to process the metric
	 * @return The median element in the feature
	 */
	public Double process(String column) throws CSVException {
		List<String> values = csv.getFeature(column).getValues();
		return process(values);
	}

	/**
	 * Calculate the median element in the list.
	 * 
	 * @param values values to process the metric
	 * @return The median element in the feature
	 */
	protected Double process(List<String> values) {
		if (super.convertToDouble(values).count() == 0) {
			return Double.NaN;
		} else {
			DoubleStream sortedValues = super.convertToDouble(values).sorted();
			double[] vals = sortedValues.toArray();

			if (vals.length % 2 == 0) {
				double v1 = vals[(vals.length / 2) - 1];
				double v2 = vals[vals.length / 2];
				return (v1 + v2) / 2.0;
			} else {
				int mid = ((vals.length + 1) / 2) - 1;
				return vals[mid];
			}
		}
	}
}
