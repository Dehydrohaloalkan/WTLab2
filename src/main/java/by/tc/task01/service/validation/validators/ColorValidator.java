package by.tc.task01.service.validation.validators;

import by.tc.task01.entity.enums.PCColor;
import by.tc.task01.service.validation.ValueValidator;

public class ColorValidator implements ValueValidator {
    @Override
    public boolean validate(Object obj) {
        try{
            PCColor.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
