package dataStructure.nonLinear.tree.review;

public class Practice1Review {
    /**
     * 배열을 이용한 이진 트리 구현하기 복습
     */

    public static void main(String[] args) {
        // Test code
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }

        BinaryTree bt = new BinaryTree(arr);

        System.out.println("== Preorder ==");
        bt.preOrder(0);
        System.out.println();

        System.out.println("== Inorder ==");
        bt.inOrder(0);
        System.out.println();

        System.out.println("== Postorder ==");
        bt.postOrder(0);
        System.out.println();

        System.out.println("== Levelorder ==");
        bt.levelOrder(0);
        System.out.println();
    }
}

class BinaryTree {
    char[] arr; // 기존의 데이터 저장공간

    BinaryTree(char[] data) {
        this.arr = data.clone();
    }

    public void preOrder(int idx) {
        /**
         * 전위 순회 -> 현재노드 -> 왼쪽 노드 -> 오른쪽 노드의 순서로 탐색하는 기법
         * DFS의 일종
         */
        // 트리의 노드 구성이 배열기준 : [현재, 왼쪽, 오른쪽,..]을 반복함
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        System.out.print(this.arr[idx] + " "); // 출력문을 죄측 재귀 우측 재귀보다 먼저 하여 전위 순회가 되도록 함

        // 재귀를 통해 트리를 구현
        if (left < this.arr.length) {
            /**
             * preOrder(left) 즉, 현재 노드의 좌측 자식 노드를 현재 노드로 전위 순회
             */
            this.preOrder(left);
        }

        if (right < this.arr.length) {
            /**
             * preOrder(right) 즉, 현재 노드의 우측 자식 노드를 현재 노드로 전위 순회
             */
            this.preOrder(right);
        }
    }

    public void inOrder(int idx) {

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < this.arr.length) {
            inOrder(left);
        }

        System.out.print(this.arr[idx] + " ");

        if (right < this.arr.length) {
            inOrder(right);
        }
    }

    public void postOrder(int idx) {

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < this.arr.length) {
            postOrder(left);
        }

        if (right < this.arr.length) {
            postOrder(right);
        }

        System.out.print(this.arr[idx] + " ");
    }

    public void levelOrder(int idx) {
        /**
         * 레벨 순회 : BFS의 일종으로 같은 레벨의 노드부터 전부 탐색하는 방식
         */
        for (int i = 0; i < this.arr.length; i++) {
            System.out.print(this.arr[idx] + " ");
        }
        System.out.println();
    }

}
