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
		if (values.contains(null) || super.convertToDouble(values).count() == 0) {
			return Double.NaN;
		} else {
			DoubleStream vals = super.convertToDouble(values);
			double average = vals.average().getAsDouble();
			double variance = 0.0;

			for (double value : vals.toArray()) {
				variance += Math.pow(value - average, 2);
			}

			variance = Math.sqrt(variance / vals.count());
			return variance;
		}

	}
}
