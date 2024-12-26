package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
//        list.add(1); //불변 클래스이기에 수정 불가능
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list class = " + list.getClass()); //ImmutableCollections$ListN : 불변 객체를 의미

    }
}
