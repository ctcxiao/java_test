package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
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
}
