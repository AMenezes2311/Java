public class GeometricObject
{
  private String color;
  private boolean filled;
  private java.util.Date dateCreated;
  private int thickness;

  /** Construct a default geometric object */
  public GeometricObject()
  {
    dateCreated = new java.util.Date();
    color = "white";
    filled = false;
    thickness = 1;

  }

  /**
   * Construct a geometric object with the specified color and filled value
   */
  public GeometricObject(String color, boolean filled, int thickness)
  {
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
    this.thickness = thickness;
  }

  /** Return color */
  public int getThickness()
  {
    return thickness;
  }

  /** Return thickness **/
  public String getColor()
  {
    return color;
  }

  /** Set a new color */
  public void setColor(String color)
  {
    this.color = color;
  }

  /** Set a new color */
  public void setThickness(int thickness)
  {
    this.thickness = thickness;
  }

  /**
   * Return filled. Since filled is boolean, its get method is named isFilled
   */
  public boolean isFilled()
  {
    return filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled)
  {
    this.filled = filled;
  }

  /** Get dateCreated */
  public java.util.Date getDateCreated()
  {
    return dateCreated;
  }

  /** Return a string representation of this object */
  public String toString()
  {
    return "created on " + dateCreated + "\ncolor: " + color + ", thickness: "
      + thickness + " and filled: " + filled;
  }
}