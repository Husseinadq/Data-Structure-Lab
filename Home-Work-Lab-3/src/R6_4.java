import java.util.Scanner;


public class R6_4 {

    public static ArrayStack transfer(ArrayStack S,ArrayStack T)
    {
        while (S.isEmpty()!=true)
        {
            T.push(S.pop());
        }
        return T;
    }
    public static void main(String[] args) {
        ArrayStack<Integer> S =new ArrayStack<>(5);
        ArrayStack<Integer> T =new ArrayStack<>(5);
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            S.push(scanner.nextInt());
            System.out.println("S Top = "+S.top());
        }
        System.out.println();
        T=transfer(S,T);
        for (int i = 0; i < 5; i++) {
            System.out.print("T Top = "+T.top());
            T.pop();
            System.out.println();

        }

    }
}
