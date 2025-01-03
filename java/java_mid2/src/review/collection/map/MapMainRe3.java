package review.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMainRe3 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        // 학생 성적 데이터 추가
        studentMap.put("A", 50);
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가1
        if (!studentMap.containsKey("A")) {
            studentMap.put("A", 100);
        }
        System.out.println(studentMap);

        // 학생이 없는 경우에만 추가
        studentMap.putIfAbsent("A", 100);
        studentMap.putIfAbsent("B", 100);
        System.out.println(studentMap);
    }
}
