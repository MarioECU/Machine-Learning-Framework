package uoc.dpoo.preprocessing.impl;

import uoc.dpoo.common.Util;
import uoc.dpoo.io.CSV;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import uoc.dpoo.io.Feature;
import uoc.dpoo.io.FeatureType;
import uoc.dpoo.preprocessing.Preprocessing;

import static uoc.dpoo.common.Util.convertToDouble;


public class NormalizeMINMAX extends Preprocessing {

    /**
     * Constructor
     * @param csv CSV to normalize
     */
    public NormalizeMINMAX(CSV csv)  {
        super(csv);
    }


    /**
     * Perform the CSV normalization of a single column
     * @param column name of the column (feature) to normalize
     * @return csv normalized
     * @throws Exception raised if errors happen
     */
    public CSV process(String column) throws Exception {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Perform the CSV normalization of a single column
     * @param columns name of the columns (features) to normalize
     * @return csv normalized
     * @throws Exception raised if errors happen
     */
    public CSV process(String[] columns) throws Exception {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Normalize a value
     * @param value to normalize through min-max normalization (value - min) / (max - min)
     * @param min minimum value of the collection to normalize
     * @param max maximum value of the collection to normalize
     * @return normalized value
     */
    public static double normalize(double value, double min, double max) {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }
}
