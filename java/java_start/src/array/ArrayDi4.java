package array;
/*
    2차원 배열 리팩토링2 --> for문 리팩토링을 완료했다면 2차원 배열 선언 및 생성 리팩토링을 해봐야함
    
 */
public class ArrayDi4 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        // 2차원 배열도
        int[][] arr = {{1,2,3},{4,5,6}}; // row:2, col:3

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();                //한 행이 끝나면 라인 변경
        }
    }
}
