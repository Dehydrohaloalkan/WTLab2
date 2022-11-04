package by.tc.task01.dao.creator;

import by.tc.task01.dao.creator.creators.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCreatorFactory {
    private static final ApplianceCreatorFactory instance = new ApplianceCreatorFactory();

    private final Map<String, ApplianceCreator> creators = new HashMap<>();

    private ApplianceCreatorFactory() {

    }

    public static ApplianceCreatorFactory getInstance() {
        return instance;
    }

    public ApplianceCreator getCreator(String applianceName) {
        return creators.get(applianceName);
    }
}
