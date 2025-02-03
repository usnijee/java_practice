package lecture.dataStructure.nonLinear.pQueue;// 비선형 자료구조 - 우선순위 큐
// 연결 리스트를 이용한 우선순위 큐
// 자바 기본 PriorityQueue

import java.util.*;

public class Main {
    public static void enqueue(LinkedList<Integer> list, int data) {
        /**
         * list는 정렬된 리스트를 의미
         */
        int idx = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > data) {
                /**
                 * data가 기존의 리스트의 i번째 값과 비교했을때 작으면
                 * data가 i번째의 값보다 우선순위가 높다는 것이기에 해당 값보다 앞에 와야하기에
                 * idx를 i로 갱신 후 break로 반복문 빠져나가기
                 */
                idx = i;
                break;
            }
        }
        list.add(idx, data); // i번째 위치에 data를 추가
    }

    public static Integer dequeue(LinkedList<Integer> list) {
        /**
         * 기존의 list가 정렬된 상태이므로 enqueue가 끝난 시점에서는 맨 앞의 data가 가장 우선순위가 높은 데이터이고
         * 그냥 get하면 된다. O(1)
         */
        if (list.size() == 0) {
            return null;
        }

        int data = list.get(0);
        list.remove(0);
        return data;
    }

    public static void main(String[] args) {
        // 연결리스트를 이용한 우선순위 큐
        System.out.println("== 연결리스트 방식의 우선순위 큐 ==");
        LinkedList<Integer> pqList = new LinkedList();
        /**
         * 값(data)이 작을수록 우선순위가 높도록 하기 -> 출력시 오름차순이 나와야함
         */
        enqueue(pqList, 5);
        enqueue(pqList, 7);
        enqueue(pqList, 3);
        enqueue(pqList, 1);
        enqueue(pqList, 9);
        System.out.println(pqList); // 오름차순으로 정렬됨

        System.out.println(dequeue(pqList));
        System.out.println(dequeue(pqList));
        System.out.println(pqList);
        System.out.println();

        // 자바 기본 PriorityQueue 사용
        System.out.println("== 자바 기본 우선순위 큐 ==");
        // 우선순위: 낮은 숫자 순
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(7);
        pq.add(3);
        pq.add(1);
        pq.add(9);
        System.out.println(Arrays.toString(pq.toArray()));

        // 우선순위: 높은 숫자 순
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(5);
        pq2.add(7);
        pq2.add(3);
        pq2.add(1);
        pq2.add(9);
        System.out.println(Arrays.toString(pq2.toArray())); // 내부의 힙구조대로 나오기에 내림차순으로 안보임

        while (!pq2.isEmpty()) {
            System.out.print(pq2.poll() + " ");
        }
    }
}
