/**
 * Represents a climate reading. This includes temperature and windDirection
 **/
public class ClimateReading
{
  // Instance variables
  private float temp; // in fahrenheit
  private int windDir; // in degrees
  private String description;

  // Constructor
  public ClimateReading(String description, float temp, int windDir)
  {
    this.description = description;
    this.temp = temp;
    this.windDir = windDir;
  }

  /* determine if the temperature of this observation is colder than 'that's */
  public boolean colderThan(ClimateReading that)
  {
    return this.temp < that.temp;
  }

  /* produce a string describing this observation */
  public String toString()
  {
    return (temp + " degrees; " + description + " (wind: " + windDir
      + " degrees)");
  }
}