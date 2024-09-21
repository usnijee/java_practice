package array;
/*
    배열 리팩토링 -> {}을 사용하여 배열 생성과 동시에 초기화가 가능
 */
public class ArrayRef3 {
    public static void main(String[] args) {
        int[] students = new int[]{90,80,70,60,50}; // 변수 선언 + 배열 생성 + 배열 초기화를 동시에 진행

//        //변수 값 대입
//        students[0] = 90;
//        students[1] = 80;
//        students[2] = 70;
//        students[3] = 60;
//        students[4] = 50;

        // for문을 사용한 배열 리팩토링 
        for(int i = 0; i < students.length; i++){  // 배열의 크기는 students.length (파이썬에서는 len(a))
            System.out.println("학생"+ (i+1) + " 점수: " + students[i]);
        }

    }
}
