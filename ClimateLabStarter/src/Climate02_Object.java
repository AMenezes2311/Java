import core.data.DataSource;

// Used Question 3

public class Climate02_Object
{
  private static final int CACHE_TIMEOUT = 15 * 60;
  private static final String CONNECTION_URL_BASE =
    "http://weather.gov/xml/current_obs/";

  public static void main(String[] args)
  {

    System.out.println("Downloading xml... Please wait...");

    String id1 = "KATL";
    DataSource dataSource1 =
      DataSource.connect(CONNECTION_URL_BASE + id1 + ".xml");
    dataSource1.setCacheTimeout(CACHE_TIMEOUT);
    dataSource1.load();
    // uncomment for debugging issues with connection.
    // dataSource1.printUsageString();

    ClimateReading climateReading1 =
      dataSource1.fetch("ClimateReading", "weather", "temp_f", "wind_degrees");
    System.out.println(id1 + ": " + climateReading1);

    String id2 = "KSAV";
    DataSource dataSource2 =
      DataSource.connect(CONNECTION_URL_BASE + id2 + ".xml");
    dataSource2.setCacheTimeout(CACHE_TIMEOUT);
    dataSource2.load();

    ClimateReading climateReading2 =
      dataSource2.fetch("ClimateReading", "weather", "temp_f", "wind_degrees");
    System.out.println(id2 + ": " + climateReading2);

    // You add more code here for Question 3.
    String id3 = "KBCT";
    DataSource dataSource3 =
      DataSource.connect(CONNECTION_URL_BASE + id3 + ".xml");
    dataSource3.setCacheTimeout(CACHE_TIMEOUT);
    dataSource3.load();

    ClimateReading climateReading3 =
      dataSource3.fetch("ClimateReading", "weather", "temp_f", "wind_degrees");
    System.out.println(id3 + ": " + climateReading3);

    if (climateReading1.colderThan(climateReading2)
      && climateReading1.colderThan(climateReading3))
    {
      System.out.println("Colder at " + id1);
    }
    else if (climateReading2.colderThan(climateReading1)
      && climateReading2.colderThan(climateReading3))
    {
      System.out.println("Colder at " + id2);
    }
    else
    {
      System.out.println("Colder at " + id3);
    }
  }
}