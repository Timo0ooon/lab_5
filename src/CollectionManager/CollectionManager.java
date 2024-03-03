package CollectionManager;

import CollectionManager.Interfaces.*;

import DataProvider.Reader.CSVReader;

import Exceptions.DuplicateValue;
import Exceptions.EmptyValue;
import Exceptions.UnknownValue;

import Main.Main;

import Model.HumanBeing.HumanBeing;
import Model.ID_Helper.ID_Helper;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

/**
 * CollectionManager needed for collection management.
 */
public class CollectionManager implements Clear, GetAverageOfImpactSpeed, GetMaxByImpactSpeed, HasToothPick, Insert, RemoveGreater,
        RemoveKey, RemoveLower, ReplaceIfLowe, Show, UpdateID, Info {
    private Hashtable<Integer, HumanBeing> collection;

    public CollectionManager() {

        CSVReader reader = new CSVReader();
        String file_name = System.getProperty(Main.value);
        this.collection = reader.read(file_name);

        if (this.collection == null)
            this.collection = new Hashtable<>();

    }

    public Hashtable<Integer, HumanBeing> get() {
        return this.collection;
    }

    @Override
    public Collection<HumanBeing> show() throws EmptyValue {

        if (collection.isEmpty())
            throw new EmptyValue("Collection is Empty!");

        return this.collection.values();
    }

    @Override
    public boolean insert(Integer key) throws DuplicateValue {

        if (this.collection.containsKey(key))
            throw new DuplicateValue("\nThe key is not unique!\n");

        System.out.println();

        HumanBeing human = new HumanBeing();
        human.setId(ID_Helper.generate());

        this.collection.put(key, human);

        return true;
    }

    @Override
    public void updateID(Integer id) throws UnknownValue, EmptyValue {

        if (!ID_Helper.id_list.contains(id))
            throw new UnknownValue("\nId not found!\n");

        if (this.collection.isEmpty())
            throw new EmptyValue("\nEmpty value!\n");

        for (Integer key : this.collection.keySet()) {
            HumanBeing human = this.collection.get(key);

            if (human.getId().equals(id)) {
                ID_Helper.delete(id);
                this.removeKey(key);

                HumanBeing new_human = new HumanBeing();
                new_human.setId(id);

                this.collection.put(key, new_human);

                break;

            }
        }
    }

    @Override
    public HumanBeing removeKey(Integer key) throws UnknownValue {

        if (!this.collection.containsKey(key))
            throw new UnknownValue("\nKey not found!\n");

        ID_Helper.delete(this.collection.get(key).getId());

        return this.collection.remove(key);
    }

    @Override
    public boolean clear() throws EmptyValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is empty!\n");

        List<Integer> key_list = new ArrayList<>(this.collection.keySet());
        for (Integer my_key : key_list) {
            ID_Helper.delete(this.collection.get(my_key).getId());
        }

        this.collection.clear();

        return true;
    }

    @Override
    public List<HumanBeing> removeGreater(Integer key) throws EmptyValue, UnknownValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is Empty!\n");

        if (!this.collection.containsKey(key))
            throw new UnknownValue("\nKey not found!\n");

        List<HumanBeing> deleted_humans = new ArrayList<>();
        HumanBeing human = this.collection.get(key);
        List<Integer> id_list = new ArrayList<>();

        for (Integer human_key : this.collection.keySet()) {
            HumanBeing human_from_collection = this.collection.get(human_key);

            if (human_from_collection.compareTo(human) > 0) {

                id_list.add(human_from_collection.getId());
                deleted_humans.add(human_from_collection);
                this.removeKey(human_key);
            }
        }

        for (Integer id : id_list) {
            ID_Helper.delete(id);
        }

        return deleted_humans;
    }

    @Override
    public List<HumanBeing> removeLower(Integer key) throws EmptyValue, UnknownValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is Empty!\n");

        if (!this.collection.containsKey(key))
            throw new UnknownValue("\nKey not found!\n");

        List<HumanBeing> deleted_humans = new ArrayList<>();
        HumanBeing human = this.collection.get(key);
        List<Integer> id_list = new ArrayList<>();

        for (Integer human_key : this.collection.keySet()) {
            HumanBeing human_from_collection = this.collection.get(human_key);

            if (human_from_collection.compareTo(human) < 0) {

                id_list.add(human_from_collection.getId());
                deleted_humans.add(human_from_collection);
                this.removeKey(human_key);
            }
        }

        for (Integer id : id_list) {
            ID_Helper.delete(id);
        }

        return deleted_humans;
    }

    @Override
    public void replaceIfLowe(HumanBeing human, Integer key) throws EmptyValue, UnknownValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is Empty!\n");

        else if (!this.collection.containsKey(key))
            throw new UnknownValue("\nKey not found!\n");

        if (human.compareTo(this.collection.get(key)) < 0) {
            this.removeKey(key);
            this.collection.put(key, human);
        }

    }

    @Override
    public double getAverageOfImpactSpeed() throws EmptyValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is Empty!\n");

        int sumOfImpactSpeed = 0;
        int count = this.collection.size();

        for (HumanBeing human : this.collection.values()) {
            sumOfImpactSpeed += human.getImpactSpeed();
        }

        return (double) sumOfImpactSpeed / count;
    }

    @Override
    public List<HumanBeing> hasToothPick() throws EmptyValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is Empty!\n");

        List<HumanBeing> human_list_HasToothpick = new ArrayList<>();

        for (HumanBeing human : this.collection.values()) {
            if (human.getHasToothpick())
                human_list_HasToothpick.add(human);
        }

        return human_list_HasToothpick;
    }

    @Override
    public HumanBeing getMaxByImpactSpeed() throws EmptyValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is Empty!\n");

        HumanBeing[] humans = this.collection.values().toArray(new HumanBeing[0]);
        HumanBeing human_with_MaxImpactSpeed = humans[0];

        for (HumanBeing human : humans) {
            if (human.getImpactSpeed() > human_with_MaxImpactSpeed.getImpactSpeed())
                human_with_MaxImpactSpeed = human;
        }

        return human_with_MaxImpactSpeed;
    }

    @Override
    public String getInfo() throws EmptyValue {

        if (this.collection.isEmpty())
            throw new EmptyValue("\nCollection is Empty!\n");

        StringBuilder info = new StringBuilder();
        HumanBeing[] values = this.collection.values().toArray(new HumanBeing[0]);
        LocalDate LastDate = values[0].getCreationDate();

        info.append("\nType of collection: ").append(this.collection.getClass()).append("\n");
        info.append("Size: ").append(this.collection.size()).append("\n");

        for (HumanBeing human : values) {
            if (LastDate.isBefore(human.getCreationDate()))
                LastDate = human.getCreationDate();
        }

        info.append("Last day of editing: ").append(LastDate).append("\n");

        return String.valueOf(info);
    }
}
