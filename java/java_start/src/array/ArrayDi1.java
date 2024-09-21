package array;
/*
    2차원 배열 리팩토링 -> for문을 활용하여 출력하기
 */
public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        int[][] arr = new int[2][3]; // row:2, col:3

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for(int row = 0; row < 2; row++){
            System.out.print(arr[row][0] + " "); //0열 출력
            System.out.print(arr[row][1] + " "); //1열 출력
            System.out.print(arr[row][2] + " "); //2열 출력
            System.out.println();                //한 행이 끝나면 라인 변경
        }
//        //0행 출력
//        System.out.print(arr[0][0] + " "); //0열 출력
//        System.out.print(arr[0][1] + " "); //1열 출력
//        System.out.print(arr[0][2] + " "); //2열 출력
//        System.out.println();                //한 행이 끝나면 라인 변경
//
//        //1행 출력
//        System.out.print(arr[1][0] + " "); //0열 출력
//        System.out.print(arr[1][1] + " "); //1열 출력
//        System.out.print(arr[1][2] + " "); //2열 출력
//        System.out.println();                //한 행이 끝나면 라인 변경

    }
}
