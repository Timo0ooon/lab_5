package DataProvider.Reader;

import DataProvider.Reader.ReaderInterface.Reader;
import DataProvider.Values;
import Model.HumanBeing.HumanBeing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Hashtable;

/**
 * Чтение коллекции из csv файла.
 */
public class CSVReader implements Reader {
    public static final String file_extension = ".csv";

    /**
     * Чтение из файла.
     * @param file_name имя файла.
     * @return коллекция объектов HumanBeing
     */
    @Override
    public Hashtable<Integer, HumanBeing> read(String file_name) {
        String path = "" + Values.root_folder + Values.separator + Values.folder + Values.separator + file_name + file_extension;

        try (ObjectInputStream objectIn =  new ObjectInputStream(new FileInputStream(path))) {

            Hashtable<Integer, HumanBeing> collection = (Hashtable<Integer, HumanBeing>) objectIn.readObject();

            return collection;

        }
        catch (FileNotFoundException e) {
            System.out.println("\nFile not found!\n");
        }
        catch (IOException e) {
            System.out.println("\nFile cannot be read!\n");
        }
        catch (Exception e) {
            System.out.println("\nUnknown error!\n");
        }
        return null;
    }
}
