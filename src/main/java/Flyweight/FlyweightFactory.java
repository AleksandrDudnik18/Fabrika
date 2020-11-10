package Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, Flyweight> cache;

    public FlyweightFactory() {
        this.cache = new HashMap<String, Flyweight>();
    }

    public Flyweight getFlyweight(String repeatingState) {

        if (!cache.containsKey(repeatingState)) {

            cache.put(repeatingState, new Flyweight(repeatingState));

        }

        return cache.get(repeatingState);

    }
}
