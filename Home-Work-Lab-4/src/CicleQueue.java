public class CicleQueue<E> implements Queue<E> {

    final static int CAPACITY=100;
    E [] data;
    private int f=0;
    private int sz=0;
    public CicleQueue( int c) {
        data= (E[]) new Object[c];
    }
    public CicleQueue(){
        this(CAPACITY);

    }


    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
        if (size()== data.length)
            throw new IllegalStateException("Queue is full");
        int x =(f+sz)% data.length;
        data[x]=element;
        sz++;

    }

    @Override
    public E dequeue() {
        if (isEmpty())return null;
        E delete=data[f];
        data[f]=null;
        sz--;
        f=(f+1)% data.length;
        return delete;
    }

    @Override
    public void rotet() {
       enqueue(dequeue());
    }

    @Override
    public E first() {
        if (isEmpty())
            return null;
        return data[f];
    }
}
