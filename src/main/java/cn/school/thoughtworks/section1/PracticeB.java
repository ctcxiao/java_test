package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> sameElements = new ArrayList<>();
        for (List<String> sonList: collection2) {
            for (String element1: collection1) {
                for (String sonElement: sonList) {
                    if (element1.equals(sonElement)){
                        sameElements.add(element1);
                    }
                }
            }
        }
        return sameElements;
    }
}
