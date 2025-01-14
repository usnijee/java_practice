package lecture.absstract;
// Java 프로그래밍 - 추상 클래스

// 추상 클래스 Person
abstract class Person {
    abstract void printInfo();
}

// 추상 클래스 상속
class Student extends Person {

    @Override
    void printInfo() {
        System.out.println("Student.printInfo");
    }
}
public class AbstractMain {

    public static void main(String[] args) {

//        추상 클래스의 사용
//        Person s1 = new Person(); // 추상 클래스는 직접 객체 생성 불가능
        Student s1 = new Student();
        s1.printInfo();

        Person p2 = new Person() {
            @Override
            void printInfo() {
                System.out.println("Main.printInfo"); // 익명 클래스 사용
            }
        };

        p2.printInfo();

    }
}
