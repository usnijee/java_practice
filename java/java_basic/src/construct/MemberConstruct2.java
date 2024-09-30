package construct;

public class MemberConstruct2 {
    String name;
    int age;
    int grade;

    // 생서자는 일반 메서드와 달리 클래스 이름을 그대로 사용하여 만들어준다
    /*
        1. 생성자의 이름은 클래스 이름과 같아야 한다. 따라서 첫 글자도 대문자로 시작한다.
        2. 생성자는 반환 타입이 없다. 비워두어야 한다.
        3. 나머지는 메서드와 같다
     */
    MemberConstruct2(String name, int age, int grade){
        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);

        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 생성자 오버로딩
    // 동일한 명의 생성자를 매개변수만 바꾸어 새롭게 생성 가능
    // grade를 직접 명시해야하는 경우와 grade가 없는 경우를 생성자를 통해 구분이 가능하도록 설정
//    MemberConstruct2(String name, int age){
//        System.out.println("생성자 호출 name=" + name + ",age=" + age + ",grade=" + grade);
//
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
//    }
    // 단순히 생성자 오버로딩을 통해 만든것과 기존의 생성자와 중복되는 변수가 존재
    // 이럴때는 this()를 사용한다
    // this()는 생성자 내부에서 생성자를 호출하는 기능 ,, this는 인스턴스 자신의 참조값을 가리킴
    // 이 경우 MemberConstruct2(String name, int age) -> MemberConstruct2(String name, int age, int grade)를 호출함
    MemberConstruct2(String name, int age){
        this(name, age, 50);
    }
}
