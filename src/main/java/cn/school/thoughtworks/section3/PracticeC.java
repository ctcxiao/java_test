package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> sameElemMap = countSameElements(collectionA);
        return minusSameElemCount(sameElemMap, object);
    }

    private Map<String,Integer> minusSameElemCount(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        for (String key: collectionA.keySet()) {
            for (List<String> valueList: object.values()){
                for (String value: valueList) {
                    if (key.equals(value)){
                        int minusCount = collectionA.get(key)/3;
                        collectionA.put(key, collectionA.get(key)-minusCount);
                    }
                }
            }
        }
        return collectionA;
    }

    private Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsCount = new HashMap<>();
        for (String element: collection1) {
            if (sameElementsCount.containsKey(element)){
                sameElementsCount.put(element, sameElementsCount.get(element)+1);
            } else {
                sameElementsCount.put(element, 1);
            }
        }
        return sameElementsCount;
    }
}
