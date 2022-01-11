import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array=new int[5];
        for (int i = 0; i <array.length ; i++) {
            array[i]=scanner.nextInt();
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }
    }
}
