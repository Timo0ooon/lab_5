package DataProvider.Writer.WriterInterface;

import Model.HumanBeing.HumanBeing;
import java.util.Hashtable;

public interface Writer {
    public void write(String file_name, Hashtable<Integer, HumanBeing> collection);
}
