package Java;
import java.util.Scanner;

class DiceApp {
    static int guess = 0, roll;
    public static void main(String[] args){
        Scanner scanf = new Scanner(System.in);
        roll = randomint(6, 1);
        while(guess !=roll)
        {
            System.out.println("Try again");
            guess = scanf.nextInt();

        }
        if(guess == roll)
        {
            System.out.println("Lucky");
        }
        scanf.close();
   }    
   static int randomint(int high,int low)
   {
       int result = (int)(Math.random()*(high-low+1))+low;
       return result;
   }
}