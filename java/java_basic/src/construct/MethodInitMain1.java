package construct;
/*
    기존의 객체를 생성하여 클래스 내부의 멤버변수에 접근하는 경우
    - 초기값을 설정해주어야 했고, 객체 마다 초기값 설정 부분이 겹치는 것을 알 수 있음
 */
public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        // 객체의 초기값 설정 부분1
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit member2 = new MemberInit();
        // 또다른 객체의 초기값 설정 부분2
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit[] members = {member1,member2};
        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }
    }
}
