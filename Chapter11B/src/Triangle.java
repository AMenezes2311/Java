/**
 * 
 * @author Andre Menezes.
 *
 */
public class Triangle extends GeometricObject
{
  // TODO: Complete.
  private double side1, side2, side3;

  public Triangle()
  {
    this.side1 = 1;
    this.side2 = 1;
    this.side3 = 1;
  }

  public Triangle(double side1, double side2, double side3)
  {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public Triangle(double side1, double side2, double side3, String color,
    boolean filled)
  {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    setColor(color);
    setFilled(filled);
  }

  public double getSide1()
  {
    return side1;
  }

  public double getSide2()
  {
    return side2;
  }

  public double getSide3()
  {
    return side3;
  }

  public double getArea()
  {
    /**
     * Area=SQRT(s(s-a)(s-b)(s-c)), where s=(a+b+c)/2 or perimeter/2.
     */
    double perimeter = (side1 + side2 + side3) / 2;
    double area =
      perimeter
        * ((perimeter - side1) * (perimeter - side2) * (perimeter - side3));
    area = Math.sqrt(area);
    return area;
  }

  public double getPerimeter()
  {
    return side1 + side2 + side3;
  }

  public String toString()
  {
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
      + side3;
  }
}
