/**
 * Name: Andre Menezes
 * This goes with chapter 3 and deals with selection statements
 * such as IF THEN ELSE and a few questions on integer division and modulus.
 *
 * @version 4.0
 *
 */

public class JU12V
{
  // declare your constants here to fix "magic" numbers.
  // A constant declaration looks like this
  // public static final int MAX_SCORE = 10;

  /**
   * Returns a message indicating if an x-y coordinate on a Cartesian (yes, the
   * one you plot points on in your math class) coordinate plane is the origin,
   * located on the x (or y) axis, or appears in a particular quadrant. For
   * example,
   *
   * <pre>
   * xyInfo(0, 0) -> "(0, 0) is the origin."
   * xyInfo(2, 0) -> "(2, 0) is on the x-axis."
   * xyInfo(0, 3) -> "(0, 3) is on the y-axis."
   * xyInfo(-3, -2) -> "(-3, -2) is in the third quadrant."
   * </pre>
   *
   * @param x
   * @param y
   * @return
   */
  public static String xyInfo(int x, int y)
  {
    // Create any variables and use if then statements.
    // TODO: Finish but seriously ask for help if you are stuck.
    String info = "";
    if (x == 0 && y == 0)
    {
      info = "(0, 0) is the origin.";
    }
    else if (x == 0)
    {
      info = "(0, " + y + ") is on the y-axis.";
    }
    else if (y == 0)
    {
      info = "(" + x + ", 0) is on the x-axis.";
    }
    else if (x > 0 && y > 0)
    {
      info = "(" + x + ", " + y + ") is in the first quadrant.";
    }
    else if (x < 0 && y > 0)
    {
      info = "(" + x + ", " + y + ") is in the second quadrant.";
    }
    else if (x < 0 && y < 0)
    {
      info = "(" + x + ", " + y + ") is in the third quadrant.";
    }
    else if (x > 0 && y < 0)
    {
      info = "(" + x + ", " + y + ") is in the fourth quadrant.";
    }
    return info;
  }

  /**
   * A shipping company uses the following rules to compute the cost of (in
   * dollars) of shipping based on the weight of the package (in pounds).
   * 
   * <pre>
   *   $3.5 if 0 < packageWeight <= 1
   *   $5.5 if 1 < packageWeight <= 3
   *   $8.5 if 3 < packageWeight <= 10
   *   $10.5 if 10 < packageWeight <= 20
   *   "The package cannot be shipped" if the packageWeigth is over 20.
   * </pre>
   * 
   * @param guess
   * @param secret
   * @return
   */
  public static String costOfShipping(double packageWeight)
  {
    String response = "";
    /* if (packageWeight <= 1) { return "The shipping cost is $3.5"; } else */

    // Hey there. Remember to not used any off the forbidden Java methods to
    // solve these problems. You can get a list of them by going to the lesson
    // page and clicking the link at the bottom.
    if (packageWeight > 0 && packageWeight <= 1)
    {
      response = "The shipping cost is $3.5";
    }
    else if (packageWeight > 1 && packageWeight <= 3)
    {
      response = "The shipping cost is $5.5";
    }
    else if (packageWeight > 3 && packageWeight <= 10)
    {
      response = "The shipping cost is $8.5";
    }
    else if (packageWeight > 10 && packageWeight <= 20)
    {
      response = "The shipping cost is $10.5";
    }
    else
    {
      response = "The package cannot be shipped";
    }
    return response;
  }

  /**
   * Determines if a, b, and c are in order from least to greatest.
   * 
   * <pre>
   * Examples
   * 
   * inNumericalOrder(3, 5, 19) -> "3, 5, and 19 are in numerical order.";
   * inNumericalOrder(3, 3, 3) -> "3, 3, and 3 are in numerical order.";
   * inNumericalOrder(3, 5, 4) -> "3, 5, and 4 are NOT in numerical order.";
   * </pre>
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static String inNumericalOrder(int a, int b, int c)
  {
    String sentence = "";
    // TODO: Write code
    if (a < b && b < c)
    {
      sentence = a + ", " + b + ", and " + c + " are in numerical order.";
    }
    else if (a == b && b == c)
    {
      sentence = a + ", " + b + ", and " + c + " are in numerical order.";
    }
    else
    {
      sentence = a + ", " + b + ", and " + c + " are NOT in numerical order.";
    }
    return sentence;
  }

  /**
   * Given three numbers, wierdRound each of the three numbers, and return their
   * sum. To weirdly round a number, look at the last digit.
   * 7 or higher rounds to the next ten. 6 or lower rounds down to the previous
   * ten. You want to use the mod operator to solve this. See the examples:
   * 
   * <pre>
   *   weirdRoundSum(6, 7, 9) -> 20
   *                 0 + 10 + 10
   *   weirdRoundSum(39, 17, 26) -> 80
   *                 40 + 20 + 20
   *   weirdRoundSum(107, 208, 105) -> 420
   *                 110 + 210 + 100
   * </pre>
   * 
   * @param firstNum
   *          >= 0
   * @param secondNum
   *          >= 0
   * @param thirdNum
   *          >= 0
   * @return please read the description
   */
  public static int weirdRoundSum(int firstNum, int secondNum, int thirdNum)
  {
    int total = 0;
    int a = 0;
    int b = 0;
    int c = 0;
    // use this local variable, or delete it if you want.
    // declare as many local variables as you want to help you solve the
    // problem.
    // TODO: Finish

    if ((firstNum % 10) >= 7)
    {
      a = (firstNum / 10) * 10;
      firstNum = a + 10;
    }
    else if ((firstNum % 10) <= 6)
    {
      firstNum -= (firstNum % 10);
    }
    if ((secondNum % 10) >= 7)
    {
      b = (secondNum / 10) * 10;
      secondNum = b + 10;
    }
    else if ((secondNum % 10) <= 6)
    {
      secondNum -= (secondNum % 10);
    }
    if ((thirdNum % 10) >= 7)
    {
      c = (thirdNum / 10) * 10;
      thirdNum = c + 10;
    }
    else if ((thirdNum % 10) <= 6)
    {
      thirdNum -= (thirdNum % 10);
    }
    total = firstNum + secondNum + thirdNum;
    return total;
  }

  /**
   * Write a method that outputs the expanded from of any three digit integer.
   * For example:
   *
   * <pre>
   * numExpander(914) returns "914 = 9 X 100 + 1 X 10 + 4 X 1"
   * numExpander(528) returns "528 = 5 X 100 + 2 X 10 + 8 X 1"
   * </pre>
   *
   * Hint: The modulo operator is helpful but you can also do it with just
   * simple subtraction. You'll definitely use the fact that integer division
   * ignores the decimal part.
   *
   * @param threeDigitNumber
   * @return see description and unit tests.
   */
  public static String numExpander(int threeDigitNumber)
  {
    String response = "";
    // TODO: Finish
    String firstDigit = Integer.toString(threeDigitNumber).substring(0, 1);
    String secondDigit = Integer.toString(threeDigitNumber).substring(1, 2);
    String thirdDigit = Integer.toString(threeDigitNumber).substring(2, 3);
    response =
      threeDigitNumber + " = " + firstDigit + " X 100 + " + secondDigit
        + " X 10 + " + thirdDigit + " X 1";
    return response;
  }

  /**
   * To round a positive number to the nearest ones place, you add 0.5 to the
   * number then chop off (truncate) the decimal. To round a negative number,
   * you subtract 0.5 from the number and then chop off the decimal. This method
   * returns the value of number rounded to nearest one's place. Note: do not
   * use any of the Math class methods like Math.round or Math.floor etc.
   * Only use cast to int.
   * 
   * @param number
   *          can be negative or positive
   * @return a number rounded the weird AP way.
   */
  public static String roundToNearestOnesPlace(double number)
  {

    // Your teacher right now is hoping you ask them a question in their private
    // topic!
    // Just copy the code you have so far (even if it's just this), create
    // post with the lesson number, and watch the magic happen!
    int numberRound = 0;
    if (number > 0)
    {
      numberRound = (int) (number + 0.5);
    }
    else if (number < 0)
    {
      numberRound = (int) (number - 0.5);
    }
    else
    {
      numberRound = (int) 0;
    }
    return number + " rounded to the nearest one's place is " + numberRound;

  }

  /**
   * The quadratic formula returns the solutions to the equation ax^2 + bx + c =
   * 0. The quadratic formula is on page 99, problem 3.1 in the Programming
   * Exercises. Compute the descriminant which is b squared minus 4 times a
   * times c. If the descriminant is negative, then display "The equation has no
   * real roots" If the descriminant is zero, then display "The equation has one
   * root r1". If the descriminant is positive, then display "The equation has
   * two roots r1 and r2"
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static String getQuadraticRoots(double a, double b, double c)
  {

    // I dare you to visit this link https://youtu.be/VOXYMRcWbF8

    double result = b * b - 4.0 * a * c;
    String realRoots = "";
    if (result > 0.0)
    {
      double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
      double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
      realRoots = "The equation has two roots " + r1 + " and " + r2;
    }
    else if (result == 0.0)
    {
      double r1 = -b / (2.0 * a);
      realRoots = "The equation has one root " + r1;
    }
    else
    {
      realRoots = "The equation has no real roots";
    }
    return realRoots;
  }

}