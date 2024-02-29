package CommandManager.Commands;

import Exceptions.EmptyValue;
import Exceptions.UnknownValue;
import Model.HumanBeing.HumanBeing;

import java.util.Hashtable;

/**
 *  Заменяет значение по ключу, если новое значение, меньше старого.
 */
public class ReplaceIfLowe {
    /**
     * @param collection текущая коллекция.
     * @param key ключ.
     * @param human новое значение.
     * @throws EmptyValue исключение, говорящее о том, что коллекция пуста.
     * @throws UnknownValue исключение, говорящее о том, что ключ не найден.
     */
    public static void command(Hashtable<Integer, HumanBeing> collection, Integer key, HumanBeing human) throws EmptyValue, UnknownValue {

        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        else if (!collection.containsKey(key))
            throw new UnknownValue("Key not found!");

        if (human.compareTo(collection.get(key)) < 0) {
            collection.remove(key);
            collection.put(key, human);
        }
    }
}
