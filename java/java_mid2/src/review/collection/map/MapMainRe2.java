package review.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMainRe2 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("A", 90);
        System.out.println(studentMap);

        studentMap.put("A", 100);
        System.out.println(studentMap); // 기존의 키에 해당하는 값 대체 

        boolean containsKey = studentMap.containsKey("A");
        System.out.println("containsKey = " + containsKey);

        // 특정 학생의 값 삭제
        studentMap.remove("A");
        System.out.println(studentMap);
    }
}
