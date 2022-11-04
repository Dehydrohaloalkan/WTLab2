package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.enums.PCColor;

import javax.swing.plaf.synth.ColorType;

public class TabletPC extends Appliance{

    public int batteryCapacity;
    public int displayInches;
    public int memoryRom;
    public int flashMemoryCapacity;
    public PCColor color;
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.TabletPC.valueOf(key)){
            case BATTERY_CAPACITY -> batteryCapacity == (Integer) value;
            case DISPLAY_INCHES -> displayInches ==  (Integer) value;
            case MEMORY_ROM -> memoryRom == (Integer) value;
            case FLASH_MEMORY_CAPACITY -> flashMemoryCapacity == (Integer) value;
            case COLOR -> color == PCColor.valueOf((String) value);
        };
    }

    @Override
    public String toString() {
        return "Tablet PC{" +
                "battery capacity=" + batteryCapacity +
                ", display Inches=" + displayInches +
                ", memory ROM=" + memoryRom +
                ", flash memory capacity=" + flashMemoryCapacity +
                ", color=" + color +
                '}';
    }
}
