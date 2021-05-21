package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.StatisticsException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.stream.Collectors;

public class Quantil extends Statistics<Double> {

    /**
     * Constructor
     * @param csv CSV to process
     */
    public Quantil(CSV csv) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the quantil 2 in the feature.
     * @param column Column to process the metric
     * @return The quantil element in the feature
     */
    @Override
    public Double process(String column) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the quantil element in the feature.
     * @param column feature to process the metric
     * @param quantil the quantil to use
     * @return The quantil element in the feature
     */
    public Double process(String column, int quantil){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the quantil element in the list.
     * @param values list to process the metric
     * @param value the quantil to use
     * @return The quantil element in the list
     */
    protected Double process(List<String> values, int value){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }   
}
