
public class ArrayQueue <E> implements Queue<E>{
    final static int CAPACITY=100;
    E [] data;
    private int f=0;
    private int sz=0;
    public ArrayQueue( int c) {
        data= (E[]) new Object[c];
    }
    public ArrayQueue(){
        this(CAPACITY);

    }


    @Override
    public boolean isEmpty() {
        return sz==0;
    }

    @Override
    public int Size() {
        return sz;
    }

    @Override
    public void enqueue(E element) {
    if (Size()== data.length)
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
    public E first() {
        if (isEmpty())
            return null;
        return data[f];
    }
}
