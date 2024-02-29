package Main;

import java.io.File;

import DataProvider.Reader.CSVReader;
import DataProvider.Values;

/**
 * Проверяется наличие файла в папке Data.
 */
public class FileValidator {
    public static boolean check(String file_name) {
        try {
            File file = new File(Values.root_folder.get() + Values.separator.get() + Values.folder.get() + Values.separator.get() + file_name + CSVReader.file_extension);
            return file.isFile() && file.getName().replaceAll(CSVReader.file_extension, "").equals(file_name);
        }

        catch (Exception e) {
            System.out.println("\nUnknown command!\n");
        }

        return false;
    }
}