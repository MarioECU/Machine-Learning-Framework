package uoc.dpoo.statistics.impl;

import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.NoSuchElementException;

public class Max extends Statistics<Double> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Max(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the maximum element in the feature.
	 * 
	 * @param column Column to process the metric
	 * @return The minimum element in the feature
	 */
	public Double process(String column) {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculate the maximum element in the list.
	 * 
	 * @param values values to process the metric
	 * @return The maximum element in the feature
	 */
	protected Double process(List<String> values) {
		return super.convertToDouble(values).max().getAsDouble();
	}
}
