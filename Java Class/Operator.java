import java.util.Scanner;

class Operator
{
    static int num1, num2;
    static char op;
    static Scanner scanf = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello world");
        input();   
        output();
    }
    static void input()
    {
        System.out.println("Input num1");
        num1 = scanf.nextInt();
        System.out.println("Input num2");
        num2 = scanf.nextInt();
        System.out.println("Input Operator");
        op = scanf.next().charAt(0);
    }
    static void output()
    {   
    //     System.out.println(num1);
    //     System.out.println(num2);
    //     System.out.println(op);
        switch(op)
        {
            case '+':
            System.out.println(num1 + num2);
            break;
            case '-':
            System.out.println(num1 - num2);
            break;
            case '*':
            System.out.println(num1 * num2);
            break;
            case '/':
            System.out.println(num1 + num2);
            break;
        }
    }
}