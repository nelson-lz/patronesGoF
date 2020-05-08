package py.lpz.nelson.pd.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    private final Map<String, FlyweightConcrete> map = new HashMap<>();

    public FlyweightConcrete get(String key) {
        return map.computeIfAbsent(key, FlyweightConcrete::new); // Construcción perezosa
    }
}
