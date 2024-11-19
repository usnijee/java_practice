package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", address);
        MemberV2 memberB = new MemberV2("회원B", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
//        memberB.getAddress().setValue("부산"); // 제약 발생
        memberB.setAddress(new ImmutableAddress("부산")); // 새로운 불변객체를 만들어줘야함을 안다
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA); // side effect 발생 !
        System.out.println("memberB = " + memberB);
    }
}
