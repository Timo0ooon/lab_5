package CommandManager.Commands;

import Exceptions.UnknownValue;
import Model.HumanBeing.HumanBeing;
import Model.ID_Helper.ID_Helper;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Удаляет элемент коллекции по заданному ключу.
 */
public class RemoveKey {

    /**
     * @param collection текущая коллекция.
     * @param key ключ.
     * @return Удаленное из коллекции значение.
     * @throws UnknownValue исключение, говорящее о том, что в коллекции нет такого ключа.
     */
    public static HumanBeing command(Hashtable<Integer, HumanBeing> collection, Integer key) throws UnknownValue {

        if (!collection.containsKey(key))
            throw new UnknownValue("Key not found");

        ID_Helper.delete(collection.get(key).getId());
        return collection.remove(key);
    }
}
