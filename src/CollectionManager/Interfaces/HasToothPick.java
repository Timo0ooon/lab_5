package CollectionManager.Interfaces;

import Model.HumanBeing.HumanBeing;

import java.util.List;

/**
 * HasToothPick interface is used in CollectionManager class.
 */
public interface HasToothPick {

    /**
     * Method searches for an HumanBeing objects where hasToothPick field is true.
     *
     * @return List with objects.
     */
    public List<HumanBeing> hasToothPick();
}
