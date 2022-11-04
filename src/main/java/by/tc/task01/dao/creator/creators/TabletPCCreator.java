package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.enums.PCColor;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TabletPCCreator implements ApplianceCreator {
    /**
     * Represent creator of a tabletPC appliance
     */
    @Override
    public Appliance create(NodeList nodes) {
        TabletPC tabletPC = new TabletPC();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "batteryCapacity" -> tabletPC.batteryCapacity = Integer.parseInt(text);
                    case "displayInches" -> tabletPC.displayInches = Integer.parseInt(text);
                    case "memoryRom" -> tabletPC.memoryRom = Integer.parseInt(text);
                    case "flashMemoryCapacity" -> tabletPC.flashMemoryCapacity = Integer.parseInt(text);
                    case "color" -> tabletPC.color = PCColor.valueOf(text.toUpperCase());
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return tabletPC;
    }
}
