package class1;
/*
    배열 리팩토링 --> for문을 활용한 반복문 가능
 */

public class ClassStart5 {

    public static void main(String[] args) {
        // 객체 선언
        Student student1; // Student 타입을 받을 수 있는 변수를 선언 --> int는 정수, String은 문자열을 담듯이 Student는 Student 타입의 객체를 받을 수 있다
        student1 = new Student(); // 클래스 객체 생성 --> 메모리에 student에 대한 정보를 생성 --> 이때, 해당 메모리의 참조값이 student1에 저장됨
//        System.out.println(student1); // 생성된 객체에 접근할 수 있는 참조값 출력해보기

        // 객체 사용
        student1.name = "학생1"; // 객체를 사용하려면 .(dot)을 통해 변수에 저장되어 있는 참조값을 읽어 메모리에 존재하는 객체에 접근 
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //배열을 활용하여 객체 여러개 배열에 저장하기
        Student[] students = new Student[]{student1,student2}; // 한번 더 짚고 넘어가야하는 부분 --> 배열 선언 최적화 ,, 생성과 선언을 동시에 함
        // Student[] students = {student1, student2} 도 가능

        //for문 적용
        for (int i = 0; i < students.length ; i++){
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }

        // 향상된 for문 적용 --> 배열에서 처음부터 끝까지 모든 원소에 대해 접근할 때 사용
        // iter를 통해 간편히 사용 가능
        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }

    }
}
