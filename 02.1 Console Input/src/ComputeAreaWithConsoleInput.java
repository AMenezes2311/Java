
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

import java.util.Scanner; // Importing Java class

public class ComputeAreaWithConsoleInput
{

  public static void main(String[] args)
  {

    // Create a scanner object
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a number for the radius: ");
    double radius = input.nextDouble(); // Declare radius
    double area; // Declare area

    // Compute area
    area = radius * radius * 3.14159;

    // Display results
    System.out
      .println("The area of the circle of radius: " + radius + " is " + area);
  }

}