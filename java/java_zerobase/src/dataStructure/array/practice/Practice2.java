package dataStructure.array.practice;

public class Practice2 {

    public static void main(String[] args) {

        int target = 100;
        int[] arr = {1, 1, 100, 1, 1, 1, 100};
//        int[] reuslt = new int[arr.length];
//        int idx = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                reuslt[++idx] = i;
//            }
//        }

//        System.out.println("결과: " + reuslt[idx]);

        int idxMax = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (i > idxMax) {
                    idxMax = i;
                }
            }
        }

        if (idxMax >= 0) {
            System.out.println("결과: " + idxMax);
        }

    }
}
