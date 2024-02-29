package CommandManager.Commands;

import Exceptions.DuplicateValue;
import Model.HumanBeing.HumanBeing;
import Model.ID_Helper.ID_Helper;

import java.util.Hashtable;

/**
 * Добавляет новый элемент с заданным ключом.
 */
public class Insert {

    /**
     * @param collection текущая коллекция.
     * @param key ключ.
     * @throws DuplicateValue исключение, говорящее о том, что ключ уже есть в коллекции.
     */
    public static void command(Hashtable<Integer, HumanBeing> collection, Integer key) throws DuplicateValue {
        if (collection.containsKey(key))
            throw new DuplicateValue("\nThe key is not unique!\n");

        System.out.println();

        HumanBeing human = new HumanBeing();
        human.setId(ID_Helper.generate());

        collection.put(key, human);
    }
}
