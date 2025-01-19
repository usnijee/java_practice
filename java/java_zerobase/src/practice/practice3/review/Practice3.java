package practice.practice3.review;

import java.util.*;

public class Practice3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        solution(arr, 4, 3);

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        solution(arr, 5, 5);

        arr = new int[]{2, 4};
        solution(arr, 1, 3);

        arr = new int[]{2, 4};
        solution(arr, 3, 3);
    }

    private static void solution(int[] arr, int k, int x) {
        HashMap<Integer, ArrayList<Integer>> saveMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(x - arr[i]);

            ArrayList<Integer> curList = saveMap.get(diff);
            if (curList == null) {
                // diff를 key로 하는 value가 맵에 존재하지 않는경우 추가
                saveMap.put(diff, new ArrayList<>(Arrays.asList(arr[i])));
            } else {
                // key가 diff인 value는 arrayList
                // arr[i]와 기존의 arrayList의 요소를 비교하여 오름 차순 정렬이 되도록 로직 구현
                // 초기 index를 curList.size()로하여 입력인 arr[i]가 기존 요소보다 작은 경우 해당 요소보다 앞에 위치할 수 있도록 함
                int idx = curList.size();
                for (int j = 0; j < curList.size(); j++) {
                    if (curList.get(j) > arr[i]) {
                        idx = j;
                        break;
                    }
                }
                curList.add(idx, arr[i]);
            }
        }

        /**
         * 지금까지 HashMap에 x와 요소들의 차이 절댓값을 key로 하여 x와의 차이가 동일한 arr의 요소를 하나의 value에
         * ArrayList로 같이 추가하여 분류한 상태
         *
         * 이제 k개만큼 차이가 적은것부터 (key값이 작은것 부터)요소를 꺼내야함
         *
         * -> map.keySet()은 Set 자료구조이고 key가 작은순으로 순회를 해야하기에 정렬이 되어있는 TreeSet 활용
         */

        TreeSet<Integer> newSet = new TreeSet<>(saveMap.keySet());
        ArrayList<Integer> result = new ArrayList<>(); // 최종값 저장 공간
        int cnt = 0; // 순회는 크게 index를 변수화 하여 while문 또는 for each문을 사용하는것 + fori로 모든 요소 순회하는 방법이 존재

        for (Integer key : newSet) {
            ArrayList<Integer> cur = saveMap.get(key);
            saveMap.remove(key); // key에 해당하는 value 삭제하여 순회동안

            // value인 ArrayList의 모든 요소를 result에 추가시키기
            while (cur.size() > 0) {
                result.add(cur.get(0));
                cur.remove(0);
                cnt++;

                if (cnt == k) {
                    break;
                }
            }
            if (cnt == k) {
                break;
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
