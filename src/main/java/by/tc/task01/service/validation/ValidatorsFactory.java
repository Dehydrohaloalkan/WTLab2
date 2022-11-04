package by.tc.task01.service.validation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidatorsFactory {
    private static final ValidatorsFactory instance= new ValidatorsFactory();
    private final Map<List<String>, ValueValidator> map = new HashMap<List<String>, ValueValidator>();

    private ValidatorsFactory(){};

    public static ValidatorsFactory getInstance(){ return instance; }
    public ValueValidator getValidator(String searchCriteria) {
        for (Map.Entry<List<String>, ValueValidator> entry : map.entrySet()) {
            List<String> key = entry.getKey();
            ValueValidator value = entry.getValue();

            if (key.contains(searchCriteria))
                return value;
        }
        return null;
    }

}
