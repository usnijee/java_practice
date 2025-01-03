package review.collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        // 합집합
        Set<Integer> hap = new HashSet<>(set1);
        hap.addAll(set2);
        System.out.println("합집합 : " + hap);

        // 교집합
//        Set<Integer> gyo2 = set2; // set2의 참조값이 gyo2에 저장되기에 gyo2의 변화는 set2의 변화를 만듦 -> 이렇게 하면 안됌
        Set<Integer> gyo = new HashSet<>(set1);
//        gyo2.retainAll(set2);
        gyo.retainAll(set2);
//        System.out.println("gyo2 = " + gyo2);
        System.out.println("교집합 = " + gyo);

        // 차집합
        Set<Integer> cha = new HashSet<>(set1);
        cha.removeAll(set2);
        System.out.println(cha);

    }
}
