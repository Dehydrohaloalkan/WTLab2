package by.tc.task01.dao.creator;

import by.tc.task01.dao.creator.creators.*;

import java.util.HashMap;
import java.util.Map;

public class ApplianceCreatorFactory {
    private static final ApplianceCreatorFactory instance = new ApplianceCreatorFactory();

    private final Map<String, ApplianceCreator> creators = new HashMap<>();

    private ApplianceCreatorFactory() {
        creators.put("oven", new OvenCreator());
        creators.put("laptop", new LaptopCreator());
        creators.put("refrigerator", new RefrigeratorCreator());
        creators.put("vacuumCleaner", new VacuumCleanerCreator());
        creators.put("tabletPC", new TabletPCCreator());
        creators.put("speakers", new SpeakersCreator() );
    }
    /**
     * Gets the instance of a factory
     */
    public static ApplianceCreatorFactory getInstance() {
        return instance;
    }
    /**
     * Gets the creator of a correct type appliance from its name
     */
    public ApplianceCreator getCreator(String applianceName) {
        return creators.get(applianceName);
    }
}
