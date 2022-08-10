// Andre Menezes
public class Rectangle extends GeometricObject
{
  private double width;
  private double height;

  public Rectangle()
  {
  }

  public Rectangle(double width, double height)
  {
    this.width = width;
    this.height = height;
  }

  public Rectangle(double width, double height, String color, boolean filled)
  {
    this.width = width;
    this.height = height;
    setColor(color);
    setFilled(filled);
  }

  /** Return width */
  public double getWidth()
  {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width)
  {
    this.width = width;
  }

  /** Return height */
  public double getHeight()
  {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height)
  {
    this.height = height;
  }

  /** Return area */
  public double getArea()
  {
    return width * height;
  }

  /** Return perimeter */
  public double getPerimeter()
  {
    return 2 * (width + height);
  }

  @Override
  /* Rectangle: width = 1.0 height = 1.0 created on Thu Oct 31 14:53:42 MST 2019
   * color: black and filled: true */
  public String toString()
  {
    return "Rectangle: width = " + getWidth() + " height = " + getHeight()
      + " created on " + getDateCreated() + "\ncolor: " + getColor()
      + " and filled: " + isFilled();
  }
}