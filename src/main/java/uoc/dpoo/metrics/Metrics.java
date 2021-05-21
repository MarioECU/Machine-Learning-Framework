package uoc.dpoo.metrics;

import uoc.dpoo.trainTest.Pair;

import java.text.DecimalFormat;
import java.util.List;

/**
 * Class to calculate the Metrics from train and test model.
 * The Class only supports binary classification.
 */
public class Metrics {

    /**
     * List of Tuples that contains the true label and th predicted one.
     */
    private final List<Pair> results;

    /**
     * Constructor
     * @param results List of tuples with true and predicted labels
     */
    public Metrics(List<Pair> results){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the accuracy
     * @link https://developers.google.com/machine-learning/crash-course/classification/accuracy
     * @return the accuracy value
     */
    public double accuracy(){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Prints the confusionMatrix
     * TN | FN
     * FP | TP
     */
    public void confusionMatrix(){
        //TODO complete code
        DecimalFormat format = new DecimalFormat("#.##");
        System.out.println(" |0\t\t1");
        System.out.println("-----------");
        System.out.println("0|"+ format.format(null) +"\t\t"+ format.format(null));
        System.out.println("1|"+ format.format(null) +"\t\t"+ format.format(null));
        throw new UnsupportedOperationException();

    }

    /**
     * Calculate the recall
     * @link https://developers.google.com/machine-learning/crash-course/classification/precision-and-recall
     * @return the recall value
     */
    public double recall(){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the precision
     * @link https://developers.google.com/machine-learning/crash-course/classification/precision-and-recall
     * @return the precision value
     */
    public double precision(){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the F1
     * @link https://en.wikipedia.org/wiki/F-score
     * @return the f1 value
     */
    public double f1(){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the number of true positives.
     * Values that true value is 1 and predicted value is 1
     * @return number of true positives
     */
    private double truePositive(){
        //TODO Complete code
        throw new UnsupportedOperationException();    }

    /**
     * Returns the number of true negatives.
     * Values that true value is 0 and predicted value is 0
     * @return number of true negatives
     */
    private double trueNegative(){
        //TODO Complete code
        throw new UnsupportedOperationException();    }

    /**
     * Returns the number of false positives.
     * Values that true value is 0 and predicted value is 1
     * @return number of false positives
     */
    private double falsePositive(){
        //TODO Complete code
        throw new UnsupportedOperationException();    }

    /**
     * Returns the number of false negatives.
     * Values that true value is 1 and predicted value is 0
     * @return number of true positives
     */
    private double falseNegative(){
        //TODO Complete code
        throw new UnsupportedOperationException();    }
}
