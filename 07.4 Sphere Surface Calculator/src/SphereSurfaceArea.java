
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class SphereSurfaceArea
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the Andre Menezes's Sphere App!");

    // Asking user for the volume
    System.out
      .println("Please enter the volume of the sphere (in cubic meters):");
    double volume = input.nextDouble();

    // Calculating surface area and radius
    double surfaceArea =
      Math.pow(3.1415, (double) 1 / 3) * Math.pow((6 * volume), (double) 2 / 3);

    double radius = Math.pow((3 * volume) / (4 * 3.1415), (double) 1 / 3);

    // Display surface area and radius
    System.out.println("The surface area of a sphere with volume " + volume
      + " is " + surfaceArea + " square meters.");

    System.out.println("The radius of that sphere is " + radius + "meters.");

    System.out.println("Have a great day!");
  }
}
