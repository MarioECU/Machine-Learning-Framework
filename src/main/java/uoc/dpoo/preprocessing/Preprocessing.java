package uoc.dpoo.preprocessing;

import uoc.dpoo.io.CSV;


public abstract class Preprocessing {

    /**
     * CSV to preprocess
     */
    protected final CSV csv;

    /**
     * Constructor
     * @param csv CSV to preprocess
     */
    public Preprocessing(CSV csv){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if a value is a missing value
     * @param value to check
     * @return boolean indicating whether if the value is a missing value or not
     */
    protected boolean isMissingValue(String value){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if a value is not a missing value
     * @param value to check
     * @return boolean indicating whether if the value is not missing value or indeed it is
     */
    protected boolean isNotMissingValue(String value){
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

}
