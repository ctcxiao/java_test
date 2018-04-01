package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        for (String key: collectionA.keySet()) {
            for (List<String> valueList: object.values()){
                for (String value: valueList) {
                    if (key.equals(value)){
                        collectionA.put(key, collectionA.get(key)-1);
                    }
                }
            }
        }
        return collectionA;
    }
}
