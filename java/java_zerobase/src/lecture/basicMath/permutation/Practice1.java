package lecture.basicMath.permutation;// Practice1
// 1, 2, 3, 4 를 이용하여 세자리 자연수를 만드는 방법 (순서 O, 중복 x)의 각 결과를 출력하시오
// 방법 1

public class Practice1 {
    void permutation(int[] arr, int depth, int n, int r) {

        if (depth == r) {
            /**
             * r : 자리 수
             * depth는 각 자리를 의미  ex. depth = 1이면 일의 자리
             *
             * 즉, depth가 r이 되었다는 것은 원하는 자리수에 도달했음을 의미
             */
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }

    }

    private void swap(int[] arr, int depth, int index) {
        int tmp = arr[depth];
        arr[depth] = arr[index];
        arr[index] = tmp;
    }


    public static void main(String[] args) {
//      Test code
        int[] arr = {1, 2, 3, 4};

        Practice1 p = new Practice1();
        p.permutation(arr, 0, 4, 3);
    }
}
