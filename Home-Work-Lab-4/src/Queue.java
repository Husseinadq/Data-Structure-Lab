public interface Queue <E>{
    boolean isEmpty();
    int size();
    void enqueue(E e);
    E first();
    E dequeue();
    void rotet();
}
