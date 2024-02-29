package CommandManager.Commands;

import Exceptions.EmptyValue;

import Model.HumanBeing.HumanBeing;

import java.util.Collection;
import java.util.Hashtable;

/**
 * Выводит объекты из коллекции.
 */
public class Show {

    /**
     * @param collection текущая коллекция.
     * @return Список объектов коллекции.
     * @throws EmptyValue исключение, говорящее о том, что коллекция пуста.
     */
    public static Collection<HumanBeing> command(Hashtable<Integer, HumanBeing> collection) throws EmptyValue {
        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        return collection.values();

    }
}
