package collection.utils;
/**
 * 컬랙션 유틸 --> 컬랙션을 편리하게 다룰수 있는 기능
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // 최대 최소
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // 랜덤 섞기
        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffle list = " + list);

        // 정렬
        Collections.sort(list);
        System.out.println("sort list = " + list);
        Collections.reverse(list);
        System.out.println("sort reversed list = " + list);
    }
}
