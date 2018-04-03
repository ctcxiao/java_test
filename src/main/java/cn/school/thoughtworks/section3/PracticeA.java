package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {

        object.get("value").stream()
            .filter(collectionA::containsKey)
            .forEach(e -> collectionA.put(e, collectionA.get(e) - 1));

        return collectionA;
    }
}
