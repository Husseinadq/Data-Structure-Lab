import java.util.Random;
import java.util.Scanner;

public class ArrayWithFun {
    public static void output(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int[] input(){
        Scanner scanner=new Scanner(System.in);
        int[] array=new int[5];
        for (int i = 0; i <array.length ; i++) {
            array[i]=scanner.nextInt();
        }
       return array;
    }
    public static void main(String[] args) {

        output(input());
    }
}
