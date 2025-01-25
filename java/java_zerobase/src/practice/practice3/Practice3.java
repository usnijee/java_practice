package practice.practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

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

    public static void solution(int[] arr, int k, int x) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int valueSize = 0;


        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(x - arr[i]);

            // Map의 key를 차이값으로 하여 value인 List에
            ArrayList<Integer> cur = map.get(diff);
            if (cur == null) {
                map.put(diff, new ArrayList<>(Arrays.asList(arr[i])));
            } else {
                // x와의 차에 대한 절댓값이 동일한 대상의 경우 오름차순 정렬 상태로 arrayList에 추가
                int idx = cur.size();
                for (int j = 0; j < cur.size(); j++) {
                    if (cur.get(j) > arr[i]) {
                        idx = j;
                        break;
                    }
                }
                cur.add(idx, arr[i]);
            }
        }
        TreeSet<Integer> newSet = new TreeSet<>(map.keySet()); // key의 오름 차순 정렬을 위함
        ArrayList<Integer> result = new ArrayList<>(); // 최종값 저장 공간
        int cnt = 0; // reult에 값이 추가될 때마다 1씩 증가하여 k가 될때 중단 시킴
        for (Integer key : newSet) {
            ArrayList<Integer> cur = map.get(key);
            map.remove(key);

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
