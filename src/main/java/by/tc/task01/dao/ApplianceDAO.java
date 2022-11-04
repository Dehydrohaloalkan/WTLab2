package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public interface ApplianceDAO {
	/**
	 * Finds appliance that match the given criteria
	 *
	 * @param criteria criteria that shall be matched in an appliance
	 * @return appliance that match the criteria or null is criteria is invalid
	 */
	Appliance find(Criteria criteria);
}
