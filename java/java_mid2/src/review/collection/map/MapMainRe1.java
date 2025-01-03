package review.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * HashMap 활용해보기
 */
public class MapMainRe1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 데이터 추가
        studentMap.put("A", 90);
        studentMap.put("B", 80);
        studentMap.put("C", 80);
        studentMap.put("D", 100);
        System.out.println(studentMap);

        //특정 학생의 값 조회
        Integer studentAscore = studentMap.get("A");
        System.out.println("studentAscore = " + studentAscore);

        System.out.println("keySet 활용");
        Set<String> keySet = studentMap.keySet();
        for (String key : keySet) {
            Integer result = studentMap.get(key);
            System.out.println("student = " + key + ", score = " + result);
        }

        System.out.println("entrySet 활용");
        Set<Entry<String, Integer>> entries = studentMap.entrySet();
        for (Entry<String, Integer> entry : entries) {
            System.out.println("stduent = " + entry.getKey() + ", score = " + entry.getValue());
        }

        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("score = " + value);
        }
    }
}
