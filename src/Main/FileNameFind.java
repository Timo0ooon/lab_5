package Main;

/**
 * FileNameFind class.
 */
public class FileNameFind {

    /**
     * Method finds the filename in args.
     *
     * @param values String[] args from main
     * @return name of file where work with the collection will continue
     */
    public static String find(String[] values) {

        if (values != null && values.length == 1) {
            return values[0];
        }
        return null;
    }
}
