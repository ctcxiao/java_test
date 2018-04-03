package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsCount = new HashMap<>();
        for (String element : collection1) {
            //首先判断是否特殊元素，不然不好判断是否此元素是否已经存在于map中
            if (isSpecialElement(element)) {
                addSpecialElements(sameElementsCount, element);
            } else {
                addCommonElement(sameElementsCount, element);
            }
        }
        return sameElementsCount;
    }


    private void addCommonElement(Map<String, Integer> sameElementsCount, String element) {
        if (sameElementsCount.containsKey(element)) {
            sameElementsCount.put(element, sameElementsCount.get(element) + 1);
        } else {
            sameElementsCount.put(element, 1);
        }
    }

    private boolean isSpecialElement(String element) {
        return element.contains("-") || element.contains(":") || element.contains("[");
    }

    private String[] handleSpecialElement(String element) {
        if (element.contains("-")) {
            return element.split("-");
        }

        if (element.contains(":")) {
            return element.split(":");
        }

        if (element.contains("[")) {
            String[] tmp_key_value = element.split("\\[");
            String key = tmp_key_value[0];
            String value = tmp_key_value[1].split("]")[0];
            return new String[]{key, value};
        }
        return new String[]{};
    }

    private void addSpecialElements(Map<String, Integer> sameElementsCount, String element) {
        String[] key_value = handleSpecialElement(element);
        if (sameElementsCount.containsKey(key_value[0])) {
            sameElementsCount.put(key_value[0], sameElementsCount.get(key_value[0]) + Integer.valueOf(key_value[1]));
        } else {
            sameElementsCount.put(key_value[0], Integer.valueOf(key_value[1]));
        }
    }
}
