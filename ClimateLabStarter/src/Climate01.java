
/**
 * Quick demonstration of how you can
 * pull information from an XML database into your app.
 * Run it once to answer Question 1, then change the
 * source to find the climate from a different site.
 */

import core.data.DataSource;

public class Climate01
{
  // constants
  private static final int CACHE_TIMEOUT = 15 * 60;
  private static final String CONNECTION_URL_BASE =
    "http://weather.gov/xml/current_obs/";

  public static void main(String[] args)
  {
    // Question 2B
    String fourCharacterCode = "KBCT";
    String climateXMLPath = CONNECTION_URL_BASE + fourCharacterCode + ".xml";
    System.out.println("Downloading xml... Please wait...");
    DataSource climateDataSource = DataSource.connect(climateXMLPath);
    climateDataSource.setCacheTimeout(CACHE_TIMEOUT);
    climateDataSource.load();
    // Uncomment the line below to see all of the data you could
    // use with fetch methods.
    // ds.printUsageString();
    float temperature = climateDataSource.fetchFloat("temp_f");
    String location = climateDataSource.fetchString("location");
    System.out
      .println("The temperature at " + location + " is " + temperature + "F");
  }
}
