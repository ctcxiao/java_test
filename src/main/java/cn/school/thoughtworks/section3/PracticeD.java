package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeC;

import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        PracticeC practiceC = new PracticeC();
        PracticeB practiceB = new PracticeB();
        Map<String, Integer> sameElemMap = practiceC.countSameElements(collectionA);
        return practiceB.createUpdatedCollection(sameElemMap, object);
    }


}
