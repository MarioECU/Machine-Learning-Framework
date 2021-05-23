package uoc.dpoo.preprocessing.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
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
		CSV csvTrain = csv.clone();
		CSV csvTest = csv.clone();

		Map<String, Feature> features = csv.getFeatures();

		int rowNumber = csv.getRowsNumber();

		int testAmount = (int) (rowNumber * testPercentage);
		int trainingAmount = rowNumber - testAmount;

		for (Feature feature : features.values()) {
			List<String> values = feature.getValues();
			List<String> trainFeatureValues = new ArrayList<>();
			List<String> testFeatureValues = new ArrayList<>();

			if (randomize) {
				Random rd = new Random();
				List<Integer> selectedIndex = new ArrayList<>();

				int i = 0, j = 0;
				while (i < rowNumber) {
					int n = rd.nextInt(rowNumber);

					if (!selectedIndex.contains(n)) {
						if (j < trainingAmount - 1) {
							trainFeatureValues.add(values.get(n));
							j++;
						} else {
							testFeatureValues.add(values.get(n));
						}
						i++;
					}
				}
			} else {
				for (int i = 0; i < values.size(); i++) {
					if (i < trainingAmount - 1) {
						trainFeatureValues.add(values.get(i));
					} else {
						testFeatureValues.add(values.get(i));
					}
				}
			}

			Feature trainFeature = feature.clone();
			Feature testFeature = feature.clone();

			trainFeature.setValues(trainFeatureValues);
			testFeature.setValues(testFeatureValues);

			csvTrain.addOrUpdateFeature(trainFeature);
			csvTest.addOrUpdateFeature(testFeature);
		}

		return new ResponseTrainTestSplit(csvTrain, csvTest);
	}
}
