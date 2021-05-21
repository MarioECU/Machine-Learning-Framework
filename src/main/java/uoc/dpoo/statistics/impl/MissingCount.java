package uoc.dpoo.statistics.impl;

import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
import uoc.dpoo.io.FeatureType;
import uoc.dpoo.statistics.Statistics;

import java.util.List;

public class MissingCount extends Statistics<Long> {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to process
	 */
	public MissingCount(CSV csv) {
		super(csv);
	}

	/**
	 * Calculate the missing elements element in the feature.
	 * 
	 * @param column Column to process the metric
	 * @return The missing elements in the feature
	 */
	public Long process(String column) {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculate the missing elements element in the list.
	 * 
	 * @param values list to process the metric
	 * @return The missing elements in the list
	 */
	protected long missingValuesOther(List<String> values) {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Calculate the missing elements element when the feature is NUMBER.
	 * 
	 * @param values list to process the metric
	 * @return The missing elements in the list
	 */
	protected long missingValuesNumber(List<String> values) {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

}
