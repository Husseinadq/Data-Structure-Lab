import java.util.Arrays;

public class CloneArray {
    static int [] y;
    public static void backup(int x[])
    {
        y=new int[x.length];
        for (int i = 0; i < x.length; i++) {
            y[i]=x[i];
        }
    }

    public static void main(String[] args) {
        int[] x={1,2,3,4,5,4};
        backup(x);
        System.out.println("x = "+Arrays.toString(x));
        System.out.println("y = "+Arrays.toString(y));
    }
}
