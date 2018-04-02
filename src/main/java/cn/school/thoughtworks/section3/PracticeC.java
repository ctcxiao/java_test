package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeB;

import java.util.List;
import java.util.Map;

public class PracticeC {

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        PracticeB practiceB = new PracticeB();
        cn.school.thoughtworks.section3.PracticeB practiceB1 = new cn.school.thoughtworks.section3.PracticeB();

        Map<String, Integer> sameElemMap = practiceB.countSameElements(collectionA);

        return practiceB1.createUpdatedCollection(sameElemMap, object);
    }
}
