package array.ex;
/*
사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
 */

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int cnt = input.nextInt();

        int[][] students = new int[cnt][3]; // 4명의 학생의 3과목 점수
        int[] sum = new int[cnt];
        double[] avg = new double[cnt];

        for (int row = 0; row < students.length; row++){
            System.out.println((row+1)+"번 학생의 성적을 입력하세요:");
            for (int col = 0 ; col < students[row].length ; col++ ){
                if (col == 0){
                    System.out.print("국어 점수: ");
                } else if (col == 1) {
                    System.out.print("영어 점수: ");
                } else if (col == 2) {
                    System.out.print("수학 점수: ");
                }
                students[row][col] = input.nextInt();
                sum[row] += students[row][col];
            }
            avg[row] += (double) sum[row]/ students[row].length;
        }
        for (int i = 0; i < cnt; i++){
            System.out.println((i+1) + "번 학생의 총점: " + sum[i] + ", 평균: " + avg[i]);
        }
    }
}
