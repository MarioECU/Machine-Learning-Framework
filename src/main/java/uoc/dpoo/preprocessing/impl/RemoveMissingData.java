package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.preprocessing.Preprocessing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;

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
		CSV newCsv = csv.clone();
		Map<String, Feature> features = newCsv.getFeatures();
		List<Integer> naRows = new ArrayList<>();

		for (int i = 0; i < newCsv.getRowsNumber(); i++) {
			Map<String, String> row = newCsv.getRow(i);

			if (row.values().contains(null)) {
				naRows.add(i);
			}
		}

		for (Feature feature : features.values()) {
			List<String> values = feature.getValues();
			List<String> updatedValues = new ArrayList<>();

			for (int i = 0; i < values.size(); i++) {
				if (!naRows.contains(i)) {
					updatedValues.add(values.get(i));
				}
			}

			feature.setValues(updatedValues);
			newCsv.addOrUpdateFeature(feature);
		}

		return newCsv;
	}
}
