
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.Scanner;

public class section_2_4
{

  public static void main(String[] args)
  {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter number in pounds: ");
    double pounds = input.nextDouble();

    double kilogram = pounds * 0.454;

    System.out.println(pounds + " pounds is " + kilogram + " kilograms");

  }

}