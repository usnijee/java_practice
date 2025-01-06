package variable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Var4 {

    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        List l1 = new ArrayList();

//      1-1. add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");
        System.out.println("l1 = " + l1);

        l1.add(0, 1);
        System.out.println("l1 = " + l1);

//      1-2. get
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

//      1-3. size
        System.out.println(l1.size());

//      1-4. remove
        System.out.println(l1.remove(0));
        System.out.println(l1.remove(Integer.valueOf(2)));
        System.out.println("l1 = " + l1);

//      1-5. clear
        l1.clear();
        System.out.println("l1 = " + l1);

//      1-6. sort
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder()); // 오름 차순
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder()); // 내림 차순
        System.out.println("l2 = " + l2);

//      1-7. contains
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));

//      2. Maps
        System.out.println("== Maps ==");
        Map map = new HashMap();

//      2-1. put
        map.put("kiwi", 9000);
        map.put("apple", 90090);
        map.put("mango", 12000);
        System.out.println("map = " + map);

//      2-2. get
        System.out.println(map.get("mandarine"));
        System.out.println(map.get("kiwi"));

//      2-3. size
        System.out.println(map.size());

//      2-4. remove
        System.out.println(map.remove("kiwi"));
        System.out.println(map.remove("mandarine"));
        System.out.println("map = " + map);

//      2-5. containsKey
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("kiwi"));

//      3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<>(); // Generic을 통해 제약을 걸어줄 수 있다
//        l4.add(1);
        l4.add("hello");
        System.out.println("l4 = " + l4);

    }

}
