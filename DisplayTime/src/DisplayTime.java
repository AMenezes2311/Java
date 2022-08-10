
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class DisplayTime
{

  public static void main(String[] args)
  {
    /* Scanner input = new Scanner(System.in);
     * // Prompt the user for input
     * System.out.println("Enter an integer for seconds: ");
     * int seconds = input.nextInt();
     * 
     * int minutes = seconds / 60; // Find minutes in seconds
     * int remainingSeconds = seconds % 60; // Seconds remaining
     * System.out.println(seconds + " seconds is " + minutes + " minutes and "
     * + remainingSeconds + " seconds"); */
    String line = "bill, gates";
    String clause = line.substring(0, line.indexOf(","));
    int pos = line.indexOf(",");
    System.out.println(clause + " " + pos);

    System.out.println(Math.abs(-1));
    System.out.println(Math.abs(1.0));
    System.out.println("");

  }
}
