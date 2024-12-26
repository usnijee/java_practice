package collection.compare;

import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet1); // tree구조와 같은 이진탐색은 데이터를 정렬하면서 보관하기 때문에 기본적으로 정렬이 제공된다

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator()); // 다른 comparator를 사용하기 싶으면 TreeSet의 매개변수로 비교자를 넣어주어야함
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser2);
        System.out.println("IdComparator 정렬");
        System.out.println(treeSet2);
    }
}
