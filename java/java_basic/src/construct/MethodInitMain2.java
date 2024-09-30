package construct;
/*
    MethodInitMain1에서 중복되었던 초기값 설정 부분을 메소드를 생성하여 제거해보기

    -> 메소드를 통해 반복되는 내용을 대체하였으나, 이 메서드는 MemberInit 클래스의 객체의 참조값을 통해 접근하여 멤버변수를 활용하는 방식
    -> 즉, 객체지향이 아니라 절차지향적인 방법이다
    -> 객체지향 방식을 통해 속성(멤버변수)와 초기화(기능)을 클래스 내부에서 구현하도록 하는게 좋다
 */
public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1,"user1",15,90);

        MemberInit member2 = new MemberInit();
        initMember(member2,"user2",16,80);

        MemberInit[] members = {member1,member2};

        for (MemberInit s : members) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" +
                    s.grade);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade){
        member.name = name;
        member.age = age;
        member.grade = grade;

    }
}
