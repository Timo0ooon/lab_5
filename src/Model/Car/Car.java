package Model.Car;

import Model.Car.Validator.NameValidator;
import MyScanner.MyScanner;

import javax.xml.validation.Validator;
import java.io.Serializable;

public class Car implements Serializable {
    private String name;  // Field cannot be null

    public Car() {
        this.set_car_name();
    }

    private void set_car_name() {
        NameValidator validator = new NameValidator();

        while (true) {
            System.out.println("Write car name: ");
            this.name = MyScanner.input();
            if (validator.check(this.name)) {
                break;
            }
            System.out.print("Car name can not be empty! ");
        }
    }

    @Override
    public String toString() { return "Car name: " + this.name; }
}
