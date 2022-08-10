/**
 * Name: Andre Menezes
 * Chapter 6 methods in the Ebook. Submit this file to
 * the dropbox for grading.
 * Some methods require you to call a previous defined method.
 * 
 * @version 3.0
 */
public class JU18V
{
  // Declare any constants here.
  /**
   * Write a method that computes the area of a triangle given the base width
   * and height.
   * 
   * @return returns a double.
   */
  public static double getTriangleArea(int width, int height)
  {
    // This method requires you to return a double.
    double area = (double) (0.5 * width * height);
    return area; // TODO: replace this.
    // TODO: Also, did you put your name at the top of this file?
  }

  /**
   * Returns true if a and b are equal or almost equal. They are almost equal if
   * the difference between them is less than 0.01. Examples:
   * 
   * <pre>
   * approxEqual(3.54, 3.542) -> true
   * approxEqual(3.542, 3.54) -> true
   * approxEqual(3.3, 3.1) -> false
   * </pre>
   * 
   */
  public static boolean approxEqual(double a, double b)
  {
    // TODO: Use Math.abs or do it the hard way.
    if (Math.abs(a - b) <= 0.01)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  /**
   * Returns the sum of two doubles, but if they are approximately
   * equal to each other (less than 0.01 difference), then return three
   * times the sum of the two parameters.
   * 
   * @param a
   * @param b
   * @return
   */
  public static double funnySum(double a, double b)
  {
    // Note: YOU MUST CALL A PREVIOUS METHOD TO SOLVE THIS.
    // No credit will be awarded if you don't
    // call your approxEqual method to solve this.
    if (approxEqual(a, b) == true)
    {
      return 3 * (a + b);
    }
    else
    {
      return a + b;
    }
  }

  /**
   * This method returns the value of number rounded to nearest one's place. The
   * AP way of rounding is actually different than Math.round. It rounds numbers
   * "away" from zero. If the number is positive add 0.5 and truncate the value.
   * If the number is negative then subtract 0.5 and then truncate the value.
   * 
   * <pre>
   * roundAP(5.6) -> 6
   * roundAP(5.54) -> 6
   * roundAP(5.5) -> 6
   * roundAP(5.4555) -> 5
   * roundAP(-5.6) -> -6
   * roundAP(-5.5) -> -6
   * roundAP(-5.2) -> -5
   * </pre>
   * 
   * @param number
   *          can be negative or positive
   * @return see above
   */
  public static int roundAP(double number)
  {
    // The return type of this method is "int"
    // that means you have to return an integer, not
    // something in between quotes (aka String)
    if (number < 0)
    {
      return (int) Math.round(Math.abs(number)) * -1;
    }
    else
    {
      return (int) Math.round(number);
    }
  }

  /**
   * Very similar to roundAP, except that it rounds to the nearest hundredths
   * place. Multiply by 100, then add 0.5, then chop off the decimal, then
   * divide by 100.0
   * 
   * <pre>
   * roundAP(5.389) -> 5.39
   * roundAP(2.612) -> 6.12
   * roundAP(-8.225) -> -8.23
   * roundAP(-8.224) -> -8.22
   * </pre>
   * 
   * @param number
   *          can be negative or positive
   * @return see above
   */
  public static double roundAPHundredths(double number)
  {
    // The return type of this method is "int"
    // that means you have to return an integer, not
    // something in between quotes (aka String)
    return Math.round(number * 100.0) / 100.0;
  }

  /**
   * Visit
   * https://www.thecalculatorsite.com/articles/finance/compound-interest-formula.php
   * and find the compound interest formula.
   * 
   * <pre>
   * principle = the principal investment amount (the initial deposit or loan amount)
   * rate = the annual interest rate (in percentage)
   * numberOftimes = the number of times that interest is compounded per unit t
   * times = the time the money is invested or borrowed for
   * </pre>
   * 
   * A = P (1 + r/n)(nt)
   * A = the future value of the investment/loan, including interest
   * P = the principal investment amount (the initial deposit or loan amount)
   * r = the annual interest rate (decimal)
   * n = the number of times that interest is compounded per unit t
   * t = the time the money is invested or borrowed for
   * 
   * $5000.0 saved at 5.0% compounded 12
   * times per year for 10.0 years is $8235.05
   * 
   * @return the future value of the investment/loan, including interest
   */
  public static String compoundInterest(double principle, double rate,
                                        int numberOfTimes, double time)
  {
    // Note: YOU MUST CALL A PREVIOUS METHOD TO SOLVE THIS.
    // You must call the roundAPHundredths to solve this.
    double a =
      roundAPHundredths(principle
        * Math.pow(1 + ((rate / 100) / numberOfTimes), numberOfTimes * time));

    String sentence =
      "$" + principle + " saved at " + rate + "% compounded " + numberOfTimes;
    // You can either use this code or delete it.
    sentence += "\ntimes per year for " + time + " years is $" + a;
    return sentence;
  }

  /**
   * Given three values, x, y, and z, is it possible to add any two of the
   * parameters where the sum would equal the third one. Examples:
   * 
   * <pre>
   * sumOfTwoMakesThird(2, 5, 7) -> true because 2 + 5 == 7
   * sumOfTwoMakesThird(4, 9, 5) -> true because 4 + 5 == 9
   * sumOfTwoMakesThird(5, 4, 7) -> false because no two numbers sum to the third.
   * sumOfTwoMakesThird(0, 2, 2) -> false because no two numbers sum to the third.
   * </pre>
   */
  public static boolean sumOfTwoMakesThird(int x, int y, int z)
  {
    // Use if statements with the OR operator.
    if (x + y == z || x + z == y || y + z == x)
    {
      return true;
    }
    else
    {
      return false;
    }

  }

  /**
   * 
   * Returns true if number is a multiple of 5 or 7.
   * 
   * <pre>
   * isMultipleOf5or7(14) -> true
   * isMultipleOf5or7(19) -> false
   * isMultipleOf5or7(42) -> true
   * </pre>
   * 
   * @param number
   *          is any real number
   * @return true if multiple of 5 or 7, false if not.
   */
  public static boolean isMultipleOf5or7(int number)
  {
    // Your first boolean returning method.
    // Make sure you return a true or false at some point in this code.
    // You will use an if statement to solve this.
    // TODO: finish
    if (number % 5 == 0 || number % 7 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  /**
   * Return a string of numbers that are divisible
   * by five or seven up to max.
   * 
   * <pre>
   * numbersMult5or7(10) -> "5,7,10,"
   * numbersMult5or7(17) -> "5,7,10,14,15,"
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String numbersMult5or7(int max)
  {
    // Note: YOU MUST CALL A PREVIOUS METHOD TO SOLVE THIS.
    // DO NOT USE MOD IN THIS PROBLEM,
    // Call your nifty isMultipleOf5or7 method in your
    // if statement.
    String numbers = "Answer:";
    for (int i = 1; i <= max; i++)
    {
      if (isMultipleOf5or7(i) == true)
      {
        numbers += i + ",";
      }
    }
    return numbers;
  }

  /**
   * The formula for this is in your eBook on page 217.
   * Actually, the whole line of code is there.
   * 
   * <pre>
   * convertToFahrenheit(100) -> 212.0
   * convertToFahrenheit(0) -> 32.0
   * </pre>
   * 
   * @param celcius
   * @return
   */
  public static double convertToFahrenheit(double degreesCelsius)
  {
    // The formula for this is in your book on page 217.
    double answer = (9.0 / 5) * degreesCelsius + 32;
    return answer;
  }

  /**
   * The formula for this is in your eBook on page 217.
   * Actually, the whole line of code is there.
   * 
   * <pre>
   * convertToCelsius(212) -> 100.0
   * convertToCelsius(32) -> 0
   * </pre>
   * 
   * @param celcius
   * @return
   */
  public static double convertToCelsius(double degreesFahrenheit)
  {
    // The formula for this is in your book on page 217.
    double answer = (5.0 / 9.0) * (degreesFahrenheit - 32.0);
    return Math.round(answer * 100.0) / 100.0;
  }

  /**
   * Given a range of temperatures and the step value for
   * those temps, you will create a table that shows
   * the fahrenheit to celsius conversion. You must
   * not repeat code that was used to solve fahrenheitToCelsius.
   * See the tests for the formatting.
   * 
   * <pre>
   * getCelsiusTemps(32, 35, 1) will return:
        Fahrenheit Celsius 
        ------------------ 
        32      0.0  
        33      0.56  
        34      1.11  
        35      1.67 
        ------------------
   * </pre>
   * 
   * @param cMin
   *          is the first temperature to convert.
   * @return a table of fahrenheit to celsius conversions.
   */
  public static String getCelsiusTemps(int cMin, int cMax, int step)
  {
    String sentence = "Fahrenheit Celsius\n" + "------------------\n";
    // Do not use multiplication or division in this problem.
    // Call your previous convertToCelsius method to help solve this.

    while (cMin <= cMax)
    {
      sentence += cMin + "      " + convertToCelsius(cMin) + "\n";
      // sentence += cMin + " " + df.format(convertToCelsius(cMin)) + "\n";
      cMin += step;
    }
    return sentence + "------------------";
  }

}