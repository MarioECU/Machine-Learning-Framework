package uoc.dpoo.statistics.impl;

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
	public Double process(String column) {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculate the variance element in the list. If some value is null, returns
	 * Double.NaN
	 * 
	 * @param values values to process the metric
	 * @return The variance element in the list
	 */
	protected Double process(List<String> values) {
		return Double.NaN;
	}
}
