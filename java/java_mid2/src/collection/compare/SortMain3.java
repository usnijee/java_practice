package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("Comparable 기본 정렬");
        /**
         * MyUser는 '비교 가능한' , comparable을 구현 한 클래스이다.
         * comparable 인터페이스를 구현하면 -> toCompare 메서드를 오버라이딩하여
         * 해당 클래스의 특징에 맞게 특정 기준을 기반으로 '비교'가 가능하도록 재정의 가능하다
         *
         * Arrays.sort()를 통해 정렬하면 해당 toCompare()의 내용을 기반으로 정렬이 진행된다
         */
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        // 사용자 정의 comparator
        /**
         * 위처럼 기본 비교는 comparable 인터페이스를 구현하여 toCompare()을 재정의하면 된다
         *
         * 그렇다면, 기본 비교뿐만 아니라 다른 비교도 하고싶다면 어떻게 해야할까?
         *
         * Comparator 인터페이스의 구현체를 만들고 compare() 메서드를 재정의하면 된다
         */
        System.out.println("IdComparator 정렬");
        Arrays.sort(array, new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator().reversed() 정렬");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
        
    }
}
