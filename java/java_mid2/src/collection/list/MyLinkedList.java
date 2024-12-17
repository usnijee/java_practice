package collection.list;

public class MyLinkedList<E> implements MyList<E>{

    private Node<E> first;
    private int size = 0;

    // add : 마지막에 데이터 추가
    @Override
    public void add(E e) {
        Node<E> newNode = new Node(e);
        if (first == null) {
            first = newNode;
        } else {
            Node<E> lastNode = getLastNode(); // O(n)
            lastNode.next = newNode;
        }
        size++;

    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) { //
            x = x.next;
        }
        return x;
    }

    // 추가 코드
    // 특정 index 위치에 노드 add
    @Override
    public void add(int index, E e) {
        Node<E> newNode = new Node<>(e);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size ++;
    }

    // 특정 index의 값 변경
    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    // 추가 코드
    // 삭제
    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if (index == 0) {
            first = removeNode.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removeNode.next;
        }
        /**
         *  GC는 메모리 참조값을 기준으로 작동한다.
         *  GC는 더 이상 참조되지 않는 객체를 찾아 제거하기 때문에
         *  제거 대상이 참조되고 있거나 다른 객체를 참조하고 있다면 GC는 이를 삭제하지 않음
         *  따라서, 명시적으로 null을 통해 참조값을 제거해야한다.
         */
        removeNode.item = null;
        removeNode.next = null;
        size--;
        return removedItem;
    }

    // 특정 index의 value값 조회
    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    // 특정 index의 노드 조회 메서드
    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    @Override
    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {

        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x = this;
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
