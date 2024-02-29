package CommandManager.Commands;


import Exceptions.EmptyValue;
import Model.HumanBeing.HumanBeing;
import java.util.Hashtable;


/**
 * Среднее значение поля AverageOfImpactSpeed объектов коллекции.
 */
public class AverageOfImpactSpeed {

    /**
     * @param collection текущая коллекция.
     * @return среднее значение.
     * @throws EmptyValue исключение, которое говорит о том, что коллекция пустая.
     */
    public static double command(Hashtable<Integer, HumanBeing> collection) throws EmptyValue {
        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        int sumOfImpactSpeed = 0;
        int count = collection.size();

        for (HumanBeing human: collection.values()) {
            sumOfImpactSpeed += human.getImpactSpeed();
        }

        return (double) sumOfImpactSpeed/count;
    }
}
