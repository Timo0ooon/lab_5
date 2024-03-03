package CollectionManager.Interfaces;

import Model.HumanBeing.HumanBeing;

/**
 * RemoveKey interface is used in CollectionManager.
 */
public interface RemoveKey {

    /**
     * Method deletes object.
     *
     * @param key of the object that will be deleted.
     * @return deleted object.
     */
    public HumanBeing removeKey(Integer key);
}
