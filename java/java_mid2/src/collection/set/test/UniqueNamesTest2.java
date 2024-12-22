package collection.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * 문제 설명**
 * 여러 정수가 입력된다. 여기서 중복 값을 제거하고 값을 출력해라.
 * 30, 20, 20, 10, 10이 출력되면 중복을 제거하고 출력하면 된다.
 * 단 입력 순서대로 출력해라.
 * 출력 예): 30, 20, 10
 * ``
 */
public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        printInput(inputArr);

    }

    private static void printInput(Integer[] inputArr) {
        Set<Integer> linkedSet = new LinkedHashSet<>(); // 입력된 순서를 보장하기 위함
        linkedSet.addAll(Arrays.asList(inputArr)); // List.of()도 가능하고 권장됨
        for (Integer num : linkedSet) {
            System.out.println(num);
        }
    }
}
