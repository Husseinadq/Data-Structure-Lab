import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation2 {
    int[]x;
    int numOfElements;

    public ArrayOperation2() {
        x=new int[5];
        numOfElements =0;
    }
    public int add(int e)
    {
        if (numOfElements <x.length)
        {
            x[numOfElements]=e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayOperation2 Array1=new ArrayOperation2();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input elements");
        for (int i = 0; i <7 ; i++) {
            if(Array1.add(scanner.nextInt())==0)
            {
                System.out.println("Added ");
            }
            else {
                System.out.println("Array is fyll");
            }
            System.out.println(Arrays.toString(Array1.x));

        }
    }
}
