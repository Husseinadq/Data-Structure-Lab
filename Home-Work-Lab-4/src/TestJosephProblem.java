import java.util.Scanner;

public class TestJosephProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        JosephuseProblem joseph=new JosephuseProblem();
        int peopel,positon;
        System.out.println("Enter the number of peopal ");
        peopel=scanner.nextInt();
        System.out.println("Enter the number of jomb");
        positon=scanner.nextInt();
        joseph.Circle(peopel,positon);

    }
}
