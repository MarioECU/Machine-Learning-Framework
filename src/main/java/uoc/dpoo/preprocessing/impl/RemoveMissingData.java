package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.io.Feature;
import uoc.dpoo.preprocessing.Preprocessing;
import uoc.dpoo.io.CSV;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveMissingData extends Preprocessing {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to which remove the missing data
	 */
	public RemoveMissingData(CSV csv) {
		super(csv);
	}

	/**
	 * Performs the NA removal process on the whole CSV
	 * 
	 * @return CSV without any rows containing NAs
	 * @throws Exception when errors happen
	 */
	public CSV process() throws Exception {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}

}
