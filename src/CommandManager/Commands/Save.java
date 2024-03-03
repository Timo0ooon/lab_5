package CommandManager.Commands;

import DataProvider.Writer.CSVWriter;
import Model.HumanBeing.HumanBeing;

import java.util.Hashtable;

/**
 * Save class used in CommandManager class.
 */
public class Save {

    /**
     * Method saves collection in file.
     *
     * @param collection is current collection.
     * @param file_name  name of file, where collection will be saved.
     */
    public static void command(Hashtable<Integer, HumanBeing> collection, String file_name) {
        CSVWriter writer = new CSVWriter();
        writer.write(file_name, collection);
    }
}
