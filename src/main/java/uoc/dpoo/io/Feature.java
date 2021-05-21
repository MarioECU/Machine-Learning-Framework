package uoc.dpoo.io;

import uoc.dpoo.exceptions.CSVException;

import java.util.List;
import java.util.Objects;

public class Feature implements Cloneable{

    /**
     * The name feature
     */
    private String name;
    /**
     * The values stored in the feature
     */
    private List<String> values;
    /**
     * The type of the feature
     */
    private FeatureType type;

    /**
     * Constuctor
     * @param name The name of the feature
     * @throws CSVException Raised if the name is null
     */
    public Feature(String name) throws CSVException {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Constructor
     * @param name The name of the feature
     * @param values The values of the feature
     * @throws CSVException Raised if the name is null
     */
    public Feature(String name, List<String> values) throws CSVException {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if all the values are numbers and change the features' type
     * If the feature has all values as number then the type is FeatureType.NUMBER
     * if is not a number or the values is empty the type is FeatureType.OTHER
     */
    public void fixType(){
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Check if all the values are numbers, in that case returns true , otherwise false.
     * Before checks the values, filter the nulls
     * @return True if all values are numbers, otherwise returns false
     */
    private boolean isNumber(){
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Set the name of the Feature, if the name is null it raises an exception
     * @param name Feature's name
     * @throws CSVException Raised when name is null
     */
    private void setName(String name) throws CSVException{
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the  feature's name
     * @return The name of the feature
     */
    public String getName() {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Get the feature values.
     * @return All values stored in the feature
     */
    public List<String> getValues() {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Set the values of the feature
     * @param values List of the string with the feature values
     */
    public void setValues(List<String> values) {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the type of the feature.
     * @return feature type
     */
    public FeatureType getType() {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Set the type of the feature
     * @param type feature type
     */
    public void setType(FeatureType type) {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object o) {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, values, type);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //TODO complete code
        throw new UnsupportedOperationException();
    }
}
