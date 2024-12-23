package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 상품의 이름과 가격이 2차원 배열로 제공된다.
 * 다음 예제를 참고해서 2차원 배열의 데이터를 `Map<String, Integer>` 로 변경해라.
 * 그리고 실행 결과를 참고해서 `Map` 을 출력해라. 출력 순서는 상관없다.
 */
public class ArrayToMapTestV2 {

    public static void main(String[] args) {
        String[][] produceArr = {{"Java", "10000"}, {"Spring", "20000"},{"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String,Integer> produceMap = new HashMap<>();
        for (String[] product : produceArr) {
            produceMap.put(product[0], Integer.valueOf(product[1]));
        }

        System.out.println(produceMap);
        // Map의 모든 데이터 출력 - 코드 작성
        Set<Map.Entry<String, Integer>> entries = produceMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.print("제품 = " + entry.getKey());
            System.out.println(", 가격 = " + entry.getValue() );
        }
    }
}
