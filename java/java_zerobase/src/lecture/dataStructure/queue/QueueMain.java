package lecture.dataStructure.queue;

import java.util.LinkedList;
import java.util.Queue;

// 선형 자료구조 - 큐
public class QueueMain {

    public static void main(String[] args) {
        Queue queue = new LinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.contains(3));
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        queue.clear();
        System.out.println(queue);
        System.out.println(queue.poll());
        /** isEmpty가 true인 경우
         * stack의 pop() -> 예외 발생
         * queue의 poll() -> null 반환
         *
         * why?
         *
         * stack : LIFO로 명령의 기록 OR 상태 관리 및 추적에 주로 사용
         * queue : FIFO로 비어있는 상태에도 데이터를 계속 요청할 수 있는 상황에 주로 사용 (작업큐, 메시지 큐)
         *         비동기 처리에 적합 -> 예외를 발생시켜면 불필요한 자원 낭비만 늘어남
         */
    }
}
