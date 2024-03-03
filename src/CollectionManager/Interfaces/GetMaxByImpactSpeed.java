package CollectionManager.Interfaces;

import Model.HumanBeing.HumanBeing;

/**
 * GetMaxByImpactSpeed is used in CollectionManager class.
 */
public interface GetMaxByImpactSpeed {

    /**
     * Method searches for an object with the maximum ImpactSpeed field value.
     *
     * @return HumanBeing object from collection with max ImpactSpeed.
     */
    public HumanBeing getMaxByImpactSpeed();
}
