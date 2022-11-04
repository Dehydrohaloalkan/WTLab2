package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.enums.CleanerType;

public class VacuumCleaner extends Appliance{

    public int powerConsumption;
    public CleanerType cleanerType;
    public String bagType;
    public String wandType;
    public int motorSpeedRegulation;
    public int cleaningWidth;

    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.VacuumCleaner.valueOf(key)){
            case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
            case FILTER_TYPE -> cleanerType == CleanerType.valueOf((String) value);
            case BAG_TYPE -> bagType.equals(value);
            case WAND_TYPE -> wandType.equals(value);
            case MOTOR_SPEED_REGULATION -> motorSpeedRegulation == (Integer) value;
            case CLEANING_WIDTH -> cleaningWidth == (Integer) value;
        };
    }
}
