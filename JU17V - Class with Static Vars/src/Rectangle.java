/** Andre Menezes */

public class Rectangle
{

  // constants - there's only one needed.
  // TODO: Fix

  // static variables
  // TODO: Fix
  private static double scaleFactor;
  private static int scaleCount;
  public static int uniqueIDCount = 1;

  // instance variables
  // TODO: Fix
  private double width;
  private double height;
  private int uniqueID;

  /**
   * Default ctor. Constructs a rectangle with width 1 and
   * height 1.
   */
  public Rectangle()
  {
    // TODO: Fix
    width = 1;
    height = 1;
    uniqueID = uniqueIDCount;
    uniqueIDCount++;
  }

  /**
   * Ctor with params to construct any size rectangle.
   * 
   * @param newWidth
   * @param newHeight
   */
  public Rectangle(double newWidth, double newHeight)
  {
    // TODO: Fix
    width = newWidth;
    height = newHeight;
    uniqueID = uniqueIDCount;
    uniqueIDCount++;
  }

  /**
   * Gets the area of a rectangle.
   * 
   * @return
   */
  public double getArea()
  {
    // TODO: Fix
    double area = width * height;
    return area;
  }

  /**
   * Gets the perimeter of a rectangle.
   * 
   * @return
   */
  public double getPerimeter()
  {
    // TODO: Fix
    double perimeter = (2 * height) + (2 * width);
    return perimeter;
  }

  /**
   * Scales the rectangle by a given factor only if the number is
   * 0 or positive. Otherwise leaves the dimensions unchanged.
   * 
   * @param factor
   */
  public void scale(double factor)
  {
    // TODO: Fix
    scaleFactor = factor;
    if (scaleFactor >= 0)
    {
      width *= scaleFactor;
      height *= scaleFactor;
      scaleCount++;
    }
  }

  /**
   * Returns the dimensions of a rectangle in the format 3 X 5
   * 
   * @return
   */
  public String getBasicDimensions()
  {
    return width + " X " + height;
  }

  /**
   * Returns the dimensions of a rectangle along with the
   * unique ID number of that rectangle.
   * The ID of the first rectangle created ever is 1.
   * "Rectangle #34 is 7 X 4"
   * This means that this is the 34th rectangle ever created.
   * 
   * @return
   */
  public String getFancyDimensions()
  {
    // TODO: Fix
    return "Rectangle #" + uniqueID + " is " + getBasicDimensions();
  }

  /**
   * returns the number of times all rectangles have
   * been scaled successfully.
   * 
   * @return
   */
  public static int getScaleCount()
  {
    // TODO: Fix
    return scaleCount;
  }

}
