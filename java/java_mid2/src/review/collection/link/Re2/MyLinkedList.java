package review.collection.link.Re2;

import org.w3c.dom.NamedNodeMap;

public class MyLinkedList {

    private Node first;
    private int size = 0;

    // 추가 (순차 추가)
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
        for (int i = 0; i < size; i++) {
            x = x.next;
        }
        return x;
    }

    // 특정 인덱스에 추가
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
    }

    public void set(int index, Object object) {
        Node node = getNode(index);
        node.item = object;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    public Object remove(int index) {
        Node removedNode = getNode(index);
        Object removedItem = removedNode.item;
        if (index == 0) {
            first = removedNode.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removedNode.next;
        }
        removedNode = null;
        removedItem = null;
        size--;
        return removedItem;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

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

}
