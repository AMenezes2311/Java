
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.Scanner;

public class TowerOfHanoi
{
  static int callNumber = 0;

  public static void main(String[] args)
  {
    // Create scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of disks: ");
    int n = input.nextInt();

    // Find the solution
    System.out.println("The moves are:");
    moveDisks(n, 'A', 'B', 'C');
    System.out.println("Method moveDisks was called " + callNumber + " times.");
  }

  public static void moveDisks(int n, char fromTower, char toTower,
                               char auxTower)
  {
    callNumber++;
    if (n == 1)
    {
      System.out
        .println("Move disk " + n + " from " + fromTower + " to " + toTower);
    }
    else
    {
      moveDisks(n - 1, fromTower, auxTower, toTower);
      System.out
        .println("Move disk " + n + " from " + fromTower + " to " + toTower);
      moveDisks(n - 1, auxTower, toTower, fromTower);
    }
  }
}
