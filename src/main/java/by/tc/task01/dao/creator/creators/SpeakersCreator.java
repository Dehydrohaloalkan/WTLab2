package by.tc.task01.dao.creator.creators;

import by.tc.task01.dao.creator.ApplianceCreator;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SpeakersCreator implements ApplianceCreator {
    @Override
    public Appliance create(NodeList nodes) {
        Speakers speakers = new Speakers();

        for (int i = 0; i < nodes.getLength(); i++) {
            if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String text = nodes.item(i).getTextContent();
                switch (nodes.item(i).getNodeName()) {
                    case "powerConsumption" -> speakers.powerConsumption = Integer.parseInt(text);
                    case "numberOfSpeakers" -> speakers.numberOfSpeakers = Integer.parseInt(text);
                    case "frequencyRange" -> speakers.frequencyRange = text;
                    case "cordLength" -> speakers.cordLength = Integer.parseInt(text);
                    default -> throw new IllegalArgumentException("No such appliance exists");
                }
            }
        }
        return speakers;
    }
}
