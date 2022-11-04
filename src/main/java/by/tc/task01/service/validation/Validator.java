package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		if (criteria == null ||
				criteria.getCriteria() == null)
			return false;

		for (Map.Entry<String, Object> entry : criteria.getCriteria().entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();

			ValueValidator validator = ValidatorsFactory.getInstance().getValidator(key);
			boolean isValid = true;
			isValid = validator.validate(value);
			if (!isValid)
				return false;
		}

		return true;
	}

}

// TODO you may add your own new classes