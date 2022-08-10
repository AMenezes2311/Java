/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class AnalyzeNumbers
{

  public static void main(String[] args)
  {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter the number of items: ");
    int n = input.nextInt();
    double[] numbers = new double[n];
    double sum = 0;

    System.out.print("Enter the numbers: ");
    for (int i = 0; i < n; i++)
    {
      numbers[i] = input.nextDouble();
      sum += numbers[i];
    }

    double average = sum / n;

    int count = 0;
    for (int i = 0; i < n; i++)
    {
      if (numbers[i] > average)
      {
        count++;
      }
    }

    double smallest = numbers[0];
    int index = 0;

    for (int i = 0; i < n; i++)
    {
      if (numbers[i] < smallest)
      {
        smallest = numbers[i];
        index = i;

      }
    }

    System.out.println("Average is " + average);
    System.out.println("Number of elements above the average is " + count);
    System.out.println("The smallest value entered was " + smallest);
    System.out.println("The smallest value was located at index " + index);
  }

}
