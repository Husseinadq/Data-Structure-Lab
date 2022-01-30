import java.util.Scanner;

public class P6_35 {
    static boolean isOperatot(char operant)
    {
        if(operant == '+' || operant == '-' || operant == '*' || operant == '/')
            return true;

        return false;
    }

    static int evaluatePostfix(String postfix)
    {
        ArrayStack<Integer> postFix = new ArrayStack<>();
        int n = postfix.length();

        for(int i=0;i<n;i++)
        {
            if(isOperatot(postfix.charAt(i)))
            {
                int op1 = postFix.pop();
                int op2 = postFix.pop();

                switch(postfix.charAt(i))
                {
                    case '+': postFix.push(op2 + op1);break;
                    case '-': postFix.push(op2 - op1);break;
                    case '*': postFix.push(op2 * op1);break;
                    case '/': postFix.push(op2 / op1);break;
                }

            }
            else
            {
                int operand = postfix.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        return postFix.pop();
    }

    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        String postfix = "42+351-*+";
        System.out.println("Enter the PostFix Expression ");
        postfix =scanner.next();
        System.out.print("The PostFix Evaluation for the Given Expression "+ postfix +" = : ");
        System.out.println(evaluatePostfix(postfix));
    }
}
