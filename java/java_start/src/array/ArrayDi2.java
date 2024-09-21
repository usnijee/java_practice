package array;
/*
    2차원 배열 리팩토링 -> for문을 활용하여 출력하기
 */
public class ArrayDi2 {
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
            for(int col = 0; col < 3; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();                //한 행이 끝나면 라인 변경
        }
    }
}
