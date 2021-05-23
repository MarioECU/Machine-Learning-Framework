package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.stream.DoubleStream;

public class Count extends Statistics<Long> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public Count(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the number of elements in the column.
	 * 
	 * @param column Column to process the metric
	 * @return The number of elements in the column
	 */
	public Long process(String column) throws CSVException {
		List<String> values = csv.getFeature(column).getValues();
		return values.stream().filter(value -> value != null).count();
	}

	/**
	 * Calculate the number of no missing elements in the list.
	 * 
	 * @param values list of string to calculate the number of no missing elements
	 * @return the number of no missing elements.
	 */
	protected long process(List<String> values) {
		return values.stream().filter(value -> super.isNotMissingValue(value)).count();
	}

	/**
	 * Calculate the number of numbers in the list.
	 * 
	 * @param values list of doubles, in string format, to calculate the number of
	 *               no missing elements
	 * @return the number of no missing elements.
	 */
	protected long countNumbers(List<String> values) {
		DoubleStream ds = super.convertToDouble(values);
		return ds.filter(value -> super.isNotMissingValue(String.valueOf(value))).count();
	}

}
