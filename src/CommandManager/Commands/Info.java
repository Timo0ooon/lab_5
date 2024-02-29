package CommandManager.Commands;

import Exceptions.EmptyValue;
import Model.HumanBeing.HumanBeing;

import java.time.LocalDate;
import java.util.Hashtable;

/**
 * Выводит тип коллекции, размер и последний день редактирования.
 */
public class Info {

    /**
     * @param collection текущая коллекция.
     * @return строку с информацией.
     * @throws EmptyValue исключение, говорящее о том, что коллекция пуста.
     */
    public static String command(Hashtable<Integer, HumanBeing> collection) throws EmptyValue {
        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        StringBuilder info = new StringBuilder();
        HumanBeing[] values = collection.values().toArray(new HumanBeing[0]);
        LocalDate LastDate = values[0].getCreationDate();

        info.append("\nType of collection: ").append(collection.getClass()).append("\n");
        info.append("Size: ").append(collection.size()).append("\n");

        for (HumanBeing human: values) {
            if (LastDate.isBefore(human.getCreationDate()))
                LastDate = human.getCreationDate();
        }

        info.append("Last day of editing: ").append(LastDate).append("\n");

        return String.valueOf(info);
    }
}
