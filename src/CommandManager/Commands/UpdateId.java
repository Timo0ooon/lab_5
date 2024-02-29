package CommandManager.Commands;

import Exceptions.EmptyValue;
import Exceptions.UnknownValue;
import Model.HumanBeing.HumanBeing;
import Model.ID_Helper.ID_Helper;

import java.util.Hashtable;
import java.util.Objects;

/**
 * Обновляет значение элемента коллекции, id которого равен заданному.
 */
public class UpdateId {

    /**
     * @param collection текущая коллекция.
     * @param id id, по которому будет меняться поля.
     * @throws UnknownValue исключение, говорящее о том, что id не существует.
     * @throws EmptyValue исключение, говорящее о том, что коллекция пуста.
     */
    public static void command(Hashtable<Integer, HumanBeing> collection, Integer id) throws UnknownValue, EmptyValue {

        if (!ID_Helper.id_list.contains(id))
            throw new UnknownValue("\nId not found!\n");

        if (collection.isEmpty())
            throw new EmptyValue("\nEmpty value!\n");

        for (Integer key: collection.keySet()) {
            HumanBeing human = collection.get(key);

            if (human.getId().equals(id)) {
                ID_Helper.delete(id);
                RemoveKey.command(collection, key);

                HumanBeing new_human = new HumanBeing();
                new_human.setId(id);

                collection.put(key, new_human);

            }
        }
    }
}
