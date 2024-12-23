package collection.map.test;
/**
 * 다음 예제에서 Map 에 들어있는 데이터 중에 값이 1000원인 모든 상품을 출력해라.
 * 실행 결과를 참고하자.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        HashSet<Object> set = new HashSet<>();
        Set<Entry<String, Integer>> entries = map.entrySet();
        for (Entry<String, Integer> entry : entries) {
            if (entry.getValue() == 1000) {
                set.add(entry.getKey());
            }
        }
        System.out.println(set);
    }
}
