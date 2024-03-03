package DataProvider.Writer.WriterInterface;

import Model.HumanBeing.HumanBeing;

import java.util.Hashtable;

/**
 * Writer interface.
 */
public interface Writer {
    /**
     * Method must write data ro file.
     *
     * @param file_name  is name of file
     * @param collection which is written to the file
     */
    public void write(String file_name, Hashtable<Integer, HumanBeing> collection);
}
