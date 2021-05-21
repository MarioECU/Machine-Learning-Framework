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
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param classifierName name required internally by the NaiveBayesClassifierMapImpl's constructor
     * @param classColumn name of the class column, or dependent variable
     * @return a trained NaiveBayesClassifierMapImpl object
     * @throws Exception if errors happen
     */
    public NaiveBayesClassifierMapImpl process(String classifierName, String classColumn) throws Exception {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    private String[] getPossibleValues(String column) throws CSVException {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }
}
