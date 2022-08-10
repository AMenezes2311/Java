
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.Date;

public class DateTester
{

  public static void main(String[] args)
  {
    // Creating dates
    Date todaysDate = new Date();
    Date starWarsReleaseDate = new Date(233391600000L);
    Date worldWarOneStartDate = new Date(-1749229200000L);
    Date worldWarTwoStartDate = new Date(-957319200000L);
    Date myBirthdayDate = new Date(1039336200000L);
    Date firstCoronaVirusCaseDate = new Date(1573941600000L);

    // Today's time in milliseconds
    System.out.println("The elapsed time since Jan 1, 1970 is "
      + todaysDate.getTime() + " milliseconds.");

    // Today´s date in MM/DD/YY format
    System.out.println(todaysDate.toString());

    // Star Wars release date in MM/DD/YY format
    System.out.println(starWarsReleaseDate.toString());

    // World War One start date in MM/DD/YY format
    System.out.println(worldWarOneStartDate.toString());

    // World War Two start date in MM/DD/YY format
    System.out.println(worldWarTwoStartDate.toString());

    // My birthday date in MM/DD/YY format
    System.out.println(myBirthdayDate.toString());

    // First COVID-19 case reported
    System.out.println(firstCoronaVirusCaseDate.toString());

    System.out.println("Andre".substring(1));

  }
}
