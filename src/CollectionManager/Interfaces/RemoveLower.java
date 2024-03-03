package CollectionManager.Interfaces;

import Model.HumanBeing.HumanBeing;

import java.util.List;

/**
 * RemoveLower interface is used in CollectionManager class.
 */
public interface RemoveLower {

    /**
     * Method deletes all objects lower than the specified one.
     *
     * @param key of comparison object.
     * @return List of deleted objects.
     */
    public List<HumanBeing> removeLower(Integer key);
}
