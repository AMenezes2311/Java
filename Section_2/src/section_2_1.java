
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.Scanner;

public class section_2_1
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter a degree in Celcius: ");
    // Asking user for a temperature
    double celsius = input.nextDouble();

    // Calculate fahrenheit
    double fahrenheit = ((9.0 / 5) * celsius + 32);

    // Display final temperature
    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

  }

}
