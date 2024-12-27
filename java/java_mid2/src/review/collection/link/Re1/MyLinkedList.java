package review.collection.link.Re1;

public class MyLinkedList {

    private Node first;
    private int size = 0;

    // LinkedList에서 노드를 순차적으로 추가
    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    // 특정 인덱스 위치에 Node 추가
    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    // 특정 인덱스의 item 변경
    public Object set(int index, Object o) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = o;
        return oldValue;
    }

    // 특정 인덱스의 노드 제거
    public Object remove(int index) {
        Node removeNode = getNode(index);
        Object removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        removeNode.item = null; // 이 부분 중요 -> null을 명시해야만 GC에 의해 제거됨
        removeNode.next = null;
        size--;
        return removedItem;
    }

    // 특정 인덱스의 노드의 item 반환
    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    // 특정 인덱스 위치의 Node 반환
    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    // 특정 item값을 가지는 노드의 인덱스 반환
    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyLinkedListV2{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
