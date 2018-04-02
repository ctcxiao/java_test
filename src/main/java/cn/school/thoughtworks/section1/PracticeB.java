package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        PracticeA practiceA = new PracticeA();

        return collection2.stream()
            .flatMap(e -> practiceA.collectSameElements(collection1, e).stream())
            .collect(Collectors.toList());
    }
}
