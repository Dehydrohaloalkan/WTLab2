package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance{

    public int powerConsumption;
    public int weight;
    public int freezerCapacity;
    public double overallCapacity;
    public double height;
    public double width;
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Refrigerator.valueOf(key)){
            case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
            case WEIGHT -> weight ==  (Integer) value;
            case FREEZER_CAPACITY -> freezerCapacity == (Integer) value;
            case OVERALL_CAPACITY -> overallCapacity == Double.parseDouble(String.valueOf(value));
            case HEIGHT -> height == Double.parseDouble(String.valueOf(value));
            case WIDTH -> width == Double.parseDouble(String.valueOf(value));
        };
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "power consumption=" + powerConsumption +
                ", weight=" + weight +
                ", freezer capacity=" + freezerCapacity +
                ", overall capacity=" + overallCapacity +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
