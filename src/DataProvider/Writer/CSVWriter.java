package DataProvider.Writer;

import DataProvider.Values;
import DataProvider.Writer.WriterInterface.Writer;
import Model.HumanBeing.HumanBeing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

/**
 * Записывает в файл коллекцию.
 */
public class CSVWriter implements Writer {
    public final String file_extension = ".csv";

    /**
     * Запись в файл.
     * @param file_name имя файла.
     * @param collection текущая коллекция.
     */
    @Override
    public void write(String file_name, Hashtable<Integer, HumanBeing> collection) {
        try {
            String path = "" + Values.root_folder + Values.separator + Values.folder + Values.separator + file_name + this.file_extension;
            FileOutputStream file = new FileOutputStream(path);

            ObjectOutputStream objectOut = new ObjectOutputStream(file);
            objectOut.writeObject(collection);

            objectOut.close();

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
