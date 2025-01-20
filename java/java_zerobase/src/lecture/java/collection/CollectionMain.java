package lecture.java.collection;

// Java 프로그래밍 - 컬렉션 프레임워크
import java.util.*;

public class CollectionMain {

    public static void main(String[] args) {

//      1. List
//        1-1. ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        list1.remove(Integer.valueOf(2));
        System.out.println("list1 = " + list1);
        list1.add(0, 10);
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.contains(1) = " + list1.contains(1));
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10));

//      1-2. LinkedList
        System.out.println("== LinkedList ==");
        List<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        System.out.println(linkedlist);
        linkedlist.addFirst(10);
        linkedlist.addLast(42);
        System.out.println(linkedlist);
        linkedlist.remove(Integer.valueOf(2));
        linkedlist.removeFirst();
        System.out.println(linkedlist);
        linkedlist.removeLast();
        System.out.println(linkedlist);
        System.out.println(linkedlist.size());

//      2. Set
//      2-1. HashSet
        System.out.println("== HashSet ==");
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println("set = " + set);
        set.remove(1);
        System.out.println("set = " + set);
        set.add(2);
        set.add(3);
        System.out.println("set = " + set);


//      2-2. TreeSet
        System.out.println("== TreeSet ==");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(14);
        treeSet.add(1);
        treeSet.add(4);
        System.out.println("treeSet = " + treeSet); // treeSet은 오름차순 정렬을 해준다
        System.out.println(treeSet.lower(10));
        System.out.println(treeSet.higher(10));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

//      3. Map
//      3-1. HashMap
        System.out.println("== HashMap ==");
        HashMap map1 = new HashMap();
        map1.put(1, "kiwi");
        map1.put(2, "apple");
        map1.put(3, "mango");
        System.out.println("map1 = " + map1);

        map1.remove(2);
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1));


//      3-2. TreeMap
        System.out.println("== TreeMap ==");
        TreeMap map2 = new TreeMap();
        map2.put(10, "kiwi");
        map2.put(5, "apple");
        map2.put(15, "mango");
        System.out.println("map2 = " + map2);

        System.out.println("map2.firstEntry() = " + map2.firstEntry());
        System.out.println("map2.firstKey() = " + map2.firstKey());
        System.out.println("map2.lastEntry() = " + map2.lastEntry());
        System.out.println("map2.lastKey() = " + map2.lastKey());
        System.out.println("map2.lowerEntry(10) = " + map2.lowerEntry(10));
        System.out.println("map2.higherEntry(10) = " + map2.higherEntry(10));


    }
}
