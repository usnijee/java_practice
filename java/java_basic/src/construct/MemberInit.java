package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 초기값을 설정하는 메소드 -> def __init__(self~)와 동일
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;  // this는 python의 self와 동일한 기능
    }

    /* 매개변수의 String name과 멤버변수의 name은 형태가 같은데 연산의 우선순위는 어떻게 결정할까?
    -> 매개변수가 initMember 괄호의 더 안쪽에 존재하기에 매개변수가 연산 우위를 가짐
    -> 이 부분에서 this의 목적을 알 수 있다.
    -> 예를들어, this를 사용하지 않고 name = name;을 하게 되면 둘 다 매개변수를 의미하게 됨
    -> 즉, 문법도 오류이나, 사용자가 제공한 인자가 객체의 멤버변수에 복사저장이 안되어 결국 클래스의 기능을 사용할 수 없게된다

    [진행과정]
    this.name = name; //1. 오른쪽의 name은 매개변수에 접근
    this.name = "user"; //2. name 매개변수의 값 사용
    x001.name = "user"; //3. this.은 인스턴스 자신의 참조값을 뜻함, 따라서 인스턴스의 멤버 변수에 접
    근
     */
}
