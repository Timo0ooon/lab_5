package Model.HumanBeing.Validators;

import Model.ValidatorInterface.StringValidator;


public class NameValidator implements StringValidator {
    @Override
    public boolean check(String user_string) {
        return (!user_string.replaceAll(" ", "").isEmpty());
    }
}
