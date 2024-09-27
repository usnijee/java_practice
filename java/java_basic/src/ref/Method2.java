package ref;
/*
    Method1에서 클래스 객체의 생성과 변수에 저장을 한번에 하면 안될까?
 */

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15,90);
        Student student2 = createStudent("학생2" , 27, 99 );

        /*
        **진행 과정**
        Student student1 = createStudent("학생1", 15, 90) //메서드 호출후 결과 반환
        Student student1 = student(x001) //참조형인 student를 반환
        Student student1 = x001 //student의 참조값 대입
        student1 = x001
         */
        printStudent(student1);
        printStudent(student2);
    }

    // 메소드의 반환형태를 사용자 정의 변수인 Student로 지정하여 반환
   static Student createStudent(String name, int age, int grade){
        Student student = new Student(); // student 변수에 참조값 새로 생성된 객체의 참조값 저장
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student; // student에 저장되어 있는 참조값 반환
   }

    static void printStudent(Student student1) {
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
    }
}

