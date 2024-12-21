package collection.set;
/**
 * 사용자 정의 객체인 member 객체를 활용해보기
 * 이때 주의할 점, member 객체를 활용하기위해선 member 클래스 내에 equals와 hashCode()가 오버라이딩되어 재정의되어야한다
 * 그 이유
 * 1. Object의 hashCode()는 객체의 참조값기준으로 해시코드를 생성한다 -> id를 기준으로 하려면 재정의 해야함
 * 2. Object의 equals()는 동일성비교(==)를 기준으로 비교한다 -> id기준이면 논리적 동일함을 검증할 동등성 비교가 필요
 */

import collection.set.member.Member;

public class MyHashSetV2Main2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member hi = new Member("hi");
        Member jpa = new Member("JPA");
        Member java = new Member("java");
        Member spring = new Member("spring");

        System.out.println("hi.hashCode() = " + hi.hashCode());
        System.out.println("jpa.hashCode() = " + jpa.hashCode());
        System.out.println("java.hashCode() = " + java.hashCode());
        System.out.println("spring.hashCode() = " + spring.hashCode());

        set.add(hi);
        set.add(jpa);
        set.add(java);
        set.add(spring);
        System.out.println(set);

        //검색
        Member searchValue = new Member("JPA");
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + ") = " + result);
    }
}
