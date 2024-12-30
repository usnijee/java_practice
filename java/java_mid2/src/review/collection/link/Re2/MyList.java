package review.collection.link.Re2;

public interface MyList<E> {

    int size();

    void add(E e);

    void add(E e, int index);

    E get(int index);

    void set(int index, E e);

    E remove(int index);

    int indexOf(E e);

}
