package review.collection.link;

public class NodeReviewMain1 {

    public static void main(String[] args) {
        // 노드 생성하고 연결하기
        Node first = new Node("A");
        System.out.println(first);
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println(first);

        // 모든 노드 탐색하기
        System.out.println("모든 노드 탐색하기");
        printAll(first);

        // 마지막 노드 조회하기
        System.out.println("마지막 노드 조회하기");
        Node lastNode = printLastNode(first);
        System.out.println("lastNode = " + lastNode.item);

        // 특정 인덱스의 노드 조회하기
        System.out.println("특정 인덱스의 노드 조회하기");
        int index = 1;
        Node idxNode = printIdxNode(first, index);
        System.out.println("idxNode = " + idxNode.item);

        // 데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
    }

    private static void printAll(Node node) {
        Node x = node;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }

    private static Node printLastNode(Node node) {
        Node x = node;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node printIdxNode(Node node, int index) {
        Node x = node;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node node, String param) {
        Node lastNode = printLastNode(node);
        lastNode.next = new Node(param);
    }
}
