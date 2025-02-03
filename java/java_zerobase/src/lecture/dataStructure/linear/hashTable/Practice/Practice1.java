package lecture.dataStructure.linear.hashTable.Practice;

// Practice1
// 해시 테이블을 이용한 수 찾기
// 주어진 첫 번째 배열을 이용하여 해시 테이블을 초기화 한 후
// 두 번째 배열이 주어졌을 때 해당 배열 내 데이터가 해시 테이블에 있는지 확인하는 코드를 작성하세요.

// 입출력 예시)
// 배열1: 1, 3, 5, 7, 9
// 배열2: 1, 2, 3, 4, 5
// 출력: True, False, True, False, True

import java.util.Hashtable;

public class Practice1 {
    public static void solution(int[] arr1, int[] arr2) {

        Hashtable<Integer, Integer> map = new Hashtable<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (map.get(arr2[i]) != null) {
                System.out.print("True ");
            } else {
                System.out.print("False ");
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {1, 2, 3, 4, 5};
        solution(arr1, arr2);
    }
}
