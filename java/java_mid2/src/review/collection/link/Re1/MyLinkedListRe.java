package review.collection.link.Re1;

public class MyLinkedListRe {

    private Node first;
    private int size = 0;

    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            first = newNode;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

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

    public Object set(int index, Object o) {
        Node node = getNode(index);
        Object oldItem = node.item;
        node.item = o;
        return oldItem;
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
        removedNode.next = null;
        removedNode.item = null;
        size--;
        return removedItem;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int IndexOf(Object o) {
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
