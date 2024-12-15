package collection.array;

import java.util.List;

public class MyArrayListV1Main3 {

    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        // 원하는 위치에 추가
        System.out.println("addLast");
        list.add(3,"addLast"); // O(1)
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0,"addFirst"); // O(n)
        System.out.println(list);

        //삭제
        Object removed1 = list.remove(4); // O(1)
        System.out.println("removed(4) = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(4); // O(n)
        System.out.println("removed(addFirst) = " + removed2);
        System.out.println(list);
    }

}
