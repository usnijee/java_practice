package lecture.dataStructure.nonLinear.tree;

// Practice3
// 트리 구조 복습 / 구현

import java.util.LinkedList;
import java.util.Queue;

public class Practice3 {

    public static void main(String[] args) {
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }

        BinaryTree3 bt = new BinaryTree3(arr);

        // Root node
        System.out.println("Root: " + bt.head.data);


        // B's child node
        Node2 B = bt.searchNode('B');

        if (B.left != null) {
            System.out.println("B's left child node: " + B.left.data);
        }
        if (B.right != null) {
            System.out.println("B's rigthchild node: " + B.right.data);
        }

        // F's parent node

        Node2 F = bt.searchNode('F');
        System.out.println("F's parent node: " + F.parent.data);

        // Leaf node (말단 노드)
//        int cnt = 1;
        System.out.print("Leaf Nodes: ");
        for (int i = 0; i < arr.length; i++) {
            Node2 cur = bt.searchNode(arr[i]);
            if (cur.left == null && cur.right == null) {
//                System.out.printf("Leaf Node%d: %c\n", cnt, cur.data);
//                cnt++;
                System.out.print(cur.data + " ");
            }
        }
        System.out.println();

        // E's Depth
        Node2 E = bt.searchNode('E');
        Node2 cur = E;
        int cnt = 0;

        while (cur.parent != null) {
            cur = cur.parent;
            cnt++;
        }
        System.out.println(cnt);

        // Level2 Node
        // Level2라는 것은 depth가 2라는 의미 -> Level0이 최상단 노드를 의미하기 때문
        System.out.print("Level2 nodes: ");
        for (int i = 0; i < arr.length; i++) {
            Node2 target = bt.searchNode((char)('A' + i));
            cur = target;
            cnt = 0;

            while (cur.parent != null) {
                cur = cur.parent;
                cnt++;
            }

            if (cnt == 2) {
                System.out.print(target.data + " ");
            }
        }
        System.out.println();

        // Height
        System.out.print("Height: ");
        int maxCnt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            Node2 target = bt.searchNode((char) ('A' + i));
            cur = target;
            cnt = 0;
            while (cur.parent != null) {
                cur = cur.parent;
                cnt++;
            }

            if (cnt > maxCnt) {
                maxCnt = cnt;
            }
        }
        System.out.println(maxCnt);


        // B's Size
        // B포함 하위 노드의 개수
        int size = bt.checkSize('B');
        System.out.println("B size = " + size);


    }

}
class BinaryTree3 {
    Node2 head;

    public BinaryTree3(char[] arr) {
        Node2[] nodes = new Node2[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nodes[i] = new Node2(arr[i], null, null, null);
        }

        for (int i = 0; i < arr.length; i++) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < arr.length) {
                nodes[i].left = nodes[left];
                nodes[left].parent = nodes[i];
            }

            if (right < arr.length) {
                nodes[i].right = nodes[right];
                nodes[right].parent = nodes[i];
            }
        }
        this.head = nodes[0];
    }

    public Node2 searchNode(char data) {
        Queue<Node2> queue = new LinkedList<>();
        queue.add(this.head);
        while (!queue.isEmpty()) {
            Node2 cur = queue.poll();
            if (cur.data == data) {
                return cur;
            }

            if (cur.left != null) {
                queue.offer(cur.left);
            }

            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        return null;
    }

    public Integer checkSize(char data) {
        Node2 node = this.searchNode(data);

        Queue<Node2> queue = new LinkedList<>();
        queue.add(node);
        int size = 0;
        while (!queue.isEmpty()) {
            Node2 cur = queue.poll();

            if (cur.left != null) {
                queue.offer(cur.left);
                size++;
            }

            if (cur.right != null) {
                queue.offer(cur.right);
                size++;
            }
        }
        return size + 1;
    }
}

class Node2 {
    char data;
    Node2 left;
    Node2 right;
    Node2 parent;

    public Node2(char data, Node2 left, Node2 right, Node2 parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
}
