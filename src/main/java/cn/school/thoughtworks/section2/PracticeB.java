package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsCount = new HashMap<>();
        for (String element: collection1) {
            if (sameElementsCount.containsKey(element)){
                sameElementsCount.put(element, sameElementsCount.get(element)+1);
            } else {
                //如果从未添加过的元素包含"-"符号，则做分割处理，
                //example:d-5->key:d,value:5
                if (element.contains("-")) {
                    String[] key_value = element.split("-");
                    sameElementsCount.put(key_value[0], Integer.valueOf(key_value[1]));
                } else {
                    sameElementsCount.put(element, 1);
                }
            }
        }
        return sameElementsCount;
    }
}
