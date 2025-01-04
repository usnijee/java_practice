package collection.deque;

public class MyStackMain {

    private static final int DEFAULT_CAPACITY = 100001;

    private Object[] stack = new Object[DEFAULT_CAPACITY];
    private int size = 0;

    public void push(Object o) {
        stack[size] = o;
        size++;
    }

    public Object pop() {
        if (size == 0) {
            return -1;
        } else {
            size--;
            return stack[size - 1];
        }
    }

    public int Size() {
        return size;
    }

    public void empty() {
        if (size == 0) {
            return
        }
    }
}
