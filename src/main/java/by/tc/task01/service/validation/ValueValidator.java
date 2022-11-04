package by.tc.task01.service.validation;

public interface ValueValidator {
    /**
     * Validates single value
     * @param obj value to validate
     * @return true is value is valid, false otherwise
     */
    boolean validate(Object obj);
}
