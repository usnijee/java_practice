package lecture.dataStructure.nonLinear.graph.review;

public class GrapthMainReview {

    public static void main(String[] args) {
        // Test code
        MyGraphMatrix graph = new MyGraphMatrix(4);

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.printAdjacentMatrix();
    }
}

class MyGraphMatrix {

    char[] verticles; // 정점 배열
    int[][] adjMat; // 인접 행렬
    int elemCnt;

    public MyGraphMatrix(int size) {
        /**
         * 생성자에서 size크기만큼의 정접을 저장하는 배열과 빈 인접 행렬을 생성
         */
        this.verticles = new char[size];
        this.adjMat = new int[size][size];
        this.elemCnt = 0; // 현재 graph의 정점 개수 -> 추가될 때마다 1증가
    }

    //Graph가 가득 찼는지 확인하는 메서드
    public boolean isFull() {
        return this.elemCnt == this.verticles.length;
    }

    //그래프에 정점을 추가
    public void addVertex(char data) {
        if (isFull()) {
            System.out.println("Graph is full");
            return;
        }
        this.verticles[this.elemCnt++] = data; // elemCnt는 현재 그래프를 이루는 정점 개수
    }

    // 간선 존재시 인접행렬의 해당 위치를 1로 갱신
    // 즉, 현재 인접행렬은 모든 요소가 0인 이차원 배열인데 A<->B가 존재한다면 그 부분의 인접행렬을 갱신해주어야 한다
    // 무방향 그래프의 경우 양방향이 가능하기에 [x][y] , [y][x]를 모두 고려
    public void addEdge(int x, int y) {
        this.adjMat[x][y] = 1;
        this.adjMat[y][x] = 1;
    }

    // 방향 그래프의 경우 단방향만 고려
    public void addDirectedEdge(int x, int y) {
        this.adjMat[x][y] = 1;
    }

    // 반대로 특정 경로가 사라진 경우 인접행렬을 0으로 갱신
    public void deleteEdge(int x, int y) {
        this.adjMat[x][y] = 0;
        this.adjMat[y][x] = 0;
    }

    public void deleteDirectedEdge(int x, int y) {
        this.adjMat[x][y] = 0;
    }

    public void printAdjacentMatrix() {
        System.out.print("  ");
        for (char verticle : verticles) {
            System.out.print(verticle + " ");
        }
        System.out.println();

        for (int i = 0; i < this.elemCnt; i++) {
            System.out.print(this.verticles[i] + " ");
            for (int j = 0; j < this.elemCnt; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }

}
