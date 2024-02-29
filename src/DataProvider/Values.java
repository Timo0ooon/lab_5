package DataProvider;

import java.io.File;

/**
 * Здесь хранятся константы для работы с файлами.
 */
public enum Values {
    root_folder("src"), separator(File.separator), folder("Data");

    private final String value;

    Values(String value) {
        this.value = value;
    }


    public String get() {
        return this.value;
    }


    @Override
    public String toString() {
        return this.value;
    }
}
