package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

public class Criteria {

	private String groupSearchName;
	private Map<String, Object> criteria = new HashMap<String, Object>();
	/**
	 * Gets the search criteria
	 */
	public Map<String, Object> getCriteria() {
		return criteria;
	}
	/**
	 * Instantiates object of a type Criteria
	 *
	 * @param groupSearchName search type
	 */
	public Criteria(String groupSearchName) {
		this.groupSearchName = groupSearchName;
	}
	/**
	 * Gets the search type
	 */
	public String getGroupSearchName() {
		return groupSearchName;
	}
	/**
	 * Add new search criteria
	 */
	public void add(String searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}
}
