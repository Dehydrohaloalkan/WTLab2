package by.tc.task01.dao.creator;

import by.tc.task01.entity.Appliance;
import org.w3c.dom.NodeList;

public interface ApplianceCreator {
    Appliance create(NodeList nodes);
}
