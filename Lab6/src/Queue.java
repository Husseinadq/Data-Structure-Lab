public interface Queue<E>{
    boolean isEmpty();
    int Size();
    void enqueue(E element);
    E dequeue();
    E first();


}
