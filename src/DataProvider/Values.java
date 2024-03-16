package DataProvider;

import java.io.File;

/**
 * Constants for working with files are stored here.
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
