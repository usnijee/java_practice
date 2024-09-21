package array;
/*
    2차원 배열의 길이 표현은 어떻게 할까?
        2차원 배열 -> {{},{}} 구조
        1. arr.length : row(행)의 길이를 의미 --> 쉽게 생각하면 가장 바깥 {}이 몇개의 {}로 이루어져있는지 생각하면 됨
        2. arr[row].length : column(열)의 길이를 의미
 */
public class ArrayDi5 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        // 2차원 배열도
        int[][] arr = {{1,2,3},{4,5,6}}; // row:2, col:3

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();                //한 행이 끝나면 라인 변경
        }
    }
}
