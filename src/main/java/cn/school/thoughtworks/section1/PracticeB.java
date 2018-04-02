package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        PracticeA practiceA = new PracticeA();
        List<String> sameElements = new ArrayList<>();

        for (List<String> list : collection2) {
            sameElements.addAll(practiceA.collectSameElements(collection1, list));
        }

        return sameElements;
    }
}
