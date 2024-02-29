package CommandManager.Commands;

import Exceptions.EmptyValue;
import Exceptions.UnknownValue;
import Model.HumanBeing.HumanBeing;
import Model.ID_Helper.ID_Helper;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Удаляет из коллекции все объекты, меньшие, чем заданный.
 */
public class RemoveLower {

    /**
     * @param collection текущая коллекция.
     * @param human_key ключ.
     * @return список удаленных объектов.
     * @throws EmptyValue исключение, говорящее о том, что коллекция пуста.
     * @throws UnknownValue исключение, говорящее о том, что ключ не найден.
     */
    public static List<HumanBeing> command(Hashtable<Integer, HumanBeing> collection,  Integer human_key) throws EmptyValue, UnknownValue {

        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        if (!collection.containsKey(human_key))
            throw new UnknownValue("Key not found!");

        List<HumanBeing> deleted_humans = new ArrayList<>();
        HumanBeing human = collection.get(human_key);
        List<Integer> id_list = new ArrayList<>();

        for (Integer key: collection.keySet()) {
            HumanBeing human_from_collection = collection.get(key);

            if (human_from_collection.compareTo(human) < 0) {

                id_list.add(human_from_collection.getId());
                deleted_humans.add(human_from_collection);
                collection.remove(key);
            }
        }

        for (Integer id: id_list) {
            ID_Helper.delete(id);
        }

        return deleted_humans;
    }
}
