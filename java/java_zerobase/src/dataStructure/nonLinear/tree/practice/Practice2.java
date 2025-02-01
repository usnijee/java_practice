package dataStructure.nonLinear.tree.practice;

// Practice2
// 각각의 에지에 가중치가 있는 포화 이진 트리가 있다.
// 루트에서 각 리프까지의 경로 길이를 모두 같게 설정하고,
// 이 때, 모든 가중치들의 총합이 최소가 되도록 하는 프로그램을 작성하세요.


public class Practice2 {
    public static void main(String[] args) {
        // Test code
        int h = 2;
        int[] w = {2, 2, 2, 1, 1, 3};
        solution(h, w);
        System.out.println();

        h = 3;
        w = new int[]{1, 2, 1, 3, 2, 4, 1, 1, 1, 1, 1, 1, 1, 1};
        solution(h, w);
    }

    public static void solution(int h, int[] w) {
        BinaryTree bt = new BinaryTree(h, w);
        bt.dfs(1, 0);
        System.out.println(bt.res);
    }
}

class BinaryTree {
    /**
     * 이 문제는 트리에 노드의 데이터가 아닌 간선의 가중치를 저장하는 것이 keyPoint!
     */
    int h;
    int[] arr;
    int res; // 결과 -> 가중치 총합 계산

    public BinaryTree(int h, int[] w) {
        this.h = h;
        arr = new int[(int) Math.pow(2, h + 1)]; // 트리 저장공간은 그냥 일반 트리 기준으로 만들고 공간 몇개를 안 쓰는 방향으로 설계
        res = 0;

        for (int i = 2; i < (int) Math.pow(2, h + 1); i++) {
            arr[i] = w[i - 2]; // 주어진 가중치를 arr에 저장 (arr의 0,1은 비워둔다)
        }
    }

    public int dfs(int idx, int h) {
        if (this.h == h) {
            res += arr[idx];
            return arr[idx];
        }

        int left = dfs(idx * 2, h + 1);
        int right = dfs(idx * 2 + 1, h + 1);
        res += arr[idx] + Math.abs(left - right);

        return arr[idx] + Math.max(left, right);
    }
}

