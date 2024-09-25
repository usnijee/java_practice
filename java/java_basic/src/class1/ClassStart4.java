package class1;
/*
        객체도 배열을 통해 묶을 수 있다.

        배열을 사용하면 특정 타입을 연속한 데이터 구조로 묶어서 편리하게 관리할 수 있다.
        Student 클래스를 사용한 변수들도 Student 타입이기 때문에 학생도 배열을 사용해서 하나의 데이터 구조로 묶어
        서 관리할 수 있다.

 */

public class ClassStart4 {

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

        //배열을 활용하여 객체 여러개 배열에 저장하기
        Student[] students = new Student[2]; // students변수에 배열의 참조값을 저장
        students[0] = student1;  // student1에 저장된 참조값을 복제하여 저장
        students[1] = student2;  // student2의 참조값을 복제하여 저장

        /*
            여기서 배열에 저장되어 있는 객체들에 접근하려면 ,, 먼저 students에 저장되어 있는 배열의 참조값을 통해 배열로 접근한 후
            배열안에 인덱스별로 저장되어있는 Student 클래스의 객체에 대한 참조값을 통해 최종 접근

            즉, 참조값을 두 번 거쳐야 가능
         */
        /* 실제 프로세스를 코딩으로 확인하기

            System.out.println(students[0].name); //배열 접근 시작
            = System.out.println(x005[0].name); //[0]를 사용해서 x005 배열의 0번 요소에 접근
            = System.out.println(x001.name); //.(dot)을 사용해서 참조값으로 객체에 접근
            = System.out.println("학생1");

         */

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[0].grade);
    }
}
