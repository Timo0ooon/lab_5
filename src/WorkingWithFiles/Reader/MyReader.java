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
     * @throws IOException ошибка ввода-вывода файла.
     */
    @Override
    public String read(String file_name, Extensions extension) throws IOException {
        FileInputStream file = new FileInputStream(file_name + extension.get());
        InputStreamReader reader = new InputStreamReader(file);
        BufferedReader buffered_reader = new BufferedReader(reader);
        String value;
        StringBuilder string = new StringBuilder();

        while ((value = buffered_reader.readLine()) != null) {
            string.append(value).append("\n");
        }

        return String.valueOf(string);
    }
}
