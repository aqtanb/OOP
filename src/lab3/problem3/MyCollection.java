package lab3.problem3;

import java.util.Comparator;

public interface MyCollection<E> extends Iterable<E> {

    boolean add(E element);

    boolean remove(E element);

    boolean contains(E element);

    int size();

    boolean isEmpty();

    void clear();
}