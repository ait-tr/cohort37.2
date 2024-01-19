public interface MyList<E>  extends Iterable<E> {
    int size();
    E get(int index);

    void add(E element);

}
