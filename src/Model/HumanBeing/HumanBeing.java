package Model.HumanBeing;

import Exceptions.DuplicateValue;
import Model.Car.Car;
import Model.Car.Validator.NameValidator;
import Model.Coordinates.Coordinates;
import Model.HumanBeing.Validators.ImpactSpeedValidator;

import Model.ID_Helper.ID_Helper;
import MyScanner.MyScanner;

import Enums.Mood;
import Enums.WeaponType;

import java.io.Serializable;

import java.time.LocalDate;


public class HumanBeing implements Comparable<HumanBeing>, Serializable {

    private Integer id;  // Field can not be null. Value must be greater than 0. Value must be unique, The value should be generated automatically.
    private String name;  // Field can not be null. Value can not be empty line.
    private Coordinates coordinates;  // Field can not be null.
    private LocalDate creationDate;  // Field can not be null. The value should be generated automatically.
    private Boolean realHero;  // Field can not be null.
    private Boolean hasToothpick;  // Field can not be null.
    private Integer impactSpeed;  // Value must be greater than -355. Field can not be null.
    private WeaponType weaponType;  // Field can not be null.
    private Mood mood;  // Field can not be null.
    private Car car;  // Field can not be null.

    public HumanBeing() {
        this.setName();
        this.setCoordinates();
        this.setDate();
        this.setRealHero();
        this.setHasToothpick();
        this.setImpactSpeed();
        this.setWeaponType();
        this.setMood();
        this.setCar();
    }

    private void setName() {
        NameValidator validator = new NameValidator();

        while (true) {

            System.out.println("Write name:");
            this.name = MyScanner.input();

            if (validator.check(this.name))
                break;

            System.out.print("Name can not be empty! ");

        }
    }

    private void setCoordinates() {
        this.coordinates = new Coordinates();
    }

    private void setDate() {
        this.creationDate = LocalDate.now();
    }

    private void setRealHero() {
        while (true) {
            System.out.println("Is this person real? Write true or false: ");
            String user_line = MyScanner.input();
            if (user_line.trim().equalsIgnoreCase("false")) {
                this.realHero = false;
                break;
            }
            else if (user_line.trim().equalsIgnoreCase("true")) {
                this.realHero = true;
                break;
            }
            else {
                System.out.print("Write values: true of false! ");
            }
        }
    }

    private void setHasToothpick() {
        while (true) {

            System.out.println("Does this person have a toothpick? Write true or false: ");

            String user_line = MyScanner.input();
            if (user_line.trim().equalsIgnoreCase("false")) {
                this.hasToothpick = false;
                break;
            }
            else if (user_line.trim().equalsIgnoreCase("true")) {
                this.hasToothpick = true;
                break;
            }
            else {
                System.out.print("Write values: true of false! ");
            }
        }
    }

    private void setImpactSpeed() {
        ImpactSpeedValidator validator = new ImpactSpeedValidator();
        while (true) {
            try {
                System.out.println("Write impactSpeed: ");
                this.impactSpeed = Integer.parseInt(MyScanner.input());
                if (validator.check(this.impactSpeed)) {
                    break;
                }
                System.out.print("Value must be greater than or equal to " + validator.value + "! ");
            }

            catch(NumberFormatException e) {
                System.out.print("Value must be integer! ");
            }
        }
    }

    private void setWeaponType() {
        while (true) {
            StringBuilder sentence = new StringBuilder("Select the number from this list that you want to set:\n");
            WeaponType[] values = WeaponType.values();

            for (int i = 0; i < values.length; i++) {
                sentence.append(i+1).append(". ").append(values[i].toString());
                if (i != values.length - 1)
                    sentence.append("\n");
            }
            System.out.println(sentence);

            try {
                int user_value = Integer.parseInt(MyScanner.input());
                if ((1 <= user_value) && (user_value <= values.length)) {
                    this.weaponType = values[user_value - 1];
                    break;
                }
                System.out.print("Value must be greater than 1 and less than " + values.length + ". ");
            }

            catch (NumberFormatException e) {
                System.out.print("Value must be integer! ");
            }
        }
    }

    private void setMood() {
        while (true) {
            StringBuilder sentence = new StringBuilder("Select the number from this list that you want to set:\n");
            Mood[] values = Mood.values();

            for (int i = 0; i < values.length; i++) {
                sentence.append(i + 1).append(". ").append(values[i].toString());
                if (i != values.length - 1)
                    sentence.append("\n");
            }
            System.out.println(sentence);

            try {
                int user_value = Integer.parseInt(MyScanner.input());
                if ((1 <= user_value) && (user_value <= values.length)) {
                    this.mood = values[user_value - 1];
                    break;
                }
                System.out.print("Value must be greater than 1 and less than " + values.length + ". ");
            }

            catch (NumberFormatException e) {
                System.out.print("Value must be integer! ");
            }
        }
    }

    private void setCar() {
        this.car = new Car();
    }

    public void setId(Integer id) throws DuplicateValue {
        if (!ID_Helper.id_list.contains(id)) {
            ID_Helper.addId(id);
            this.id = id;
        }
        else { throw new DuplicateValue("\nID must be unique!\n"); }
    }

    public Integer getId() {return this.id; }

    public Integer getImpactSpeed() { return this.impactSpeed; }

    public LocalDate getCreationDate() { return this.creationDate; }

    public boolean getHasToothpick() { return this.hasToothpick; }



    @Override
    public String toString() {
        return "Id: " + this.id + "\n" + "Name: " + this.name + "\n" + this.coordinates + "\n" + "Date: " + this.creationDate +
                "\n" + "realHero: " + this.realHero + "\n" + "hasToothpick: " + this.hasToothpick + "\n" + "ImpactSpeed: " +
                this.impactSpeed + "\n" + "WeaponType: " + this.weaponType + "\n" + "Mood: " + this.mood + "\n" + this.car;
    }

    @Override
    public int compareTo(HumanBeing other_human) {
        return this.id.compareTo(other_human.getId());
    }

    public static void main(String[] args) {
        HumanBeing h = new HumanBeing();
        System.out.println(h);
    }

}
