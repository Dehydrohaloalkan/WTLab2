package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OvenCreator implements ApplianceCreator {
    /**
     * Represent creator of a oven appliance
     */
    @Override
    public Appliance create(NodeList nodes) {
        Oven oven = new Oven();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> oven.powerConsumption = Integer.parseInt(text);
                    case "weight" -> oven.weight = Integer.parseInt(text);
                    case "capacity" -> oven.capacity = Integer.parseInt(text);
                    case "depth" -> oven.depth = Integer.parseInt(text);
                    case "height" -> oven.height = Double.parseDouble(text);
                    case "width" -> oven.width = Double.parseDouble(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return oven;
    }
}
