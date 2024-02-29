package DataProvider.Reader.ReaderInterface;

import Model.HumanBeing.HumanBeing;
import java.util.Hashtable;

public interface Reader {
    public Hashtable<Integer, HumanBeing> read(String file_name);
}
