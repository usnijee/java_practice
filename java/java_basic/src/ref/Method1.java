package ref;
/*
이전에 보았던 `class1.ClassStart3` 코드에는 중복되는 부분이 2가지 있다.
    - `name` , `age` , `grade` 에 값을 할당
    - 학생 정보를 출력

    메소드와 클래스를 이용하면 위의 중복되는 내용을 한번에 처리 가능
    how?
        - 메소드를 통해 중복되는 내용을 메소드 호출을 통해 한번에 처리 가능
        - 메소드의 매개변수에 클래스 객체를 input하면 참조값이 복사되기에 기존 객체에 메소드 안에서 접근 가능
 */

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "학생1",15,90);

        Student student2  = new Student();
        initStudent(student2, "학생2", 27, 99 );

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + " 나이 : " + student.age + " 성적 : " + student.grade);
    }
}
