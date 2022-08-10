/** Represents information about a NWS climate station **/

public class ClimateStation
{
  // instance variables should always be declared private.
  private String name;
  private String id;
  private String state;
  private double lat;
  private double lng;

  // constructor
  public ClimateStation(String name, String id, String state, double lat,
    double lng)
  {
    this.name = name;
    this.id = id;
    this.lat = lat;
    this.lng = lng;
    this.state = state;
  }

  // These are all accessor methods to get information about the object.
  // For 6A, you will need to add another accessor method.

  /* Produce the id of this station */
  public String getId()
  {
    return id;
  }

  /* Produce the name of this station */
  public String getName()
  {
    return name;
  }

  public double getLat()
  {
    return lat;
  }

  /* Determine if this weather station is located in the given state */
  public boolean isLocatedInState(String st)
  {
    return this.state.equals(st);
  }

}