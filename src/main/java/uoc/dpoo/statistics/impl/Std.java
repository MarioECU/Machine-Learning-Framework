package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.stream.DoubleStream;

public class Std extends Statistics<Double> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Std(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the std element in the feature.
	 * 
	 * @param column column to process the metric
	 * @return The std element in the feature
	 */
	public Double process(String column) throws CSVException {
		List<String> values = csv.getFeature(column).getValues();
		return process(values);
	}

	/**
	 * Calculate the std element in the list.
	 * 
	 * @param values values to process the metric
	 * @return The std element in the list
	 */
	protected double process(List<String> values) {
		double[] vals = super.convertToDouble(values).toArray();

		if (vals.length == 0) {
			return Double.NaN;
		}

		double average = super.convertToDouble(values).average().getAsDouble();
		double variance = 0.0;

		for (double value : vals) {
			variance += Math.pow(value - average, 2);
		}

		double std = Math.sqrt(variance / vals.length);
		return std;
	}
}
