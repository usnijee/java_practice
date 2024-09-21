package array;
/*
    ArrayRef3에서 연장하여 {}만을 사용하여 배열을 생성 및 초기화 가능
 */
public class ArrayRef4 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50}; // new int[]없이도 {}만 사용하여 진행 가능 --> 전부 동적 메모리 할당이기 때문
        /*
        단,
            int[] students;
            students = {90,80,70,60,50}; 는 불가능
         */

        // for문을 사용한 배열 리팩토링 
        for(int i = 0; i < students.length; i++){  // 배열의 크기는 students.length (파이썬에서는 len(a))
            System.out.println("학생"+ (i+1) + " 점수: " + students[i]);
        }

    }
}
