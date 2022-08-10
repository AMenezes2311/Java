/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class Circle
{
  public static final int MIN_RADIUS = 0; // Constant

  private static int numberOfObjects = 0; // Static variable

  private double radius; // Instance variable

  /** Construct a circle with radius 1 */
  // Default constructor
  public Circle()
  {
    radius = 1;
    numberOfObjects++;
  }

  /** Construct a circle with a specified radius */
  // Constructor
  public Circle(double newRadius)
  {
    radius = newRadius;
    numberOfObjects++;
  }

  // Mutator method
  public void setRadius(double newRadius)
  {
    if (newRadius >= MIN_RADIUS)
      radius = newRadius;
    else
      radius = 0;
  }

  /** Return radius */
  // Accessor method
  public double getRadius()
  {
    return radius;
  }

  /** Return the area of this circle */
  // Accessor method
  public double getArea()
  {
    return radius * radius * Math.PI;
  }

  /** Return numberOfObjects */
  // Static method
  public static int getNumberOfObjects()
  {
    return numberOfObjects;
  }
}
