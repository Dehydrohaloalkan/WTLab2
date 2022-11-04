package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class RefrigeratorCreator implements ApplianceCreator {
    @Override
    public Appliance create(NodeList nodes) {
        Refrigerator refrigerator = new Refrigerator();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> refrigerator.powerConsumption = Integer.parseInt(text);
                    case "weight" -> refrigerator.weight = Integer.parseInt(text);
                    case "freezerCapacity" -> refrigerator.freezerCapacity = Integer.parseInt(text);
                    case "overallCapacity" -> refrigerator.overallCapacity = Integer.parseInt(text);
                    case "height" -> refrigerator.height = Double.parseDouble(text);
                    case "width" -> refrigerator.width = Double.parseDouble(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return refrigerator;
    }
}
