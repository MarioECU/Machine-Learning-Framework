package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.common.Util;
import uoc.dpoo.io.Feature;
import uoc.dpoo.io.FeatureType;
import uoc.dpoo.preprocessing.Preprocessing;
import uoc.dpoo.io.CSV;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static uoc.dpoo.common.Util.convertToDouble;

public class DiscretizeEqualWidth extends Preprocessing {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to discretize
	 */
	public DiscretizeEqualWidth(CSV csv) {
		super(csv);
	}

	/**
	 * Perform the CSV discretization of a single column
	 * 
	 * @param column name of the column (feature) to discretize
	 * @param bins   number of bins or categories to use
	 * @return csv discretized
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String column, int bins) throws Exception {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Perform the CSV discretization of a single column
	 * 
	 * @param columns name of the columns (features) to discretize
	 * @param bins    number of bins or categories to use
	 * @return csv discretized
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String[] columns, int bins) throws Exception {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Clamps the value to discretize, i.e. returns the bin index in which the value
	 * yields
	 * 
	 * @param value numerical value to discretize
	 * @param min   lower threshold (always 0)
	 * @param max   upper threshold (binCount - 1)
	 * @return clamped value
	 */
	private static int clamp(int value, int min, int max) {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

	/**
	 * Discretizes a single value. Should return a character in the A-Z range
	 * 
	 * @param value    numerical value to discretize
	 * @param min      minimum value of the collection to discretize
	 * @param max      maximum value of the collection to discretize
	 * @param binCount number of bins to use
	 * @return discretized value in the A-Z range
	 */
	private static String discretize(double value, double min, double max, int binCount) {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}
}
