package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.preprocessing.Preprocessing;
import uoc.dpoo.io.CSV;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


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
		CSV newCsv = process(new String[] { column });

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
		CSV newCsv = csv.clone();
		List<String> cols = Arrays.asList(columns);

		Iterator<String> iterator = newCsv.getFeatures().keySet().iterator();

		while (iterator.hasNext()) {
			String featureName = iterator.next();
			if (!cols.contains(featureName)) {
				iterator.remove();
			}
		}

		return newCsv;
	}

}
