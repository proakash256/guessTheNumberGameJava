import java.util.Scanner;
import java.util.Random;
public class guessTheNumber
{
    Scanner sc = new Scanner(System.in);
    public int noOfGuesses = 0;
    public int number;
    public int input;
    guessTheNumber()
    {
        Random rand = new Random();
        this.number = rand.nextInt(10);
    }
    public void userInput()
    {
        System.out.println("\n\n\t----------------------------\n");
        System.out.print("\tGuess the Number : ");
        this.input = sc.nextInt();
        System.out.println("\n\n\t----------------------------\n");
    }
    boolean isCorrect()
    {
        ++noOfGuesses;
        if(input == number)
        {
            System.out.println("\n\n\t----------------------------\n");
            System.out.println("\tYES !! You guessed it Right...\n");
            System.out.println("\tThe Number is " +input +".\n");
            System.out.println("\tYou guessed it in " +noOfGuesses +" Guesses.\n");
            System.out.println("\n\t----------------------------\n");
            return true;
        }
        else if(input < number)
        {
            System.out.println("\n\n\t----------------------------\n");
            System.out.println("\tToo Low...Try Again !!\n");
            System.out.println("\n\t----------------------------\n");
        }
        else if(input > number)
        {
            System.out.println("\n\n\t----------------------------\n");
            System.out.println("\tToo High...Try Again !!\n");
            System.out.println("\n\t----------------------------\n");
        }
        return false;
    }
    public static void main(String args[])
    {
        guessTheNumber game = new guessTheNumber();
        System.out.println("\n\n\t-------------------------------------\n");
        System.out.println("\tThe Computer will generate a Random Number.\n");
        System.out.println("\tYou have to guess the Number in Minimum\n");
        System.out.println("\tNumber of Attempts...Let's Go !!\n");
        System.out.println("\n\t---------------------------------------\n");
        boolean b = false;
        while(!b) {
            game.userInput();
            b = game.isCorrect();
        }
    }
}
