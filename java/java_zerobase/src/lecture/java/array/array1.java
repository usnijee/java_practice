package lecture.java.array;

import java.util.Arrays;

public class array1 {

    public static void main(String[] args) {

        // 1. 일차원 배열
        System.out.println("== 일차원 배열 ==");
        int[] myArray = {1, 2, 3};
        System.out.println("myArray[1] = " + myArray[1]);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        for (int i : myArray) {
            System.out.println(i);
        }

        // 2. 이차원 배열
        System.out.println("== 이차원 배열 ==");
        int[][] myArray2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("myArray2[1][2] = " + myArray2[1][2]);

        for (int i = 0; i < myArray2.length; i++) { // 다차원 배열에서 기본 length는 행의 개수
            for (int j = 0; j < myArray2[i].length; j++) { // 다차원 배열의 행은 하나의 일차원 배열이기에 일차원 배열의 length
                System.out.println(myArray2[i][j]);
            }
        }

        for (int[] ints : myArray2) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

//      Q1. 아래와 같이 3x3 행렬이 2차원 배열로 초기화 되어있다.
//          모든 원소를 1로 변경하고, 대각 원소는 10으로 변경하시오.
        int [][] testArray1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < testArray1.length; i++) {
            for (int j = 0; j < testArray1[i].length; j++) {
                if (i == j) {
                    testArray1[i][j] = 10;
                } else {
                    testArray1[i][j] = 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(testArray1)); // Arrays.deeptoString()을 통해 다차원 배열도 배열 모양 유지한채 출력 가능

    }

}
