package CommandManager.Commands;

import DataProvider.Writer.CSVWriter;
import Model.HumanBeing.HumanBeing;

import java.util.Hashtable;

/**
 * Сохраняет коллекцию в файл.
 */
public class Save {

    /**
     * @param collection текущая коллекция
     * @param file_name имя файла в папке Data, которое вводится как параметр переменной окружения.
     */
    public static void command(Hashtable<Integer, HumanBeing> collection, String file_name) {
        CSVWriter writer = new CSVWriter();
        writer.write(file_name, collection);
    }
}
