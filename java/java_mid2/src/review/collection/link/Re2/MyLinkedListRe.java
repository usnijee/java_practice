package review.collection.link.Re2;

public class MyLinkedListRe<E> implements MyList<E> {

    private Node first;
    private int size = 0;

    @Override
    public int size() {
        return size;
    }


    // 추가 (순차 추가)
    @Override
    public void add(E o) {
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
    @Override
    public void add(E o, int index) {
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

    @Override
    public void set(int index, E e) {
        Node<E> node = getNode(index);
        node.item = e;
    }

    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    public E remove(int index) {
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

    private class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node x = this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if (x.next != null) {
                    sb.append("->");
                }
                x = x.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

}
