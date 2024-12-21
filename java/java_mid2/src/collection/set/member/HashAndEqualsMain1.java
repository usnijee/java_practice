package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        // ID가 같은 회원
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // false -> hashCode도 다르고 equals도 동일성 비교를 하기 때문

        set.add(m1);
        set.add(m2);
        System.out.println(set); // 동일한 id로 인해 같은 인덱스의 위치에 저장

        //검색 실패 -> 'A'아이디로 검색을 진행했으나 searchValue 조차 다른 hashCode를 갖게되어 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains); // false ,, searchValue의 해시코드 = 7인데 7번 인덱스에는 데이터가 없기 때문

    }
}
