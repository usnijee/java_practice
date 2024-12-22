package collection.set.javaset;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>()); // hashindex 기준 출력
        run(new LinkedHashSet<>()); // 입력 순서 보장 출력
        run(new TreeSet<>()); // 오름차순 정렬 보장 출력
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");
//        System.out.println("set = " + set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
