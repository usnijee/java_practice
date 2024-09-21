package array;
/*
    배열(Array)
    1. c언어 학습하면서 기본적인 개념은 알고있다.
    2. 중요한 점

        int[] students = new int[5];
        -> int[5]을 통해 int형 5개의 메모리 공간을 확보(4*5 = 20byte)
        -> 해당 메모리공간에 접근하려면 해당 메모리의 주소를 통해 접근해야함
        -> 해당 배열의 메모리 주소를 선언한 students라는 변수에 저장하여
            해당 변수를 통해 배열을 참조할 수 있게됨.
        -> 이를 풀어서 코드로 설명하면 다음과 같다

        int[] students = new int[5]; //1. 배열 생성
        int[] students = x001;       //2. new int[5]의 결과로 x001 참조값 반환 후 변수 students에 저장
        students = x001              //3. 실제로 students를 출력시 생성된 배열의 메모리 주소값이 출력됨
 */

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언  --> 일반 변수 선언과 다르게 타입에 대괄호([])가 들어간다
        students = new int[5]; // 배열 생성
        /*
        int[] students = new int[5]; //변수 선언과 동시에 생성
         */
        System.out.println(students); // 메모리의 참조값 확인해보기

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수 : " + students[0]);
        System.out.println("학생2 점수 : " + students[1]);
        System.out.println("학생3 점수 : " + students[2]);
        System.out.println("학생4 점수 : " + students[3]);
        System.out.println("학생5 점수 : " + students[4]);

    }
}
