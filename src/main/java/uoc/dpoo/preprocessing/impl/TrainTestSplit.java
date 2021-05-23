package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.io.CSV;
import uoc.dpoo.preprocessing.Preprocessing;


public class TrainTestSplit extends Preprocessing {
	/**
	 * Constructor
	 * 
	 * @param csv CSV to normalize
	 */
	public TrainTestSplit(CSV csv) {
		super(csv);
	}

	/**
	 * Performs the training-test splitting
	 * 
	 * @param testPercentage percentage in the (0-1) interval to withold from the
	 *                       CSV and use it as test set
	 * @param randomize      indicates whether the split will be performed
	 *                       preserving the natural order of the instances or
	 *                       randomized
	 * @return a response containing both the training and test set splits
	 * @throws Exception if errors happen
	 */
	public ResponseTrainTestSplit process(float testPercentage, boolean randomize) throws Exception {
		// TODO Complete code
		throw new UnsupportedOperationException();
	}
}
