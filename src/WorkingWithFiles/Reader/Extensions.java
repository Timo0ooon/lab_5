package WorkingWithFiles.Reader;

/**
 * Константы для работы с расширениями файлов.
 */
public enum Extensions {
    txt(".txt"), csv(".csv");

    private final String value;
    Extensions(String value) {
        this.value = value;
    }

    public String get() {
        return this.value;
    }
}
