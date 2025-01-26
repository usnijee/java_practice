package dataStructure.linear.array.practice;

import java.util.Arrays;

public class Practice5 {

    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 6, 1};

        //1. Arrays.sort() 사용
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        //2. 인덱싱
        int[] visited = new int[arr.length];
        int visitCnt = 0;
        int minVal = Integer.MAX_VALUE;
        int minIdx = -1;

        System.out.println(Arrays.toString(visited));

        while (visitCnt < arr.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minVal && visited[i] == 0) {
                    minVal = arr[i];
                    minIdx = i;
                }
            }

            if (minIdx != -1) {
                System.out.print(minVal + " ");
                visited[minIdx] = 1;
                visitCnt++;
            }

            minVal = Integer.MAX_VALUE;
            minIdx = -1;
        }
        System.out.println();
    }
}
