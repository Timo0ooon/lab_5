package WorkingWithFiles.Reader;

import WorkingWithFiles.Reader.ReaderInterface.Reader;

import java.io.*;

/**
 * Чтение файлов с разными расширениями.
 */
public class MyReader implements Reader {

    /**
     * @param file_name имя файла.
     * @param extension перечисление .txt .csv
     * @return содержимое файла.
     */
    @Override
    public String read(String file_name, Extensions extension) {
        try ( BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file_name + extension.get())))) {


            StringBuilder string = new StringBuilder();
            String value;

            while ((value = bufferedReader.readLine()) != null) {
                string.append(value).append("\n");
            }

            return String.valueOf(string);

        }

        catch (IOException e) {
            System.out.print("\nError with file! File: " + file_name + extension.get() + "\n");
        }
        return null;
    }
}
