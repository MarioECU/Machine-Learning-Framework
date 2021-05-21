package uoc.dpoo.statistics.impl;

import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
import uoc.dpoo.io.FeatureType;
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
	 * @throws Exception
	 */
	public Long process(String column) throws Exception {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculate the number of no missing elements in the list.
	 * 
	 * @param values list of string to calculate the number of no missing elements
	 * @return the number of no missing elements.
	 */
	protected long process(List<String> values) {
		long c = 0;
		for (String value : values) {
			if (super.isNotMissingValue(value)) {
				c++;
			}
		}
		return c;
	}

	/**
	 * Calculate the number of numbers in the list.
	 * 
	 * @param values list of doubles, in string format, to calculate the number of
	 *               no missing elements
	 * @return the number of no missing elements.
	 */
	protected long countNumbers(List<String> values) {
		long c = 0;
		DoubleStream ds = super.convertToDouble(values);

		return c;
	}

}
