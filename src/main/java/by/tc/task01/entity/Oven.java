package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance{

    public int powerConsumption;
    public int weight;
    public int capacity;
    public int depth;
    public double height;
    public double width;
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Oven.valueOf(key)){
            case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
            case WEIGHT -> weight ==  (Integer) value;
            case CAPACITY -> capacity == (Integer) value;
            case DEPTH -> depth == (Integer) value;
            case HEIGHT -> height == Double.parseDouble(String.valueOf(value));
            case WIDTH -> width == Double.parseDouble(String.valueOf(value));
        };
    }

    @Override
    public String toString() {
        return "Oven{" +
                "power consumption=" + powerConsumption +
                ", weight=" + weight +
                ", capacity=" + capacity +
                ", depth=" + depth +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
