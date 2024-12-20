package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        //Object의 기본 hashCode는 객체의 참조값을 기반으로 생성
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode) = " + obj1.hashCode()); // 10진수로 나옴
        System.out.println("obj2.hashCode() = " + obj2.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode())); // 해시코드 16진수

        //각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("'A'.hashCode() = " + strA.hashCode());
        System.out.println("'AB'.hashCode() = " + strAB.hashCode());

        //hashCode는 마이너스 값이 들어올 수 있다.
        System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

        // 둘은 같을까? ,, 인스턴스는 다르지만, equals는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        //equals, hashCode를 오버라이딩 하지 않은 경우와, 한 경우를 비교
        /**
         *  java에서 기본으로 제공하는 hashCode()는 인스턴스 참조값을 기준으로 해시코드 형성
         *  오버라이딩 -> Objects.hash(id) : id를 기준으로 해시코드 형성 -> 인스턴스가 다르더라도 해시코드를 같게 할 수 있음
         *  -> 매우 중요 id가 같은데 해시코드가 다르면 HashSet 알고리즘을 통한 데이터 보관이 불가능
         */
        System.out.println("(memeber1 == member2) = " + (member1 == member2));
        System.out.println("(member1 equals member2) = " + (member1.equals(member2)));
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
