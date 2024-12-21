package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        // 중복 등록
        MyHashSetV2 set = new MyHashSetV2(10);
        // ID가 같은 회원
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); // false -> hashCode는 같으나 equals를 오버라이딩 하지 않은 경우 ,, 동일성 비교로 인해 false

        set.add(m1); // LinkedList의 add를 통해 원소를 추가하는데 이때 contains를 통해 중복원소 검증을하고 contains과정에서 equals가 사용됨
        set.add(m2);
        System.out.println(set); // set의 결과를 보면 MemberOnlyHash{id='A'}가 LinkedList에 중복되어 들어간것을 확인할 수 있음 -> 여기서 이미 중복원소 검증 과정이 제대로 이루어지지 않은 것. -> equals 때문

        //검색 실패 -> 'A'
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue); // 위의 add와 동일한 이유로 해시 인덱스가 같으나 false가 반환됨
        System.out.println("contains = " + contains); // false ,, searchValue의 해시코드 = 7인데 7번 인덱스에는 데이터가 없기 때문

    }
}
