package CollectionManager.Interfaces;

import Model.HumanBeing.HumanBeing;

import java.util.List;

/**
 * RemoveGreater interface is used in CollectionManager class.
 */
public interface RemoveGreater {

    /**
     * Method deletes all objects larger than the specified one.
     *
     * @param key of comparison object.
     * @return List of deleted objects.
     */
    public List<HumanBeing> removeGreater(Integer key);
}
