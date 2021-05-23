package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.statistics.Statistics;

import java.util.List;

public class Min extends Statistics<Double> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Min(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the minimum element in the feature.
	 * 
	 * @param column feature to process the metric
	 * @return The minimum element in the feature
	 */
	public Double process(String column) throws CSVException {
		List<String> values = csv.getFeature(column).getValues();
		return process(values);
	}

	/**
	 * Calculate the minimum element in the list.
	 * 
	 * @param values values to process the metric
	 * @return The minimum element in the feature
	 */
	protected Double process(List<String> values) {
		if (super.convertToDouble(values).count() == 0) {
			return Double.NaN;
		} else {
			return super.convertToDouble(values).min().getAsDouble();
		}
	}
}
