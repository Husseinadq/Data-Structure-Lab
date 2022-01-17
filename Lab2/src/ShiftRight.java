import java.util.Arrays;

public class ShiftRight {

        public static void main(String[] args) {
            int[] a = {11, 12, 13, 14, 15};
            System.out.println(Arrays.toString(a));
            System.out.println("after");
            System.out.println(Arrays.toString(shift(a)));
        }

        public static int[] shift(int[] x) {
            int t = x[x.length - 1];
            for (int i = x.length - 1; i > 0; i--) {
                x[i] = x[i - 1];
            }
            x[0] = t;
            return x;
        }

}