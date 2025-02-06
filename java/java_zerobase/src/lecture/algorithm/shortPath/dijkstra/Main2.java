package lecture.algorithm.shortPath.dijkstra;// 다익스트라 우선순위 큐 사용

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 우선순위 큐를 활용한 다익스트라 방식
 */

public class Main2 {

    public static void main(String[] args) {
        // Test code
        int[][] data = {{1, 2, 2}, {1, 3, 3}, {2, 3, 4}, {2, 4, 5}, {3, 4, 6}, {5, 1, 1}};
        dijkstra(5, data, 1);
    }

    public static void dijkstra(int v, int[][] data, int start) {
        /**
         * 그래프 구성
         */
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < v + 1; i++) {
            // v+1까지 한 이유는 1~5번 노드를 구현하기 위함 첫번째 0은 나중에 사용 x
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < data.length; i++) {
            graph.get(data[i][0]).add(new Node(data[i][1], data[i][2]));
        }

        int[] dist = new int[v + 1]; // 최단 거리를 업데이트할 저장공간 생성

        for (int i = 1; i < v + 1; i++) {
            dist[i] = Integer.MAX_VALUE; // 초기 값은 Integer의 max값으로 설정
        }
        dist[start] = 0; // 시작점을 0으로 초기화

        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> x.weight - y.weight); // 간선 정보가 작은것에 우선순위 부여
        pq.offer(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node curNode = pq.poll();

            if (dist[curNode.to] < curNode.weight) {
                /**
                 * 현재 노드의
                 */
                continue;
            }

            for (int i = 0; i < graph.get(curNode.to).size(); i++) {
                Node adjNode = graph.get(curNode.to).get(i);

                if (dist[adjNode.to] > curNode.weight + adjNode.weight) {
                    dist[adjNode.to] = curNode.weight + adjNode.weight;
                    pq.offer(new Node(adjNode.to, dist[adjNode.to]));
                }
            }
        }

        for (int i = 1; i < v + 1; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.print("INF ");
            } else {
                System.out.print(dist[i] + " ");
            }
        }
        System.out.println();
    }

    static class Node {
        int to;
        int weight;

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}
