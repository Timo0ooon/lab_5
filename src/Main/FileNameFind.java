package Main;

/**
 * Находит имя файла в args.
 */
public class FileNameFind {
    public static String find(String[] values) {

        if (values != null && values.length == 1) {
            return values[0];
        }
        return null;
    }
}
