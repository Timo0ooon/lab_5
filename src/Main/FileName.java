package Main;

/**
 * Здесь хранится имя файла, чтобы оно использовалось в других классах
 */
public class FileName {
    private static String file_name;

    public static void set(String my_file_name) {
        file_name = my_file_name;
    }

    public static String get() {
        return file_name;
    }
}
