
/**
 * Modify this for question 6. You will have to make changes
 * in ClimateStation.java
 */

import java.util.ArrayList;
import java.util.Scanner;

import core.data.DataSource;

public class Climate03_List
{
  private static final String CONNECTION_STRING =
    "http://weather.gov/xml/current_obs/index.xml";

  public static void main(String[] args)
  {
    System.out.println("Connecting to xml database...");
    DataSource climateDataSource = DataSource.connect(CONNECTION_STRING).load();
    System.out.println("Loading database into ArrayList...");
    ArrayList<ClimateStation> stationList =
      climateDataSource.fetchList("ClimateStation", "station/station_name",
                                  "station/station_id", "station/state",
                                  "station/latitude", "station/longitude");
    System.out.println("Total stations loaded into the ArrayList: "
      + stationList.size());

    Scanner input = new Scanner(System.in);
    System.out.println("Enter a state abbreviation (two letters):");
    String state = input.next().toUpperCase();
    System.out.println("Stations in " + state + ":");

    // For question 4, add code below:
    for (ClimateStation aStation : stationList)
    {
      if (aStation.isLocatedInState(state))
      {
        System.out.println("  " + aStation.getId() + ": " + aStation.getName());
      }
    }

    // 6A - Write another for each loop that filters on latitude rather than
    // state letters. You can copy the loop above.
    double southMostLat = 0;
    String southMostStation = "";
    for (ClimateStation aStation : stationList)
    {
      if (aStation.isLocatedInState(state))
      {
        System.out.println("  " + aStation.getId() + ": " + aStation.getLat());
        if (aStation.getLat() > southMostLat)
        {
          southMostLat = aStation.getLat();
          southMostStation = aStation.getName();
        }
      }
    }

    System.out.println("\nSouth most station: " + southMostStation);
    System.out.println("\nSouth most lat: " + southMostLat);
  }
}