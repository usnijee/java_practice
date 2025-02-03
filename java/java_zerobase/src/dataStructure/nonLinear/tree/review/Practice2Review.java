package dataStructure.nonLinear.tree.review;

import java.util.LinkedList;
import java.util.Queue;

public class Practice2Review {

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

    BinaryTree2(char[] arr) {
        /**
         * arr의 idx기준으로 아직 data가 없는 빈 node 형성
         * [node0, node1, node2,...]
         */
        Node[] nodes = new Node[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node(arr[i], null, null);
        }

        // 생성한 빈노드의 left, right를 트리에 맞게 연결하기
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
        // head는 첫번째 노드로 설정
        this.head = nodes[0];
    }

    public void preOrder(Node node) { // 현재 노드를 parameter로 input
        if (node == null) {
            return;
        }

        System.out.print(node.data + " "); //현
        this.preOrder(node.left); //좌
        this.preOrder(node.right); //우
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }

        this.inOrder(node.left);
        System.out.print(node.data + " ");
        this.inOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.print(node.data + " ");
    }

    public void levelOrder(Node node) {

        Queue<Node> queue = new LinkedList<>();

        queue.add(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();

            System.out.print(cur.data + " "); // 현 -> 좌 -> 우 순으로 출력
            if (cur.left != null) {
                // 현재 노드의 좌측 노드부터 queue에 offer
                queue.offer(cur.left);
            }

            if (cur.right != null) {
                // 좌측노드를 다 넣었으면 우측 노드를 queue에 offer
                queue.offer(cur.right);
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
