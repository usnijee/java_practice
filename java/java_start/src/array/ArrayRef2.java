package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언  --> 일반 변수 선언과 다르게 타입에 대괄호([])가 들어간다
        students = new int[5]; // 배열 생성
        /*
        int[] students = new int[5]; //변수 선언과 동시에 생성
         */
//        System.out.println(students); // 메모리의 참조값 확인해보기

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // for문을 사용한 배열 리팩토링
        for(int i = 0; i < students.length; i++){  // 배열의 크기는 students.length (파이썬에서는 len(a))
            System.out.println("학생"+ (i+1) + " 점수: " + students[i]);
        }

    }
}
