package lecture.java.interfacee;

// School 인터페이스
interface School {
    public static final int MAX_CLASS = 20;
    public static final int MAX_PERSON_PER_CLASS = 40;
    public abstract void printSchool();
}

// Student 클래스 - School 인터페이스 이용

class Student implements School {

    @Override
    public void printSchool() {
        System.out.println("00 UNIVERSITY");
    }
}


// Person 클래스
class Person {
    public String name;

    public void printName() {
        System.out.println("Name: " + name);
    }
}


// Student2 클래스 - Person 상속, School 인터페이스 이용
class Student2 extends Person implements School {

    public Student2(String name) {
        this.name = name; // 부모 클래스인 Person의 name 필드에 저장됨
    }

    @Override
    public void printSchool() {
        System.out.println("11 UNIVERSITY");
    }
}
public class InterFaceMain {

    public static void main(String[] args) {

//      1. 인터페이스 기본 사용
        System.out.println("== 기본 인터페이스 ==");
        Student s1 = new Student();
        s1.printSchool();
        System.out.println(s1.MAX_CLASS);
        System.out.println(s1.MAX_PERSON_PER_CLASS);


//      2. 다중 상속처럼 사용하기
        System.out.println("== Like 다중 상속 ==");
        Student2 s2 = new Student2("A");
        s2.printSchool();
        s2.printName(); // Student2에서 오버라이딩을 하지 않았기에 부모 클래스의 메서드로 연결됨

    }
}
