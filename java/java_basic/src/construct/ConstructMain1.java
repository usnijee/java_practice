package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1,member2};
        for (MemberConstruct s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }

    }
}
/*
    생성자의 장점

    1. 중복 호출 제거
        //생성자 등장 전
            MemberInit member = new MemberInit();
            member.initMember("user1", 15, 90);
        //생성자 등장 후
            MemberConstruct member = new MemberConstruct("user1", 15, 90);

    2. 제약 -> 생성자 호출 필수
        생성자의 진짜 장점은 2번이라해도 과언이 아니다. 생성자를 사용하지 않고 일반 메소드를 만드는 경우
        메소드를 통한 멤벼변수 초기화를 하지 않아도 전체 코드는 에러없이 컴파일이 가능하다
        생성자의 경우 매개변수를 지정해주지 않는다면 컴파일에러가 발생하여 누락된 정보가 생기는것을 막아준다

        좋은 프로그램은 무한한 자유도가 주어지는 프로그램이 아니라 적절한 제약이 있는 프로그램이다!!!

    3. 기본 생성자
        -> 객체를 생성하고 변수에 참조값을 저장할 때 매개변수가 없이 진행해도 문제없이 컴파일이 된적이 있다
        -> java는 사용자가 직접 생성자를 만들지 않으면 기본 생성자를 만든다.
        -> 단, 생성자가 하나라도 존재하면 만들지 않음
 */