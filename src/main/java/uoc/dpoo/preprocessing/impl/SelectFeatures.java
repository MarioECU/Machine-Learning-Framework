package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.common.Util;
import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.preprocessing.Preprocessing;
import uoc.dpoo.io.CSV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.opencsv.exceptions.CsvException;

public class SelectFeatures extends Preprocessing {

	/**
	 * Constructor
	 * 
	 * @param csv CSV to normalize
	 */
	public SelectFeatures(CSV csv) {
		super(csv);
	}

	/**
	 * Perform the selection of features of the CSV
	 * 
	 * @param column name of the column (feature) to keep
	 * @return csv with the selected feature
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String column) throws Exception {
		CSV newCsv = new CSV(csv.getPath(), csv.getSep());
		newCsv.addOrUpdateFeature(csv.getFeature(column));

		return newCsv;
	}

	/**
	 * Perform the selection of features of the CSV
	 * 
	 * @param columns name of the columns (features) to keep
	 * @return csv with the selected features
	 * @throws Exception raised if errors happen
	 */
	public CSV process(String[] columns) throws Exception {
		CSV newCsv = new CSV(csv.getPath(), csv.getSep());
		for (String column : columns) {
			newCsv.addOrUpdateFeature(csv.getFeature(column));
		}

		return newCsv;
	}

}
