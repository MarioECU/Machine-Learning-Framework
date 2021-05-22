package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.exceptions.StatisticsException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Quantil extends Statistics<Double> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Quantil(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the quantil 2 in the feature.
	 * 
	 * @param column Column to process the metric
	 * @return The quantil element in the feature
	 */
	@Override
	public Double process(String column) throws CSVException, StatisticsException {
		List<String> values = csv.getFeature(column).getValues();
		return process(values, 2);
	}

	/**
	 * Calculate the quantil element in the feature.
	 * 
	 * @param column  feature to process the metric
	 * @param quantil the quantil to use
	 * @return The quantil element in the feature
	 */
	public Double process(String column, int quantil) throws CSVException, StatisticsException {
		List<String> values = csv.getFeature(column).getValues();
		return process(values, quantil);
	}

	/**
	 * Calculate the quantil element in the list.
	 * 
	 * @param values  list to process the metric
	 * @param quantil the quantil to use
	 * @return The quantil element in the list
	 * @throws StatisticsException
	 */
	protected Double process(List<String> values, int quantil) throws StatisticsException {
		if (quantil < 1 || quantil > 4) {
			throw new StatisticsException(StatisticsException.QUANTIL_OUT_OF_RANGE);
		}

		DoubleStream sortedValues = super.convertToDouble(values).sorted();
		double[] vals = sortedValues.toArray();

		return 0.0;
	}

	private int getQuantilPosition(Double[] values, int quantil) {
		return 0;
	}
}
