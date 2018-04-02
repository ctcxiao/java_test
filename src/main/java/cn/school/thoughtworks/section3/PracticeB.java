package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        for (String element : object.get("value")) {
            if (collectionA.containsKey(element)) {
                int minusCount = collectionA.get(element)/3;
                collectionA.put(element, collectionA.get(element)-minusCount);
            }
        }

        return collectionA;
    }
}
