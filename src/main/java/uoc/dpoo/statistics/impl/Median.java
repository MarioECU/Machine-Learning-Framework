package uoc.dpoo.statistics.impl;

import uoc.dpoo.exceptions.CSVException;
import uoc.dpoo.io.CSV;
import uoc.dpoo.io.Feature;
import uoc.dpoo.statistics.Statistics;

import java.util.List;
import java.util.stream.Collectors;

public class Median  extends Statistics<Double> {

    /**
     * Constructor
     * @param csv CSV to process
     */
    public Median(CSV csv) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the median element in the feature.
     * @param column Column to process the metric
     * @return The median element in the feature
     */
    public Double process(String column) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Calculate the median element in the list.
     * @param values values to process the metric
     * @return The median element in the feature
     */
    protected Double process(List<String> values){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }
}
