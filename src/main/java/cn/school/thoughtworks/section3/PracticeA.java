package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {

        for (String element : object.get("value")) {
            if (collectionA.containsKey(element)) {
                collectionA.put(element, collectionA.get(element) - 1);
            }
        }

        return collectionA;
    }
}
