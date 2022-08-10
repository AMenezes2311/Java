import java.util.Scanner;

public class TriangleApp
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides separated by spaces: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();
    // Fill in the code here:
    System.out.print("Enter the color: ");
    String color = input.next();
    System.out.print("Enter a boolean value for filled: ");
    boolean filled = input.nextBoolean();

    Triangle triangle = new Triangle(side1, side2, side3, color, filled);

    System.out.print("\n-----RESULTS-----\n");
    System.out.println("Side 3 has length " + triangle.getSide3());
    System.out.println("The color is " + triangle.getColor());

    if (triangle.isFilled())
    {
      System.out.println("The triangle is filled");
    }
    else
    {
      System.out.println("The triangle not is filled");
    }

    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is " + triangle.getPerimeter());
    System.out.println(triangle.toString() + "\n");

    System.out.print("Enter three sides separated by spaces: ");
    side1 = input.nextDouble();
    side2 = input.nextDouble();
    side3 = input.nextDouble();
    // Fill in the code here:
    System.out.print("Enter the color: ");
    color = input.next();
    System.out.print("Enter a boolean value for filled: ");
    filled = input.nextBoolean();

    Triangle triangle2 = new Triangle(side1, side2, side3, color, filled);

    System.out.print("\n-----RESULTS-----\n");
    System.out.println("Side 3 has length " + triangle2.getSide3());
    System.out.println("The color is " + triangle2.getColor());

    if (triangle2.isFilled())
    {
      System.out.println("The triangle is filled");
    }
    else
    {
      System.out.println("The triangle not is filled");
    }

    System.out.println("The area is " + triangle2.getArea());
    System.out.println("The perimeter is " + triangle2.getPerimeter());
    System.out.println(triangle2.toString() + "\n");
  }
}
