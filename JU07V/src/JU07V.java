/**
 * Name: Andre Menezes
 * 
 * Complete the methods below so that they pass all of the tests in the
 * JU07VTest.java. Remember to open the JU01Test.java file and press the PLAY
 * button when that file is open.
 * 
 * @version 2.0 windChill tests updated.
 *
 */

public class JU07V
{

  /**
   * Returns a value that is one less than formal parameter value.
   * 
   * @param value
   * @return one less than value.
   */
  public static int decreaseByOne(int value)
  {
    int answer = value;
    // TODO: Write code that decreases answer by one.
    answer--;
    return answer;
  }

  /**
   * Return the average of two numbers.
   * 
   * @param number1
   * @param number2
   * @return average
   */
  public static double getAverage(double number1, double number2)
  {
    double average = 0.0;
    average = (number1 + number2) / 2;
    return average;
  }

  /**
   * Rounds any positive decimal to the nearest one's place.
   * 
   * @param unRounded
   *          > 0
   * @return
   */
  public static int roundPositiveToNearestInteger(double unRounded)
  {
    int answer = 0;
    // TODO: You may not use any Math class static methods.
    // This includes Math.round or Math.anything.
    // The AP way of rounding is adding 0.5 to the number
    // and then chopping off the decimal.
    answer = (int) (unRounded + 0.5);
    return answer;
  }

  /**
   * Rounds any NEGATIVE decimal to the nearest one's place.
   * 
   * @param unRounded
   *          < 0
   * @return
   */
  public static int roundNegativeToNearestInteger(double unRounded)
  {
    int answer = 0;
    // TODO: You may not use any Math class static methods.
    // This includes Math.round or Math.anything.
    // The AP way of rounding is subtracting 0.5 from the number
    // and then chopping off the decimal.
    answer = (int) (unRounded - 0.5);
    return answer;
  }

  /**
   * Finds the remainder when the numerator is divided by the denominator.
   * 
   * @param numerator
   * @param denominator
   *          != 0;
   * @return
   */
  public static int findRemainder(int numerator, int denominator)
  {
    int remainder = 0;
    // TODO: Use the modulo operator. Your Algebra class doesn't have this
    // nifty operator.
    remainder = numerator % denominator;
    return remainder;

  }

}