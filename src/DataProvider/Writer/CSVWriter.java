package DataProvider.Writer;

import DataProvider.Values;
import DataProvider.Writer.WriterInterface.Writer;
import Model.HumanBeing.HumanBeing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

/**
 * CSVWriter class
 */
public class CSVWriter implements Writer {
    public final String file_extension = ".csv";

    /**
     * Method writes data to file.
     *
     * @param file_name  is name of file.
     * @param collection current collection.
     */
    @Override
    public void write(String file_name, Hashtable<Integer, HumanBeing> collection) {
        String path = "" + Values.root_folder + Values.separator + Values.folder + Values.separator + file_name + this.file_extension;

        try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(path))) {
            objectOut.writeObject(collection);

        }

        catch (IOException e) {
            System.out.println("\nFile can not be written!\n");
        }

        catch (Exception e) {
            System.out.println("\nUnknown error!\n");
        }

        finally {
            System.out.println("\nCollection saved!\n");
        }
    }
}
