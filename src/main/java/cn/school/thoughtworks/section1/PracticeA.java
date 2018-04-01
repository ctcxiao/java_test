package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        List<String> sameElements = new ArrayList<>();
        for (String element1: collection1) {
            for (String element2: collection2) {
                if (element1.equals(element2)){
                    sameElements.add(element1);
                }
            }
        }
        return sameElements;
    }
}
