package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.statistics.Statistics;

import java.util.List;

public class Mean extends Statistics<Double> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Mean(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the mean element in the feature.
	 * 
	 * @param column Column to process the metric
	 * @return The mean element in the feature
	 */
	public Double process(String column) throws CSVException {
		List<String> values = csv.getFeature(column).getValues();
		return process(values);
	}

	/**
	 * Calculate the mean element in the list.
	 * 
	 * @param values values to process the metric
	 * @return The mean element in the feature
	 */
	protected Double process(List<String> values) {
		if (super.convertToDouble(values).count() == 0) {
			return Double.NaN;
		} else {
			return super.convertToDouble(values).average().getAsDouble();
		}
	}
}
