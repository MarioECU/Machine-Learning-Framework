package uoc.dpoo.trainTest;

import uoc.dpoo.classifier.bayes.ClassifyException;
import uoc.dpoo.classifier.bayes.INaiveBayesClassifier;
import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import java.util.*;

public class Test {

    /**
     * Uses the trained classifier to compute the classifications over the validation set, and build a Pair containing
     * such classified value along with the true value
     * @param csvFileTest csv to use as test set
     * @param columnClass column containing the true values of the class
     * @param trainedModel trained model to validate
     * @return list of Pair, i.e. list of true values-classifications
     * @throws ClassifyException if there is a classification error
     * @throws CSVException if columnClass not found
     */
    public static List<Pair> comparation(CSV csvFileTest, String columnClass,
                                         INaiveBayesClassifier trainedModel) throws ClassifyException, CSVException {
    	if (!csvFileTest.getColumnsNames().contains(columnClass))
    		throw new CSVException(CSVException.NO_FEATURE_EXCEPTION, columnClass);
    	List<Pair> pairs = new ArrayList<>();
    	for (String value : csvFileTest.getFeature(columnClass).getValues()) {
    		Map<String, String> m = new HashMap<>();
    		m.put(columnClass, value);
			pairs.add(new Pair(value, trainedModel.classify(m, false).getClassProbabilities()[0].getCategory()));
    	}
    	return pairs;
    }
}

