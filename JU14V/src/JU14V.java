/**
 * Name: Andre Menezes
 * 
 * FOR LOOPS Chapter 5 in the Ebook Practice on nested
 * for loops. Submit this file to the dropbox for grading.
 * 
 * @version 3.0 - rearranged simpleLoop to top/comma for flexible loop.
 */
public class JU14V
{
  // Declare any constants here.

  /**
   * The client sends the max through a parameter and you return a String length
   * of that many asterisks.
   * 
   * <pre>
   * displayStarsOnOneLine(4) -> "****"
   * displayStarsOnOneLine(2) -> "**"
   * </pre>
   */
  public static String displayStarsOnOneLine(int max)
  {
    // You must solve using a FOR loop.
    // No credit for using a while loop.
    String answer = "";

    // put code here:
    for (int i = 0; i != max; i++)
    {
      answer += "*";
    }
    return answer;
  }

  /**
   * Given max, this will generate a String of numbers from 1 to max separated
   * by commas. There will not be a comma at the end of the sequence.
   * simpleLoop(5) -> "[1,2,3,4,5]" simpleLoop(8) -> "[1,2,3,4,5,6,7,8]"
   * 
   * @param max
   * @return
   */
  public static String simpleLoop(int max)
  {
    // You must solve using a FOR loop.
    // No credit for using a while loop.
    String answer = "[";

    // put code here:
    for (int i = 0; i != max; i++)
    {
      if (i + 1 == max)
      {
        answer += i + 1 + "]";
      }
      else
      {
        answer += i + 1 + ",";
      }
    }
    return answer;
  }

  /**
   * Given a max value, this will create a string of the multiples of 7 starting
   * at 7 and not going any higher than max. It will run all of the numbers
   * together without spaces.
   * 
   * <pre>
   * For example: basicCountUpBy7s(22) -> "[71421]"
   * For example: basicCountUpBy7s(43) -> "[71421283542]"
   * </pre>
   */
  public static String basicCountUpBy7s(int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    // put code here:
    for (int i = 7; i <= max; i = i + 7)
    {
      answer += i;
    }
    return "[" + answer + "]";
  }

  /**
   * The client can pass the start, end, and the step value that each number.
   * The method returns the sequence of numbers from start to end, using the
   * delta value of the step. The last number in the sequence will have a
   * trailing comma.
   * 
   * <pre>
   * flexibleLoop(3, 7, 1) -> "[3,4,5,6,7,]"
   * flexibleLoop(7, 3, -1) -> "[7,6,5,4,3,]"
   * flexibleLoop(10, 0, -3) -> "[10,7,4,1,]"
   * 
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String flexibleLoop(int start, int end, int step)
  {
    String answer = "[";
    // I did this with an if that used a different
    // loop depending on whether step was positive
    // or negative.
    if (step > 0)
    {
      for (int i = start; i <= end; i = i + step)
      {
        answer += start + ",";
        start += step;
      }
    }

    else
    {
      for (int i = start; i >= end; i = i + step)
      {
        answer += start + ",";
        start += step;
      }
    }
    return answer + "]";
  }

  /**
   * The client sends the max through a parameter and you return a list of
   * numbers from 1 to max, but all numbers divisible by wierdNum have brackets
   * around them.
   * 
   * <pre>
   * PRECONDITION: max will be greater than zero.
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String divisibleBy(int weirdNum, int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop. ... like you'd want to anyway.
    String answer = "";
    // put code here:
    for (int i = 1; i <= max; i++)
    {
      if (i % weirdNum == 0)
      {
        answer += "[" + i + "] ";
      }
      else
      {
        answer += i + " ";
      }
    }
    return answer;
  }

  /**
   * Creates a nasa T-minus countdown phrase given a value for the start
   * parameter. nasaCountDown(5) -> "T-Minus 5 seconds:5...4...3...2...1...BLAST
   * OFF"
   * 
   * @param start
   *          can be any positive integer
   * @return see test.
   */
  public static String nasaCountDown(int start)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    // put code here:
    answer = "T-Minus " + start + " seconds:";
    for (int i = start; i != 0; i--)
    {
      answer += i + "...";
    }
    return answer + "BLAST OFF";

  }

  /**
   * The client sends the min and max through a parameter and you return a list
   * of numbers from min to max and determining the sum of all of those numbers.
   * 
   * <pre>
   * sumThemUp(3) -> 1 + 2 + 3 = 6
   * sumThemUp(5) -> 1 + 2 + 3 + 4 + 5 = 15
   * 
   * PRECONDITION: max will be greater than min.
   * </pre>
   * 
   * @param max
   *          will be greater than one.
   */
  public static String sumThemUp(int min, int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    // assertEquals("2 + 3 + 4 + 5 = 14", JU14V.sumThemUp(2, 5));
    String answer = "";
    int sum = 0;
    // put code here:
    for (int i = min; i <= max; i++)
    {
      if (i == max)
      {
        answer += i;
        sum += i;
      }
      else
      {
        answer += i + " + ";
        sum += i;
      }
    }
    return answer + " = " + sum;
  }

  /**
   * Builds an algebra 1 T chart with the function f(x) = 3x + 2. The client
   * supplies the smallest and largest numbers for the T chart. This is also
   * called the domain. Check the failing tests to see the format.
   * 
   */
  public static String buildTChart(int min, int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.

    // Remember to post a question in the PT if you are stuck.
    // VHS Teachers will give you a big hint or the full solution to these
    // problems.

    /* "-----------------\n" + "x | f(x) = 3x + 2\n"
     * + "-----------------\n" + "-5   -13\n" + "-4   -10\n" + "-3   -7\n"
     * + "-2   -4\n" + "-1   -1\n" + "0   2\n" + "1   5\n" + "2   8\n"
     * + "3   11\n" + "4   14\n" + "5   17\n" + "-----------------\n" + "", */

    String answer =
      "-----------------\n" + "x | f(x) = 3x + 2\n" + "-----------------\n";
    // put code here:
    for (int i = min; i <= max; i++)
    {
      answer += i + "   " + ((i * 3) + 2) + "\n";
    }
    return answer + "-----------------\n";
  }

}