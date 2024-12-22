package collection.set.test;
/**
 * 문제 설명**
 * 두 숫자의 집합이 제공된다.
 * 집합1: `1, 2, 3, 4, 5`
 * 집합2: `3, 4, 5, 6, 7`
 * 두 집합의 합집합, 교집합, 차집합을 구해라. 출력 순서는 관계없다.
 * 합집합: 두 집합의 합이다. 참고로 중복은 제거한다. `[1, 2, 3, 4, 5, 6, 7]`
 * 교집합: 두 집합의 공통 값이다. 참고로 중복은 제거한다. `[3, 4, 5]`
 * 차집합: 집합1에서 집합2와 같은 값을 뺀 나머지 `[1, 2]`
 * 다음 실행 결과를 참고하자.
 * `Set` 인터페이스의 주요 메서드를 참고하자.
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> total = printUnion(set1, set2);
        Set<Integer> intersection = printIntersection(set1, set2);
        Set<Integer> difference = printDifference(set1, set2);

        System.out.println("합집합: " + total);
        System.out.println("교집합: " + intersection);
        System.out.println("차집합: " + difference);

    }

    private static Set<Integer> printUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> total = new TreeSet<>(set1); // 생성자가 기본으로 collections들의 구현체들을 종류에 상관없이 매개변수로 받을 수 있음
        total.addAll(set2); // A.addAll(B) : A+B 합집합
        return total;
    }

    private static Set<Integer> printIntersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersection = new HashSet<>(set1); //A.retain(B) : A와 B의 교집합
        intersection.retainAll(set2);
        return intersection;
    }

    private static Set<Integer> printDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> difference = new HashSet<>(set1); // A.removeAll(B) : A-B 차집합
        difference.removeAll(set2);
        return difference;
    }


}
