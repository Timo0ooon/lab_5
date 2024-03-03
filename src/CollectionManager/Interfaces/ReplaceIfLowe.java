package CollectionManager.Interfaces;

import Model.HumanBeing.HumanBeing;

/**
 * ReplaceIfLowe interface is used in CollectionManager class.
 */
public interface ReplaceIfLowe {

    /**
     * Method replace new object if old objects is lower.
     *
     * @param human is comparison object.
     * @param key   of old object.
     */
    public void replaceIfLowe(HumanBeing human, Integer key);
}
