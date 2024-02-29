package CommandManager.Commands;

import Exceptions.EmptyValue;
import Model.HumanBeing.HumanBeing;

import java.util.Hashtable;

/**
 * Выводит любой объект HumanBeing, значение поля ImpactSpeed которого максимально.
 */
public class MaxByImpactSpeed {

    /**
     * @param collection текущая коллекция
     * @return объект класса HumanBeing
     * @throws EmptyValue исключение, говорящее о том, что коллекция пуста.
     */
    public static HumanBeing command(Hashtable<Integer, HumanBeing> collection) throws EmptyValue {
        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        HumanBeing[] humans = collection.values().toArray(new HumanBeing[0]);
        HumanBeing human_with_MaxImpactSpeed = humans[0];

        for (HumanBeing human: humans) {
            if (human.getImpactSpeed() > human_with_MaxImpactSpeed.getImpactSpeed())
                human_with_MaxImpactSpeed = human;
        }

        return human_with_MaxImpactSpeed;
    }
}
