package Model.Coordinates.Validators;

import Model.ValidatorInterface.NumberValidator;


public class YCoordinateValidator implements NumberValidator {
    public final Long value = -507L;
    @Override
    public boolean check(Number value) {
        return (Long) value > this.value;
    }
}
