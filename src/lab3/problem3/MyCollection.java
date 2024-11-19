package lab3.problem3;


public interface MyCollection<E> extends Iterable<E> {

    boolean add(E element);

    boolean addAll(MyCollection<E> elements);

    boolean remove(E element);

    boolean contains(E element);

    int size();

    boolean isEmpty();

    void clear();
}