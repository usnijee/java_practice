package class1;
/*
    생성한 student 클래스의 객체를 생성한 후 멤버변수 사용하기
 */

/*
    클래스에 대한 정확한 이해

    - 타입 -> 데이터의 종류 or 형태를 의미
        ex. int -> 정수 타입, String -> 문자 타입

    - 그렇다면 학생(student)라는 타입을 직접 만들면 되지 않을까?
    - 사용자 정의 타입을 만들려면 '설계도'가 필요한데, 설계도가 '클래스'이다
    - 설계도(클래스)를 사용해서 실제 메모리에 만들어진 실체를 '객체'(인스턴스)라고 한다.
 */

/*
    클래스 객체에 대한 메모리 참조값을 왜 변수에 저장해야할까?

    Student student1 = new Student();

    - new Student()는 설계도인 클래스를 기반으로 실제 객체를 만들어서 메모리에 객체에 대한 정보(멤버변수)를 저장하는 역할,, 그 이상은 없음
    - 위의 생성된 객체에 접근할 방법이 필요
    - 따라서, 객체를 생성하면서 반환되는 메모리 참조값을 어딘가에 저장해놔야하기에 변수가 필요

    [실행과정]
    Student student1 = new Student(); //1. Student 객체 생성
    Student student1 = x001; //2. new Student()의 결과로 x001 참조값 반환
    student1 = x001; //3. 최종 결과

 */
public class ClassStart3 {

    public static void main(String[] args) {
        // 객체 선언
        Student student1; // Student 타입을 받을 수 있는 변수를 선언 --> int는 정수, String은 문자열을 담듯이 Student는 Student 타입의 객체를 받을 수 있다
        student1 = new Student(); // 클래스 객체 생성 --> 메모리에 student에 대한 정보를 생성 --> 이때, 해당 메모리의 참조값이 student1에 저장됨
        System.out.println(student1); // 생성된 객체에 접근할 수 있는 참조값 출력해보기
        // 객체 사용
        student1.name = "학생1"; // 객체를 사용하려면 .(dot)을 통해 변수에 저장되어 있는 참조값을 읽어 메모리에 존재하는 객체에 접근
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}
