import java.util.Scanner;

public class R6_5 {

    public static ArrayStack remov(ArrayStack s)
    {
       while (s.isEmpty()!=true)
       {
           s.pop();
       }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayStack<Integer> s=new ArrayStack<>(5);
        for (int i = 0; i < 5; i++) {
            s.push(scanner.nextInt());
        }
        System.out.println("Is Empty befor "+s.isEmpty());
        s=remov(s);
        System.out.println("Is Empty after "+s.isEmpty());

    }
}
