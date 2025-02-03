package lecture.algorithm.binarySearch.practice;

// Practice1
// 이진 탐색 추가 구현
// target 값이 arr 내에 있으면 해당 인덱스 반환
// 없으면 해당 값이 있을 경우의 위치에 -1을 곱하고 1을 뺀 값을 반환

// 입출력 예시
// 입력 arr: 1, 2, 5, 10, 20, 30, 40, 50, 60

// target: 30
// 출력: 5

// target: 3
// 출력: -3

public class Practice1 {
    public static int solution(int[] arr, int target) {
        //재귀를 통해 구현
        int left = 0;
        int right = arr.length - 1;
        boolean isHere = false;
        int idx = 0;

        for (int item : arr) {
            if (item == target) {
                isHere = true;
            }
        }
        if (isHere) {
            idx = binarySearch(arr, target, left, right);
        } else {
            idx = predictIdx(arr, target, idx);
        }
        return idx;
    }

    private static int predictIdx(int[] arr, int target, int idx) {
        for (int i = 0; i < arr.length; i++) {
            if (target > arr[i]) {
                idx = -1 * (i + 2);
            }
        }
        return idx;
    }

    private static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

//        int mid = (left + right) / 2;
        int mid = (left + (right - left)) / 2; // 위와의 차이점 : left + right을 하여 발생하는 오버플로우를 예방할 수 있음

        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {1, 2, 5, 10, 20, 30, 40, 50, 60};
        System.out.println(solution(arr, 30));  // 5
        System.out.println(solution(arr, 3));   // -3
        System.out.println(solution(arr, 11));  // -5
        System.out.println(solution(arr, 35));  // -7
    }
}
