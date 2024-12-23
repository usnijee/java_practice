package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap); // {studentB=80, studentA=90, studentD=100, studentC=80}

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        /**
         *  keySet() : Map의 key만 출력하는 메서드
         *  Map의 key는 중복x, 순서보장x이기에 Set 자료구조로 되어있음
         */
        System.out.println("keyset 활용");
        Set<String> keySet = studentMap.keySet();
        System.out.println("keySet = " + keySet);
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key=" + key + ", value=" + value);
        }

        /**
         * entrySet은 Map의 key, value를 Set 자료구조로 저장
         * entries = [studentB=80, studentA=90, studentD=100, studentC=80]
         * Entry: Map 내부의 인터페이스
         */
        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        System.out.println("entries = " + entries);
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key=" + key + " value=" + value);
        }
        // values : Map에서 value만 꺼냄
        System.out.println("values 활용");
        Collection<Integer> values = studentMap.values(); // values는 collection 타입
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

    }
}
