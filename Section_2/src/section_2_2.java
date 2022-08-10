
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.Scanner;

public class section_2_2
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the radius and length of a cyinder: ");
    // Ask user for radius and length
    double radius = input.nextDouble(), length = input.nextDouble();

    // Calculate area
    double area = (radius * radius * 3.14159);

    // Calculate volume
    double volume = (area * length);

    // Display area and volume
    System.out.println("The area is " + area);
    System.out.println("The volume is " + volume);

  }

}
