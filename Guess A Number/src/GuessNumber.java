
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.Scanner;

public class GuessNumber
{

  public static void main(String[] args)
  {
    // Create a random number
    int randomNumber = (int) (Math.random() * 101);

    // Ask for the player's name
    System.out.println("\nPlayer name: ");
    Scanner input = new Scanner(System.in);
    String playerName = input.nextLine();

    System.out.println("Guess a magic number between 0 and 100");

    // Assign values for number of guesses and the player's guess
    int guess = -1;
    int guessNumber = 0;

    // While loop used to check the player's input and give an output
    while (guess != randomNumber)
    {

      // Get the player's input
      System.out.println("\nEnter your guess: ");
      guess = input.nextInt();
      guessNumber++;

      // Output if the guess == randomNumber
      if (guess == randomNumber)
      {
        if (guessNumber < 4)
        {
          System.out.println("It took you " + guessNumber
            + " guesse(s) in order to find the magic number.");
          System.out.println(playerName + " is an Epic Gamer!");
        }
        else if (guessNumber >= 4 && guessNumber <= 7)
        {
          System.out.println("It took you " + guessNumber
            + " guesse(s) in order to find the magic number.");
          System.out.println(playerName + " didn't do too bad.");
        }
        else
        {
          System.out.println("It took you " + guessNumber
            + " guesse(s) in order to find the magic number.");
          System.out.println(playerName + " is not efficient.");
        }

      }
      // Output if the guess is not right
      else if (guess > randomNumber)
      {
        System.out.println("Your guess is too high");
      }
      else
      {
        System.out.println("Your guess is too low");
      }
    }

  }

}
