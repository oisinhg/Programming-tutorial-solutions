import java.util.Scanner;
import java.util.Random;
/**
Assignment 1 
 */
public class LotteryGame
{   public static void main(String args[])
    {
        Scanner scanIn = new Scanner(System.in);
        Random random = new Random();
        String yes;
        
        
        
        System.out.print("\f");       
        System.out.println("Would you like to partake in the Lottery Game");
        yes = scanIn.nextLine();
        
        
        System.out.print("\f");
        int guess;
        int guess2;
        int guess3;
        int number;
        int number2;
        int number3;
        number = random.nextInt(45) + 1;
        number2 = random.nextInt(45) + 1;
        number3 = random.nextInt(45) + 1;

        while(number == number2){
            number2 = random.nextInt(45) + 1;
        }

        while(number2 == number3){
            number3 = random.nextInt(45) + 1;
        }

        System.out.print("What is your first guess? ");
        guess = scanIn.nextInt();
        System.out.print("What is your Second guess? ");
        guess2 = scanIn.nextInt();
        System.out.print("What is your Third guess? ");
        guess3 = scanIn.nextInt();

        while((guess == guess2) || (guess2 == guess3) || (guess == guess3) || (guess>45) || (guess<0) || (guess>45) || (guess<0) || (guess>45) || (guess<0)){
            System.out.print("\f");
            System.out.print("Each guess must be a different value please try again");
            System.out.print("\n");
            System.out.print("What is your first guess? ");
            guess = scanIn.nextInt();
            System.out.print("What is your Second guess? ");
            guess2 = scanIn.nextInt();
            System.out.print("What is your Third guess?  ");
            guess3 = scanIn.nextInt(); 
        }

        if((number == guess) || (number == guess2) || (number == guess3) && ((number2 == guess) || (number2 == guess2) || (number2 == guess3)) && ((number3 == guess) || (number3 == guess2) || (number3 == guess3)))
        {
            System.out.println("Congrats you got all three numbers correct!");
            System.out.println("The numbers were " + number + " " + number2 + " " + number3);
            System.out.println("Your guesses were " + guess + " " + guess2 + " " + guess3);
        }
        else if(((number == guess) || (number == guess2) || (number == guess3)) && ((number2 == guess) || (number2 == guess2) || (number2 == guess3)) || ((number2 == guess) || (number2 == guess2) || (number2 == guess3)) && ((number3 == guess) || (number3 == guess2) || (number3 == guess3)) && ((number == guess) || (number == guess2) || (number == guess3)) && ((number3 == guess) || (number3 == guess2) || (number3 == guess3)))
        {
            System.out.println("Congrats you got two numbers correct!");
            System.out.println("The numbers were " + number + " " + number2 + " " + number3);
            System.out.println("Your guesses were " + guess + " " + guess2 + " " + guess3);
        }
        else if(((number == guess) || (number == guess2) || (number == guess3) || ((number2 == guess) || (number2 == guess2) || (number2 == guess3)) || ((number3 == guess) || (number3 == guess2) || (number3 == guess3))))
        {
            System.out.println("Congrats you got one of the numbers correct!");
            System.out.println("The numbers were " + number + " " + number2 + " " + number3);
            System.out.println("Your guesses were " + guess + " " + guess2 + " " + guess3);
        }
        else 
        {
            System.out.println("Unfortunately none of the numbers correct!");
            System.out.println("The numbers were " + number + " " + number2 + " " + number3);
            System.out.println("Your guesses were " + guess + " " + guess2 + " " + guess3);
     
        }
        
    
    }   
}



