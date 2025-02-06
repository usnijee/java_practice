package lecture.algorithm.shortPath.dijkstra;// 알고리즘 - 최단 경로 알고리즘
// 다익스트라 기본 구현


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Test code
        // {시작점, 도착점, 가중치}
        // v : 노드 개수 , start : 시작 지점
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
            /**
             * graph를 구성
             * graph.get(data[i][0]) : 각 노드
             * graph.get(data[i][0]).add(new Node(data[i][1], data[i][2]));
             * -> i를 시작점으로 하고 i를 시작점으로 하고 next 노드의 정보가 저장 되어 있는  노드를 생성
             */
            graph.get(data[i][0]).add(new Node(data[i][1], data[i][2]));
        }

        /**
         * dist : 시작점 기준 목표 지점까지의 최단 거리를 노드별로 저장하기 위한 배열
         */

        int[] dist = new int[v + 1]; // 최단 거리를 업데이트할 저장공간 생성

        for (int i = 1; i < v + 1; i++) {
            dist[i] = Integer.MAX_VALUE; // 초기 값은 Integer의 max값으로 설정
        }
        dist[start] = 0; // 시작점을 0으로 초기화

        boolean[] visited = new boolean[v + 1]; // 방문여부 배열 -> false로 초기화

        for (int i = 0; i < v; i++) {
            int minDist = Integer.MAX_VALUE;
            int curIdx = 0; // 현재 정보를 담는 임시 변수
            for (int j = 0; j < v + 1; j++) {
                if (!visited[j] && dist[j] < minDist) {
                    minDist = dist[j];
                    curIdx = j;
                }
            }

            visited[curIdx] = true; // 방문함

            for (int j = 0; j < graph.get(curIdx).size(); j++) {
                Node adjNode = graph.get(curIdx).get(j);
                if (dist[adjNode.to] > dist[curIdx] + adjNode.weight) {
                    dist[adjNode.to] = dist[curIdx] + adjNode.weight;
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
