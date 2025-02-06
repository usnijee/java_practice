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

        /**
         * graph
         * 1 → [(2,2), (3,3)]
         * 2 → [(3,4), (4,5)]
         * 3 → [(4,6)]
         * 4 → []
         * 5 → [(1,1)]
         */
        for (int i = 0; i < data.length; i++) {

            graph.get(data[i][0]).add(new Node(data[i][1], data[i][2]));
        }

        /**
         * dist = [INF, 0, INF, INF, INF, INF] , dist는 각 지점에 도달하는 최단 간선 정보를 저장
         */
        int[] dist = new int[v + 1]; // 최단 거리를 업데이트할 저장공간 생성

        for (int i = 1; i < v + 1; i++) {
            dist[i] = Integer.MAX_VALUE; // 초기 값은 Integer의 max값으로 설정
        }
        dist[start] = 0; // 시작점을 0으로 초기화

        // 다익스트라 알고리즘 적용
        PriorityQueue<Node> pq = new PriorityQueue<>((x, y) -> x.weight - y.weight); // 간선 정보가 작은것에 우선순위 부여
        pq.offer(new Node(start, 0)); // 시작 노드부터 우선순위 큐에 offer

        while (!pq.isEmpty()) {
            Node curNode = pq.poll(); // 시작 노드 방문

            if (dist[curNode.to] < curNode.weight) {
                /**
                 * 현재 노드의
                 */
                continue;
            }

            for (int i = 0; i < graph.get(curNode.to).size(); i++) {
                /**
                 * curNode -> 시작지점(갱신됨)의 인접한 노드들의 간선 정보를 비교
                 */
                Node adjNode = graph.get(curNode.to).get(i); // curNode 즉, 시작 지점과 인접한 노드

                if (dist[adjNode.to] > curNode.weight + adjNode.weight) {
                    /**
                     * 현재 curNode의 인접한 노드의 최단경로정보(현재)인 dist[adjNode.to]와
                     * curNode.weight(curNode -> adjNode 가중치) + adjNode.weight(adjNode -> adjNode.to 가중치)의 합이
                     * dist[adjNode.to](현재 adjNode.to까지 도달하는 최소거리)와 비교해서 더 작으면 이를 갱신
                     */
                    dist[adjNode.to] = curNode.weight + adjNode.weight;
                    pq.offer(new Node(adjNode.to, dist[adjNode.to]));
                    /**
                     * 즉, adjNode의 다음 인접한 노드(adjNode.to)가 새로운 시작점이 되기 때문에, 해당 노드까지의 최단 거리(dist)를 반영하여 누적하는 것
                     * 예시로 A->C 까지의 최단 거리를 구한다면 ,
                     * A -> C로 곧바로 가는 경우의 가중치도 있고,
                     * A -> B -> C 도 있을 수 있고
                     * A -> D -> E -> C 도 있을 수 있어
                     * 이때, C까지 도달하기전에 A에서 D까지의 최단 + D에서 E까지의 최단이 선행 되어야한다는 의미
                     */
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
        int to; // 다음 노드
        int weight; // 간선 정보

        public Node(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
}
