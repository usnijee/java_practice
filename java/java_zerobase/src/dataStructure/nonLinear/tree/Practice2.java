package dataStructure.nonLinear.tree;

// Practice2
// 연결 리스트를 이용한 이진 트리 구성, 순회

import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {

    public static void main(String[] args) {
        // Test code
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }

        BinaryTree2 bt = new BinaryTree2(arr);

        System.out.println("== Preorder ==");
        bt.preOrder(bt.head);
        System.out.println();

        System.out.println("== Inorder ==");
        bt.inOrder(bt.head);
        System.out.println();

        System.out.println("== Postorder ==");
        bt.postOrder(bt.head);
        System.out.println();

        System.out.println("== Levelorder ==");
        bt.levelOrder(bt.head);
        System.out.println();
    }
}

class BinaryTree2 {
    Node head;

    BinaryTree2() {}
    BinaryTree2(char[] arr) {
        // arr의 idx기준으로 아직 data가 없는 빈 node 형성
        Node[] nodes = new Node[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i], null, null);
        }

        /**
         * 빈 노드의 left , right를 트리 구조에 맞게 연결해주기
         */
        for (int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.length) {
                nodes[i].left = nodes[left];
            }

            if (right < arr.length) {
                nodes[i].right = nodes[right];
            }
        }
        this.head = nodes[0];
    }

    // 전위 순회
    public void preOrder(Node node) {
        if (node == null) {
            // 탈출 조건
            return;
        }

        System.out.print(node.data + " ");
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    public void inOrder(Node node) {
        if (node == null) {
            // 탈출 조건
            return;
        }

        this.inOrder(node.left);
        System.out.print(node.data + " ");
        this.inOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            // 탈출 조건
            return;
        }

        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrder(Node node) {
        /**
         * levelOrder은 A부터 순차적으로 꺼내오면 되는데
         *
         * head(최상단 노드)부터 queue에 넣고 poll을 통해 peek값을 출력한 후
         * 해당 poll한 값의 자식 노드가 있다면 queue에 이들을 추가하여 queue가 전부
         * poll 될때까지 반복하면 된다
         */
        Queue<Node> levelQueue = new LinkedList<>();

        levelQueue.add(node);
        while (!levelQueue.isEmpty()) {
            Node cur = levelQueue.poll();

            System.out.print(cur.data + " ");
            if (cur.left != null) {
                levelQueue.offer(cur.left);
            }

            if (cur.right != null) {
                levelQueue.offer(cur.right);
            }
        }

    }
}

class Node {
    char data;
    Node left;
    Node right;

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

