package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        List<String> sameElements = new ArrayList<>();
        for (String elements1 : collection1) {
            for (List<String> mapValues : collection2.values()) {
                for (String value : mapValues) {
                    if (elements1.equals(value)) {
                        sameElements.add(elements1);
                    }
                }
            }
        }
        return sameElements;
    }
}
