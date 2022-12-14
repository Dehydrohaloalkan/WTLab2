package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance{

    public double batteryCapacity;
    public String os;
    public int memoryRom;
    public int systemMemory;
    public double cpu;
    public int displayInchs;
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.Laptop.valueOf(key)){
            case BATTERY_CAPACITY -> batteryCapacity == Double.parseDouble(String.valueOf(value));
            case OS -> os.equals(value);
            case MEMORY_ROM -> memoryRom == (Integer) value;
            case SYSTEM_MEMORY -> systemMemory == (Integer) value;
            case CPU -> cpu == Double.parseDouble(String.valueOf(value));
            case DISPLAY_INCHS -> displayInchs == (Integer) value;
        };
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "battery capacity=" + batteryCapacity +
                ", os='" + os + '\'' +
                ", memory ROM=" + memoryRom +
                ", system memory=" + systemMemory +
                ", cpu=" + cpu +
                ", display Inchs=" + displayInchs +
                '}';
    }
}
