package uoc.dpoo.common;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.io.FeatureType;

import java.util.*;
import java.util.stream.DoubleStream;

public class Util {

    /**
     * Checks if every name of columns passed as parameter are in the csv's header
     * @param csvFile CSV to be checked
     * @param columns to search in the CSV
     * @throws Exception if something bad happens
     */
    public static void checkColumnNames(CSV csvFile, String[] columns) throws Exception {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Normalize the value
     * @param value Value to normalize
     * @param min min value to use to normalize
     * @param max max value to use to normalize
     * @return the value normalized
     */
    public static double normalize(double value, double min, double max) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if a name of a column passed as parameter is in the csv's header
     * @param csvFile CSV to be checked
     * @param column to search in the CSV
     * @throws Exception if something bad happens
     */
    public static boolean checkColumn(CSV csvFile, String column) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if the types of the columns is equals to the feature type passed as parameter
     * @param csvFile CSV file to be checked
     * @param columns columns of the CSV to check
     * @param type Feature type selected
     * @throws CSVException
     */
    public static void checkColumnsType(CSV csvFile, String[] columns, FeatureType type) throws Exception {
        //TODO Check every column has type equals to type if not raise CSVException
        throw new UnsupportedOperationException();
    }

    /**
     * Optional method to convert to a doubleStream a list of numerical values in string format
     * @param values to be converted
     * @return doubleStream containing the doubles, for NAs, nulls are returned
     */
    public static DoubleStream convertToDouble(List<String> values) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }
}
