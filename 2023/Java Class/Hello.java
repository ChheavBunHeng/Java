import java.util.Scanner;

import javax.swing.InputMap;

public class Hello
{
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        char[][] name = new char[10][10];
        for(int i = 1; i <= 2;i++)
        {
            for(int j = 1; j <= 5;j++)
            {
                name[i][j] = scanf.next().charAt(0); 
            }
        }
        for(int i = 1; i <= 2; i++)
        {
            for(int j = 1; j <= 5;j++)
            {
                System.out.print(name[i][j]);
            }
            System.out.println("");
        }
    }
}