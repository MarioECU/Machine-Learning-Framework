package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
import uoc.dpoo.io.FeatureType;
import uoc.dpoo.statistics.Statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

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
	public Long process(String column) throws CSVException {
		List<String> values = csv.getFeature(column).getValues();

		if (csv.getFeature(column).getType() == FeatureType.NUMBER) {
			return missingValuesNumber(values);
		} else {
			return missingValuesOther(values);
		}

	}

	/**
	 * Calculate the missing elements element in the list.
	 * 
	 * @param values list to process the metric
	 * @return The missing elements in the list
	 */
	protected long missingValuesOther(List<String> values) {
		return values.stream().filter(value -> super.isMissingValue(value)).count();
	}

	/**
	 * Calculate the missing elements element when the feature is NUMBER.
	 * 
	 * @param values list to process the metric
	 * @return The missing elements in the list
	 */
	protected long missingValuesNumber(List<String> values) {
		return values.size() - super.convertToDouble(values).count();
	}
}
