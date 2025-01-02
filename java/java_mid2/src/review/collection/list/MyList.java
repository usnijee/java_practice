package review.collection.list;

public interface MyList<E> {

    void add(E e);

    void add(int index, E e);

    int size();

    E set(int index, E e);

    E get(int index);

    E remove(int index);

    int indexOf(E e);

}
