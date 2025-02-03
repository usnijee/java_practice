package lecture.dataStructure.linear.array.practice;

/**
 * 배열 arr에서 중복 값을 제거한 새 배열을 만드시오.
 */
public class Practice6 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] reuslt = new int[arr.length]; // 결과 배열
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean dupFlag = false; // 이 포인트가 중요 분기 로직에 boolean이 유용
            for (int j = 0; j < cnt; j++) {
                if (arr[i] == reuslt[j]) { //arr의 특정 인덱스의 값과 result의 모든 요소를 비교하여 동일한게 있다면 즉, 중복이라면 boolean을 true로 변경
                    dupFlag = true;
                }
            }
            if (dupFlag == false) {
                reuslt[cnt++] = arr[i];
            }
        }
        for (int j = 0; j < cnt; j++) {
            System.out.print(reuslt[j] + " ");
        }
//        int idx = 0;
//
//        Arrays.sort(arr);
//
//        for (int i = 0; i < arr.length; i++) {
//            if (i == 0 || arr[i] != arr[i - 1]) {
//                reuslt[idx] = arr[i];
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(reuslt));
    }
}
