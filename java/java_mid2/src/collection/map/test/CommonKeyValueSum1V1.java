package collection.map.test;

import java.util.HashMap;
import java.util.Map;

/**
 * `map1` 과 `map2` 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
 * 실행 결과를 참고하자.
 */
public class CommonKeyValueSum1V1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        // 코드 작성
        Map<String, Integer> resultMap = new HashMap<>();
        for (String string1 : map1.keySet()) {
            for (String string2 : map2.keySet()) {
                if (string1.equals(string2)) {
                    resultMap.put(string1, map1.get(string1) + map2.get(string2));
                }
            }
        }
        System.out.println(resultMap);

    }
}
