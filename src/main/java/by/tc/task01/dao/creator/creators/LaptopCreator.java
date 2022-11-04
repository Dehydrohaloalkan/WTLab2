package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LaptopCreator implements ApplianceCreator {
    /**
     * Represent creator of a laptop appliance
     */
    @Override
    public Appliance create(NodeList nodes) {
        Laptop laptop = new Laptop();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "batteryCapacity" -> laptop.batteryCapacity = Double.parseDouble(text);
                    case "os" -> laptop.os = text;
                    case "memoryRom" -> laptop.memoryRom = Integer.parseInt(text);
                    case "systemMemory" -> laptop.systemMemory = Integer.parseInt(text);
                    case "cpu" -> laptop.cpu = Double.parseDouble(text);
                    case "displayInchs" -> laptop.displayInchs = Integer.parseInt(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return laptop;
    }
}
