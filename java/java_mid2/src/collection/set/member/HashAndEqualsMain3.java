package collection.set.member;

import collection.set.MyHashSetV2;

/**
 *  hashCode()와 equals()를 재정의한 Member의 객체를 활용한 경우 및 사용해야하는 이유
 */
public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        // ID가 같은 회원
        Member m1 = new Member("A");
        Member m2 = new Member("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // true ,, equals 오버라이딩을 통해 우선적으로 member의 equals가 LinkedList에서 활용됨

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //검색 성공
        Member searchValue = new Member("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
