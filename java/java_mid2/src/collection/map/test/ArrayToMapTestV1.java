package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 상품의 이름과 가격이 2차원 배열로 제공된다.
 * 다음 예제를 참고해서 2차원 배열의 데이터를 `Map<String, Integer>` 로 변경해라.
 * 그리고 실행 결과를 참고해서 `Map` 을 출력해라. 출력 순서는 상관없다.
 */
public class ArrayToMapTestV1 {

    public static void main(String[] args) {
        String[][] produceArr = {{"Java", "10000"}, {"Spring", "20000"},{"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성 - 코드 작성
        Map<String,String> produceMap = new HashMap<>();
        for (int i = 0; i < produceArr.length; i++) {
            String key = produceArr[i][0];
            String value = produceArr[i][1];
            produceMap.put(key, value);
        }
        System.out.println(produceMap);


        // Map의 모든 데이터 출력 - 코드 작성
        Set<Map.Entry<String, String>> entries = produceMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print("제품 = " + entry.getKey());
            System.out.println(", 가격 = " + entry.getValue() );
        }
    }
}
