import java.util.Arrays;
import java.util.Scanner;

public class InserionSort {



        int[]x;
        int numOfElements;

        public InserionSort() {
            x=new int[5];
            numOfElements =0;
        }
        public int delete()
        {
            if (numOfElements >0)
            {
                x[numOfElements -1]=-1;
                numOfElements--;
                return 0;

            }
            return -1;
        }
        public int addSortedElement(int e)
        {
            if (numOfElements <x.length)
            {
                int i= numOfElements;
                while(i>0&&e<x[i-1])
                {
                    x[i]=x[i-1];
                    i--;
                }
                x[i]=e;
                numOfElements++;
                return 0;
            }
            return -1;
        }

        public static void main(String[] args) {
            InserionSort Array1=new InserionSort();
            Scanner scanner=new Scanner(System.in);
            System.out.println("Input elements");
            for (int i = 0; i <7 ; i++) {
                if(Array1.addSortedElement(scanner.nextInt())==0)
                {
                    System.out.println("Added ");
                }
                else {
                    System.out.println("Array is fyll");
                }
                System.out.println(Arrays.toString(Array1.x));

            }
            for (int i = 0; i <7 ; i++) {
                if(Array1.delete()==0)
                {
                    System.out.println("Delleted ");
                }
                else {
                    System.out.println("Array of empte");
                }
                System.out.println(Arrays.toString(Array1.x));

            }
        }


}
