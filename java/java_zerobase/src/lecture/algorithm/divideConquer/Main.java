package lecture.algorithm.divideConquer;

/**
 * 분할정복 알고리즘을 통해 최댓값 찾기
 */
public class Main {

    public static int getMax(int[] arr, int left, int right) {
        int m = (left + right) / 2; // 중앙값 -> 분할정복이기에 절반식 분할 하며 값을 비교
        if (left == right) {
            // 재귀호출을 계속 진행 -> left = right가 되는 경우 arr[left]를 반환 -> 계속해서 반환값을 비교하며 최댓값 구함
            return arr[left];
        }

        left = getMax(arr, left, m); // 좌측에서 지속적으로 분할하며 진행
        right = getMax(arr, m + 1, right);

        return (left > right) ? left : right;
    }


    public static void main(String[] args) {
        int arr[] = {6, 2, 9, 8, 1, 4, 17, 5};
        System.out.println(getMax(arr, 0, arr.length - 1));
    }
}
