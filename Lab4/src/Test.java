import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayQueue<Character> q=new ArrayQueue<>(5);
        Scanner scanner=new Scanner(System.in);
        System.out.println("THe queue is Empty "+q.isEmpty());
        System.out.println("Pleas Enter the queue element ");
        for (int i = 0; i < 5; i++) {
            q.enqueue(scanner.next().charAt(0));
            System.out.println("first element is " +q.first());
            System.out.println("Size = "+q.Size());
        }
        while(!q.isEmpty())
        {
            System.out.print(q.dequeue()+"\t");
        }
    }
}
