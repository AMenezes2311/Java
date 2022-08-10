/**
 * Name: Andre Menezes
 * 
 * Complete the methods below so that they pass all of the tests in the
 * JU01Test.java. Remember to open the JU01Test.java file and press the PLAY
 * button when that file is open.
 * 
 * @version 3.0 windChill tests updated, and page number for computeAverage
 *          updated.
 *
 */

public class JU08V
{
  /**
   * Compute the body of the method to pass the tests. This method will compute
   * the area of a square given a side length.
   * 
   * <pre>
   * squareArea(4) -> "A square with side length 4 has area of
   * 16"
   * </pre>
   * 
   */

  public static String squareArea(double sideLength)
  {
    // TODO: For the first problem, simply uncomment the following line and it
    // should
    // pass the tests.
    // Remember to save, then open JU01Test.java and press the play button.

    double area = 0.0; // declare a variable named area and assign zero to it.

    area = sideLength * sideLength; // uncomment this line.

    return "A square with side length " + sideLength + " has area of " + area;
  }

  /**
   * Given three decimal numbers, return the average of those numbers. Look at
   * page 35 in the eBook, line 15 in the ComputeAverage code for a hint.
   * Example
   * 
   * <pre>
   * computeAverage(50, 0, 100) -> "The average of 50.0 0.0 100.0 is 50.0"
   * </pre>
   * 
   * @param number1
   * @param number2
   * @param number3
   * @return
   */
  public static String computeAverage(double number1, double number2,
                                      double number3)
  {
    // TODO: Finish page 36 in the eBook, line 15 in the ComputeAverage code for
    // a hint.
    double average = ((number1 + number2 + number3) / 3);

    return "The average of " + number1 + " " + number2 + " " + number3 + " is "
      + average;
  }

  /**
   * Given the radius of a circle, return the area of the circle. Page 41, Line
   * 15.
   * 
   * @param radius
   * @return
   */
  public static String computeCircleArea(double radius)
  {
    final double PI = 3.14159; // final prevents the variable PI from changing.
    // TODO: Finish page 41 in the eBook, for a hint.
    // Declare any new variables to make this method work for all test cases.
    double area = radius * radius * PI;

    return ("The area for the circle of radius " + radius + " is " + area);

    // By the way, did you go to the top of this file and type your full name?
  }

  /**
   * Given the number of seconds, compute the number of minutes and remaining
   * seconds. Hint: Page 44 eBook, line 8 through 11.
   * 
   * @param seconds
   * @return
   */
  public static String displayTime(int seconds)
  {
    // TODO: Finish page 41 in the eBook, for a hint.
    // Declare any new variables to make this method work for all test cases.
    int minutes = seconds / 60;
    int secondsLeft = seconds % 60;
    return (seconds + " seconds is " + minutes + " minutes and " + secondsLeft
      + " seconds");

  }

  /**
   * Converts fahrenheit to celsius. Hint: Page 47 in the eBook.
   * 
   * @param fahrenheit
   * @return
   */
  public static String fahrenheitToCelsius(double fahrenheit)
  {
    // TODO: Finish page 47 in the eBook, for a hint.
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    return ("Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius");
  }

  /**
   * Write a formula to compute the WindChill index given the outside
   * temperature and the wind speed. Use Math.pow(a, b) to compute raising v to
   * the 0.16 power. The formula is on Page 68, problem 2.17 in the eBook.
   */
  public static String windChill(double outsideTemp, double windSpeed)
  {
    // TODO: The formula is on Page 68, problem 2.17 in the eBook.
    // If you get stuck, please post a private topic and paste or (better)
    // attach this code file to your post
    double windChill =
      35.74 + (0.6215 * outsideTemp) - 35.75 * Math.pow(windSpeed, 0.16)
        + ((0.4275 * outsideTemp) * Math.pow(windSpeed, 0.16));
    return ("The wind chill index is " + windChill);
  }

}