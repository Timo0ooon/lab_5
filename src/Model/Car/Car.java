package Model.Car;

import Model.ValidatorInterface.StringValidator;
import MyScanner.MyScanner;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;  // Field cannot be null

    public Car() {
        this.set_car_name((String name) -> !name.replaceAll(" ", "").isEmpty());
    }

    private void set_car_name(StringValidator validator) {

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
