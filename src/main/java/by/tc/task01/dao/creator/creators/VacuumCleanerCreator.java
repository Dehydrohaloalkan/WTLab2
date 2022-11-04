package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.enums.CleanerType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VacuumCleanerCreator implements ApplianceCreator {
    /**
     * Represent creator of a vacuumCleaner appliance
     */
    @Override
    public Appliance create(NodeList nodes) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> vacuumCleaner.powerConsumption = Integer.parseInt(text);
                    case "filterType" -> vacuumCleaner.cleanerType = CleanerType.valueOf(text.toUpperCase());
                    case "bagType" -> vacuumCleaner.bagType = text;
                    case "wandType" -> vacuumCleaner.wandType = text;
                    case "motorSpeedRegulation" -> vacuumCleaner.motorSpeedRegulation = Integer.parseInt(text);
                    case "cleaningWidth" -> vacuumCleaner.cleaningWidth = Integer.parseInt(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return vacuumCleaner;
    }
}
