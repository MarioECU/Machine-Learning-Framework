package uoc.dpoo.trainTest;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.classifier.bayes.NaiveBayesClassifierMapImpl;

import java.util.*;

public class Train {
    /**
     * CSV used to train the classification model
     */
    private final CSV csv;

    /**
     * Constructor
     * @param csv used to train the classification model
     */
    public Train(CSV csv) {
    	this.csv = csv;
    }

    /**
     *
     * @param classifierName name required internally by the NaiveBayesClassifierMapImpl's constructor
     * @param classColumn name of the class column, or dependent variable
     * @return a trained NaiveBayesClassifierMapImpl object
     * @throws Exception if errors happen
     */
    public NaiveBayesClassifierMapImpl process(String classifierName, String classColumn) throws Exception {
    	return new NaiveBayesClassifierMapImpl(classifierName, getPossibleValues(classColumn));
    }

    private String[] getPossibleValues(String column) throws CSVException {
    	if (!csv.getColumnsNames().contains(column))
    		throw new CSVException(CSVException.NO_FEATURE_EXCEPTION, column);
    	Set<String> s = new HashSet<> (csv.getFeature(column).getValues());
    	return Arrays.copyOf(s.toArray(), s.size(), String[].class);
    }
}
