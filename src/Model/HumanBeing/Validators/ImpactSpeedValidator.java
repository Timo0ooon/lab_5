package Model.HumanBeing.Validators;

import Model.ValidatorInterface.NumberValidator;

public class ImpactSpeedValidator implements NumberValidator {
    public final int value = -355;
    @Override
    public boolean check(Number value) {
        return ((int) value >= -355);
    }
}
