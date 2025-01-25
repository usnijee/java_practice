package lecture.dataStructure.array.practice;

public class Practice5 {

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 6, 1};
        int[] visited = new int[arr.length];
        int visitCnt = 0;
        int minVal = Integer.MIN_VALUE;
        int minIdx = -1;

        while (visitCnt < arr.length) {
            // for문을 통해 arr을 한바퀴 돌면서 최소값을 추출하여 minVal에 저장
            // 해당 값의 인덱스를 minIdx로 지정
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < minVal && visited[i] == 0) { // visited[i] = 1 이 되면 해당 인덱스의 값은 이미 연산한 것이므로 넘어가기 위함
                    minVal = arr[i];
                    minIdx = i;
                }
            }

            if (minIdx != -1) {
                System.out.print(minVal + " ");
                visited[minIdx] = 1; // minIdx는 arr에서 더이상 고려할 필요 없게 visited[minIdx]에 1을 저장
                visitCnt++;
            }

            minVal = Integer.MAX_VALUE;
            minIdx = -1;
        }
        System.out.println();
    }
}
