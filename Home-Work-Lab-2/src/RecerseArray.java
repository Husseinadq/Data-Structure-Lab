import java.util.Arrays;

public class RecerseArray {
    public static int[] recerse(int []x)
    {
        int []y=new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[(x.length-1)-i]=x[i];
        }
        return y;
    }

    public static void main(String[] args) {
        int [] a={11,12,13,14,15,20,7,19};
        System.out.println(Arrays.toString(a));
        System.out.println("after");
        System.out.println(Arrays.toString(recerse(a)));
    }
}
