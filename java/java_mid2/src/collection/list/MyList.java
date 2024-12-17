/**
 * ArrayList와 LinkedList를 구현해본 결과 기능이 대부분 유사했음 -> 인터페이스의 구현체로 관리
 */
package collection.list;

public interface MyList<E> {

    int size();

    void add(E e);

    void add(int index, E e);

    E get(int index);

    E set(int index, E element);

    E remove(int index);

    int indexOf(E o);
}
