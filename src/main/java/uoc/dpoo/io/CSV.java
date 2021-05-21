package uoc.dpoo.io;

import com.opencsv.*;
import uoc.dpoo.exceptions.CSVException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class CSV implements Cloneable{

    /**
     * Map to store the values, The key will store the columns names(name1, name2,...), and the value is a Feature.
     */
    private Map<String,Feature> features;

    /**
     * Path where the csv is stored.
     */
    private String path;

    /**
     * Separator used to split the lines into features.
     */
    private char sep;

    /**
     * List of string that will be processed as missingValues
     */
    private List<String> missingValues;

    /**
     * Constructor
     * @param path Path where the csv is stored.
     * @throws Exception Raised when there are a problem reading the file or procesing the features
     */
    public CSV(String path) throws Exception {
        //TODO default separator is ;
        throw new UnsupportedOperationException();
    }

    /**
     * Constructor
     * @param path Path where the csv is stored.
     * @param sep Separator used to split the lines into features.
     * @throws Exception Raised when there are a problem reading the file or procesing the features
     */
    public CSV(String path, char sep) throws Exception {
        //TODO default missingValues are "" and " "
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param path Path where the csv is stored.
     * @param sep Separator used to split the lines into features.
     * @param missingValues List of string that will be processed as missingValues
     * @throws Exception Raised when there are a problem reading the file or procesing the features
     */
    public CSV(String path, char sep, String... missingValues) throws Exception {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Private constructor, used to clone the object. Only calls load when features is empty
     * @param path Path where the csv is stored.
     * @param sep Separator used to split the lines into features.
     * @param missingValues List of string that will be processed as missingValues
     * @param features Map with all the features identified by name
     * @throws Exception Raised when there are a problem reading the file or procesing the features
     */
    private CSV(String path, char sep, List<String> missingValues, Map<String, Feature> features) throws Exception {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Loads the data from CSV file to the instance.
     * @throws Exception Raised when there are a problem reading the file or procesing the features
     */
    private void load() throws Exception {
        CSVParser parser = new CSVParserBuilder().withSeparator(sep).build();
        CSVReader reader = new CSVReaderBuilder(Files.newBufferedReader(Paths.get(path))).withCSVParser(parser).build(); 
		//NOTA: Si línea anterior causa errores en entornos Windows, SUBSTITUIR por esta: CSVReader reader = new CSVReaderBuilder(Files.newBufferedReader(Paths.get(new File(path).toURI()))).withCSVParser(parser).build();
        List<String> columns = readColumnsName(reader);
        readValues(reader, columns);
        //TODO Check if you need to do something with the features
        throw new UnsupportedOperationException();
    }

    /**
     * Reads the columns names and store the values in the instance.
     * For each column create the key and add a new Feature.
     * @param reader CSVReader used to read the CSV
     * @return List with columns names in the same order as read
     * @throws Exception Raised when there are a problem reading the file or procesing the features
     */
    private List<String> readColumnsName(CSVReader reader) throws Exception {
        String[] columnsNames = reader.readNext().clone();
        //TODO fill features
        throw new UnsupportedOperationException();
    }

    /**
     * Reads all values in CSV file and store them in the instance.
     * For each line in CSV.
     * - Check the value is in missingValues and map it to null.
     * - Insert the value in values.
     * @param reader CSVReader used to read the CSV
     * @throws Exception Raised when there are a problem reading the file or procesing the features
     */
    private void readValues(CSVReader reader, List<String> columns) throws Exception {
        String[] line;
        while((line = reader.readNext()) != null){
            //TODO complete the code
        }
        throw new UnsupportedOperationException();
    }

    /**
     * Return a list with all values where all the missing values are converted to null.
     * @param line Line with the features.
     * @return A list where the missing values are converted to null.
     */
    protected List<String> getValuesWithoutMissing(String[] line){
        //TODO Complete the code
        throw new UnsupportedOperationException();
    }

    /**
     * Get the name of the columns
     * @return name of all columns
     */
    public List<String> getColumnsNames() {
        //TODO Complete the code
        throw new UnsupportedOperationException();
    }

    /**
     * Getter of field features
     * @return value of features
     */
    public  Map<String,Feature> getFeatures() {
        //TODO Complete the code
        throw new UnsupportedOperationException();
    }


    /**
     * Getter of field missingValues
     * @return value of missingValues
     */
    public List<String> getMissingValues() {
        //TODO Complete the code
        throw new UnsupportedOperationException();
    }

    /**
     * Get separator field
     * @return sep field
     */
    public char getSep(){
        //TODO Complete the code
        throw new UnsupportedOperationException();
    }

    /**
     * Get path where CSV is stored
     * @return path field
     */
    public String getPath(){
        //TODO Complete the code
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the size of the CSV (the number of rows
     * @return Number of rows in the CSV
     */
    public int getRowsNumber() {
        //TODO Complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Add or update a feature. This method should update features with a new or updated feature
     * @param feature Feature tu add to CSV or update.
     */
    public void addOrUpdateFeature(Feature feature){
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Get a feature identified by its name. If the name is not in the CSV an CSVException is raised.
     * @param name Name of the feature
     * @return A feature
     * @throws CSVException Raised when the feature is not in the CSV
     */
    public Feature getFeature(String name) throws CSVException {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    @Override
    public CSV clone() throws CloneNotSupportedException {
        Map<String, Feature> features = new HashMap<>();
        for(Map.Entry<String,Feature> feature: this.features.entrySet())
            features.put(feature.getKey(), (Feature) feature.getValue().clone());
        List<String> missingValuesCloned = new ArrayList<>(this.getMissingValues());

        try {
            return new CSV(path, sep, missingValuesCloned, features);
        } catch (Exception e) {
            throw new CloneNotSupportedException(e.getMessage());
        }
    }

    /**
     * Returns a CSV row identified by it´s position.
     * The row starts from 0, to rowNumbers, an exception is raised if the row is out of bound.
     * @param row Row to extract the value
     * @throws CSVException Raised when row less than 0 or greater than rowsNumber.
     * @return A hashMap where the key is the name of the feature and the value the value of the feature in the row
     */
    public Map<String, String> getRow(int row) throws CSVException {
        //TODO complete code
        throw new UnsupportedOperationException();
    }

    /**
     * Write the object in a file.
     * @param sep Separator to used
     * @param suffix Suffix to used when create the file. Per example "training", "removedNA".
     * @return The path where the CSV is stored.
     * @throws IOException Raised when there is a problem storing the file
     */
    public String write(char sep, String suffix) throws IOException {
        String outputPath = path.replace(".csv", "") + suffix + ".csv";

        CSVWriter writer = new CSVWriter(new FileWriter(outputPath), sep, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.NO_ESCAPE_CHARACTER, CSVWriter.DEFAULT_LINE_END);
        writer.writeNext(getColumnsNames().toArray(new String[0]));
        for(int counter= 0; counter < getRowsNumber(); counter++) {
            String[] values = new String[getColumnsNames().size()];
            for (int j = 0; j < getColumnsNames().size(); j++) {
                values[j] = getFeatures().get(getColumnsNames().get(j)).getValues().get(counter);
            }
            writer.writeNext(values);
        }
        writer.close();
        return outputPath;
    }
}
