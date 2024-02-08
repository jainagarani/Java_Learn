package basics;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClass {

    private final String name;
    private final HashMap<String, String> map;

    public ImmutableClass(String name, HashMap<String, String> tempMap) {
        this.name = name;
        map = new HashMap<>();
        for(Map.Entry<String, String> entry: tempMap.entrySet()){
            this.map.put(entry.getKey(), entry.getValue());
        }
    }


    public String getName() {
        return name;
    }

    public HashMap<String, String> getMap() {
        HashMap<String, String> tempMap = new HashMap<>();

        for(Map.Entry<String, String> entry: this.map.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
