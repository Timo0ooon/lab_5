package CommandManager.Commands;

import Exceptions.EmptyValue;
import Model.HumanBeing.HumanBeing;
import Model.ID_Helper.ID_Helper;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Очищает коллекцию.
 */
public class Clear {

    /**
     *
     * @param collection текущая коллекция.
     * @throws EmptyValue исключение, которое говорит о том, что коллекция пуста.
     */
    public static void command(Hashtable<Integer, HumanBeing> collection) throws EmptyValue {

        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        List<Integer> key_list = new ArrayList<> (collection.keySet());
        for (Integer my_key: key_list) {
            ID_Helper.delete(collection.get(my_key).getId());
        }

        collection.clear();

    }
}
