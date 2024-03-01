package Model.ID_Helper;

import DataProvider.Reader.CSVReader;

import Exceptions.DuplicateValue;
import Main.Main;
import Model.HumanBeing.HumanBeing;

import java.util.ArrayList;


public class ID_Helper {
    public static final ArrayList<Integer> id_list = new ArrayList<>();

    static  {
        CSVReader reader = new CSVReader();

        try {
            for (HumanBeing human : reader.read(System.getProperty(Main.value)).values()) {
                id_list.add(human.getId());
            }
        }

        catch (Exception e) {
            System.out.println("\nUnknown error!\n");
        }
    }

    public static Integer generate() {
        if (id_list.isEmpty()) {
            return 0;
        }

        else {
            Integer max_value = Integer.MIN_VALUE;
            for (Integer id: id_list) {
                if (id > max_value)
                    max_value = id;
            }
            return max_value + 1;
        }
    }

    public static void delete(Integer id) {
        id_list.remove(id);
    }

    public static void addId(Integer id) {
        if (!id_list.contains(id)) {
            id_list.add(id);
        }
        else {
            throw new DuplicateValue("\nValue is not unique!\n");
        }
    }

}
