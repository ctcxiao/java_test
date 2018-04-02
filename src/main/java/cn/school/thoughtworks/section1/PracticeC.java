package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String, List<String>> collection2) {
        PracticeB practiceB = new PracticeB();
        return practiceB.collectSameElements(collection1, new ArrayList<>(collection2.values()));
    }
}
