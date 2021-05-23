package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.io.CSV;

public class ResponseTrainTestSplit {
	/**
	 * Training split
	 */
	private CSV csvTrain;
	/**
	 * Testing split
	 */
	private CSV csvTest;

	/**
	 * Constructor for the response
	 * 
	 * @param csvTrain Training split
	 * @param csvTest  Testing split
	 */
	public ResponseTrainTestSplit(CSV csvTrain, CSV csvTest) {
		this.csvTrain = csvTrain;
		this.csvTest = csvTest;
	}

	/**
	 * Getteer for the training split
	 * 
	 * @return csvTrain
	 */
	public CSV getCsvTrain() {
		return this.csvTrain;
	}

	/**
	 * Setter for the training split
	 */
	public void setCsvTrain(CSV csvTrain) {
		this.csvTrain = csvTrain;
	}

	/**
	 * Getteer for the test split
	 * 
	 * @return csvTest
	 */
	public CSV getCsvTest() {
		return this.csvTest;
	}

	/**
	 * Setter for the testing split
	 */
	public void setCsvTest(CSV csvTest) {
		this.csvTest = csvTest;
	}
}
