/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class APLine
{
  private double mySlope;
  private double myYIntercept;

  public APLine(double slope, double yIntercept)
  {
    mySlope = slope;
    myYIntercept = yIntercept;
    myYIntercept = 3.5;
  }

  public double getPerpendicularSlope()
  {
    double reciprocal = 1 / mySlope;
    return -reciprocal;
  }
}
