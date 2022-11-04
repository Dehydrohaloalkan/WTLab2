package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Speakers extends Appliance{

    public int powerConsumption;
    public int numberOfSpeakers;
    public String frequencyRange;
    public int cordLength;

    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Speakers.valueOf(key)){
            case POWER_CONSUMPTION -> powerConsumption == (Integer) value;
            case NUMBER_OF_SPEAKERS -> numberOfSpeakers ==  (Integer) value;
            case FREQUENCY_RANGE -> frequencyRange.equals(value);
            case CORD_LENGTH -> cordLength == (Integer) value;
        };
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "power consumption=" + powerConsumption +
                ", number of speakers=" + numberOfSpeakers +
                ", frequency range='" + frequencyRange + '\'' +
                ", cord length=" + cordLength +
                '}';
    }
}
