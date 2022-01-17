import java.util.Scanner;

public class Managment {
    public static void main(String[] args) {
        Student [] team=new Student[3];
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < team.length; i++) {
            Student student=new Student(scanner.nextInt(),scanner.next());
            team[i]=student;
        }
        for (int i = 0; i < team.length; i++) {

            System.out.println(team[i].toString());
        }

    }
}
