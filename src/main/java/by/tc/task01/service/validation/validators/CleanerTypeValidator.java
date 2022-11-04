package by.tc.task01.service.validation.validators;

import by.tc.task01.entity.enums.CleanerType;
import by.tc.task01.service.validation.ValueValidator;

public class CleanerTypeValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try{
            CleanerType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
