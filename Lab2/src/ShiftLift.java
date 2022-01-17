import java.util.Arrays;

public class ShiftLift {
    public static void main(String[] args) {
        int [] a={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("after");
        System.out.println(Arrays.toString(shift(a)));
    }
    public static int [] shift(int [] x){
        int t= x[0];
        for (int i = 0; i < x.length-1; i++) {
            x[i]=x[i+1];
        }
        x[x.length-1]=t;
        return x;
    }
}
