package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.stream.DoubleStream;

public class Variance extends Statistics<Double> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Variance(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the variance element in the feature.
	 * 
	 * @param column column to process the metric
	 * @return The variance element in the feature
	 */
	public Double process(String column) throws CSVException {
		List<String> values = csv.getFeature(column).getValues();
		return process(values);
	}

	/**
	 * Calculate the variance element in the list. If some value is null, returns
	 * Double.NaN
	 * 
	 * @param values values to process the metric
	 * @return The variance element in the list
	 */
	protected Double process(List<String> values) {
		for (String value : values) {
			if (value == null) {
				return Double.NaN;
			}
		}

		double[] vals = super.convertToDouble(values).toArray();

		if (vals.length == 0) {
			return Double.NaN;
		}

		double average = super.convertToDouble(values).average().getAsDouble();
		double variance = 0.0;

		for (double value : vals) {
			variance += Math.pow(value - average, 2);
		}

		variance = variance / vals.length;
		return variance;
	}
}
