package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
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

    private Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsCount = new HashMap<>();
        for (String element : collection1) {
            //首先判断是否特殊元素，不然不好判断是否此元素是否已经存在于map中
            if (isSpecialElement(element)) {
                addSpecialElements(sameElementsCount, element);
            } else {
                addCommonElement(sameElementsCount, element);
            }
        }
        return sameElementsCount;
    }


    private void addCommonElement(Map<String, Integer> sameElementsCount, String element) {
        if (sameElementsCount.containsKey(element)) {
            sameElementsCount.put(element, sameElementsCount.get(element) + 1);
        } else {
            sameElementsCount.put(element, 1);
        }
    }

    private boolean isSpecialElement(String element) {
        return element.contains("-") || element.contains(":") || element.contains("[");
    }

    private String[] handleSpecialElement(String element) {
        if (element.contains("-")) {
            return element.split("-");
        }
        return new String[]{};
    }

    private void addSpecialElements(Map<String, Integer> sameElementsCount, String element) {
        String[] key_value = handleSpecialElement(element);
        if (sameElementsCount.containsKey(key_value[0])) {
            sameElementsCount.put(key_value[0], sameElementsCount.get(key_value[0]) + Integer.valueOf(key_value[1]));
        } else {
            sameElementsCount.put(key_value[0], Integer.valueOf(key_value[1]));
        }
    }
}
