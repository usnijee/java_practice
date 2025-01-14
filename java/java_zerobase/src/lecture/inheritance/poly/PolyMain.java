package lecture.inheritance.poly;
// Java 프로그래밍 - 다형성

class Person {
    public void print() {
        System.out.println("Person.print");
    }
}

class Student extends Person {
    public void print() {
        System.out.println("Student.print");
    }

    public void print2() {
        System.out.println("Student.print2");
    }
}

class CollegeStudent extends Person {
    public void print() {
        System.out.println("CollegeStudent.print");
    }
}

public class PolyMain {
    public static void main(String[] args) {

//      1. 다형성
        System.out.println("== 다형성 ==");
        Person p1 = new Person();
        Student s1 = new Student();

        Person p2 = new Student(); // 다형적 참조
//        Student s2 = new Person(); 자식은 부모를 품을 수 없다

        p1.print();
        s1.print();
        s1.print2();
        p2.print();

        Person p3 = new CollegeStudent();
        p3.print();

//      2. 타입 변환
        System.out.println("== 타입 변환 ==");
        Person pp1 = null;
        Student ss1 = null;

        Person pp2 = new Person();
        Student ss2 = new Student();
        Person pp3 = new Student(); // 업캐스팅

        pp1 = pp2;
        pp1 = ss2;

        ss1 = ss2;
        ss1 = (Student) pp3; // 다운 캐스팅

//      3. instanceof
        System.out.println("== instanceof ==");
        Person pe1 = new Person();
        Student st1 = new Student();
        Person pe2 = new Student();
        Person pe3 = new CollegeStudent();

        System.out.println(pe1 instanceof Person);
        System.out.println(st1 instanceof Student);

        System.out.println(pe2 instanceof Person);
        System.out.println(pe2 instanceof Student);

        System.out.println(pe3 instanceof Student); // CollegeStudent와 Student는 아무런 관계가 없다


    }
}
