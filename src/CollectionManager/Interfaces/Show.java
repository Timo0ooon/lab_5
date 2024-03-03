package CollectionManager.Interfaces;

import Model.HumanBeing.HumanBeing;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Show interface is used in CollectionManager.
 */
public interface Show {

    /**
     * Method collects a new collection of objects.
     *
     * @return Collection of objects in Hashtable without keys.
     */
    public Collection<HumanBeing> show();
}
