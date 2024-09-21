package array;
/*
    이번에는 배열에 직접 1,2,3 숫자를 적어서 값을 할당하는 것이 아니라, 배열의 크기와 상관없이 배열에 순서대로 1씩
    증가하는 값을 입력하도록 변경해보자.
 */
public class ArrayDi6 {
    public static void main(String[] args) {
        // 2x3 2차원 배열 만들기
        // 2차원 배열도
        int[][] arr = new int[4][5];
        int i = 1;

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++;
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();                //한 행이 끝나면 라인 변경
        }
    }
}
