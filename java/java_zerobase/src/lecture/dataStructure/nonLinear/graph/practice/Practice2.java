package lecture.dataStructure.nonLinear.graph.practice;// Practice2
// 주어진 그래프에서 시작 노드에서 끝 노드로 가는 길이 있는지 확인하는 프로그램을 작성하세요.
// path 가 존재하면 true 없으면 false 출력

// 입력 예시)
// 노드 개수 = 3
// 간선 정보  = {{0, 1}, {1, 2}, {2, 0}}
// 출발 노드 = 0
// 종착 노드 = 2
// 출력 : true

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

class Node {
    int id;
    Node next;

    public Node(int id, Node next) {
        this.id = id;
        this.next = next;
    }
}

class MyGraphList {
    int vertices[];
    Node[] adjList;
    int elemCnt;

    public MyGraphList() {}
    public MyGraphList(int size) {
        this.vertices = new int[size];
        this.adjList = new Node[size];
        this.elemCnt = 0;
    }

    public boolean isFull() {
        return this.elemCnt == this.vertices.length;
    }

    public void addVertex(int data) {
        if (isFull()) {
            System.out.println("Graph is full!");
            return;
        }

        this.vertices[elemCnt++] = data;
    }

    public void addEdge(int x, int y) {
        this.adjList[x] = new Node(y, this.adjList[x]);
        this.adjList[y] = new Node(x, this.adjList[y]);
    }
}

public class Practice2 {
    public static void solution(int n, int[][] edges, int source, int dest) {
        MyGraphList graph = new MyGraphList(n);

        // 정점 추가
        for (int i = 0; i < n; i++) {
            graph.addVertex(i);
        }

        // 간선 추가
        for (int i = 0; i < edges.length; i++) {
            graph.addEdge(edges[i][0], edges[i][1]);
        }

        // 방문한 대상을 저장하는 공간
        ArrayList<Integer> visitedItem = new ArrayList<>();

        // 깊이 우선 탐색에 의한 그래프 탐색
        dfs(graph, 0, visitedItem);

        // 방문 순서가 유지된 visitedItem에서 contains를 통해 특정 경로 확인
        if (visitedItem.contains(source) && visitedItem.contains(dest)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void dfs(MyGraphList graph, int id, ArrayList<Integer> visitedItem) {
        boolean[] visited = new boolean[graph.vertices.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(id);
        visited[id] = true;

        while (!stack.isEmpty()) {
            int curId = stack.pop();
            visitedItem.add(curId); // 방문한 대상은 따로 보관 -> while문을 다 돌면 방문 순서에 맞게 visitedItem이 구성됨

            Node cur = graph.adjList[curId]; // curId에 해당하는 노드를 cur에 저장
            while (cur != null) {
                if (visited[cur.id] == false) {
                    stack.push(cur.id);
                    visited[cur.id] = true;
                }
                cur = cur.next;
            }
        }
    }

    public static void main(String[] args) {
        // Test code
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0;
        int dest = 2;
        solution(n, edges, source, dest);

        n = 6;
        edges = new int[][]{{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        source = 0;
        dest = 5;
        solution(n, edges, source, dest);
    }
}
