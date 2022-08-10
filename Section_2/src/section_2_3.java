
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.Scanner;

public class section_2_3
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter the value for feet: ");
    double feet = input.nextDouble();
    double meter = feet * 0.305;
    System.out.println(feet + " feet is " + meter + " meters");

  }

}
