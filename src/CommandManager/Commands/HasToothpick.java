package CommandManager.Commands;

import Exceptions.EmptyValue;
import Model.HumanBeing.HumanBeing;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Выводит объекты коллекции, у которых значения поля hasToothpick - true.
 */
public class HasToothpick {

    /**
     * @param collection текущая коллекция.
     * @return список объектов.
     * @throws EmptyValue исключение, говорящее о том, что коллекция пуста.
     */
    public static List<HumanBeing> command(Hashtable<Integer, HumanBeing> collection) throws EmptyValue {
        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        List<HumanBeing> human_list_HasToothpick = new ArrayList<>();

        for (HumanBeing human: collection.values()) {
            if (human.getHasToothpick())
                human_list_HasToothpick.add(human);
        }

        return human_list_HasToothpick;
    };
}
