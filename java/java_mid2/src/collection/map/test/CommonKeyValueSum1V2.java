package collection.map.test;

import java.util.HashMap;
import java.util.Map;

/**
 * `map1` 과 `map2` 에 공통으로 들어있는 키를 찾고, 그 값의 합을 구해라.
 * 실행 결과를 참고하자.
 */
public class CommonKeyValueSum1V2 {

    public static void main(String[] args) {
        // Map.of를 활용하면 Map을 유용하게 만들수 있음 -> 하지만 불변객체여서 변경 불가능
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);
        Map<String, Integer> map2 = Map.of("B", 4,"C", 5, "D", 6);

        // 코드 작성
        // V1버전보다 효율적 -> 이중 for문은 시간복잡도가 너무 높다
        Map<String, Integer> resultMap = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                resultMap.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(resultMap);

    }
}
