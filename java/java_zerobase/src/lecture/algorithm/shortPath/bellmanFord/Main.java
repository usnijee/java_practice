package lecture.algorithm.shortPath.bellmanFord;// 알고리즘 - 최단 경로 알고리즘
// 벨만-포드

public class Main {

    public static void main(String[] args) {
        // Test code
        /**
         * v : 노드의 수
         * e : 간선의 개수
         */
        int[][] data = {{1, 2, 8}, {1, 3, 6}, {1, 5, 5}, {2, 3, -5}, {2, 4, 1}, {2, 6, 4}, {3, 4, 4}, {4, 7, 3}, {5, 6, 5}, {6, 2, 0}, {6, 7, -7}};
        bellmanFord(7, 11, data, 1);

        data = new int[][]{{1, 2, 8}, {1, 3, 6}, {1, 5, 5}, {2, 3, -5}, {2, 4, 1}, {2, 6, 4}, {3, 4, 4}, {4, 7, 3}, {5, 6, 5}, {6, 2, -5}, {6, 7, -7}};
        bellmanFord(7, 11, data, 1);
    }

    public static void bellmanFord(int v, int e, int[][] data, int start) {
        Edge[] edge = new Edge[e]; // 간선 수 만큼 edge 만들기
        // 그래프 만들기
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge(data[i][0], data[i][1], data[i][2]);
        }

        int[] dist = new int[v + 1]; // 최단 경로 배열
        for (int i = 0; i < v + 1; i++) {
            dist[i] = Integer.MAX_VALUE; // dist배열 INF로 초기화
        }
        dist[start] = 0;

        boolean isMinusCycle = false; // 음수 사이클 여부
        for (int i = 0; i < v + 1; i++) { // 음수 사이클 확인을 위해 v+1 만큼 반복
            for (int j = 0; j < e; j++) { // 매번 모든 간선에 대해 check
                Edge cur = edge[j];

                if (dist[cur.from] == Integer.MAX_VALUE) {
                    continue;
                }

                if (dist[cur.to] > dist[cur.from] + cur.weight) {
                    dist[cur.to] = dist[cur.from] + cur.weight;

                    if (i == v) {
                        /**
                         * i가 v번째에 dist가 업데이트되면 음수사이클이 존재한다는 의미
                         */
                        isMinusCycle = true;
                    }
                }
            }
        }
        System.out.println("음수 사이클 발생: " + isMinusCycle);
        for (int i = 1; i < v; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                System.out.print("INF ");
            } else {
                System.out.print(dist[i] + " ");
            }
        }
        System.out.println();
    }

    static class Edge {
        int from;
        int to;
        int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }
}
