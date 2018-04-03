package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
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
