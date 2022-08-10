/**
 * Name: Andre Menezes WHILE LOOPS Chapter 5 in the Ebook Practice on
 * non-nested while loops. Submit this file to the dropbox for grading.
 * 
 * @version 2.0
 *
 */
public class JU13V
{
  // Declare any constants here.

  /**
   * The client sends the max through a parameter and you return a String length
   * of that many asterisks. For example:
   * 
   * <pre>
   * displayStarsOnOneLine(4) -> "****"
   * displayStarsOnOneLine(2) -> "**"
   * </pre>
   */
  public static String displayStarsOnOneLine(int max)
  {
    String response = "";
    // TODO: Fix
    while (response.length() != max)
    {
      response = response + "*";
    }
    return response;
  }

  /**
   * The client sends the max through a parameter and you return a String length
   * of that many asterisks on separate lines. Examples:
   * 
   * <pre>
   * displayStarsOnSeparateLines(3) ->  "*
   *                                     *
   *                                     *"
   *                                     
   * displayStarsOnSeparateLines(5) ->  "*
   *                                     *
   *                                     *
   *                                     *
   *                                     *"
   * 
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String displayStarsOnSeparateLines(int max)
  {
    String answer = "";
    // TODO: Fix
    while (answer.length() != (max * 2))
    {
      answer = answer + "*\n";
    }
    return answer;
  }

  /**
   * Given max, this will generate a String of numbers from 1 to max separated
   * by commas.
   * 
   * <pre>
   * simpleLoop(5) -> "1,2,3,4,5,"
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String simpleLoop(int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    int count = 0;
    String answer = "";
    while (count != max)
    {
      count++;
      answer += count + ",";
    }
    return answer;
  }

  private static String toString(int count)
  {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * The client sends the max through a parameter and you return a list of
   * numbers from 1 to that number separated by commas. The parameter length
   * determines how long the line will be before it word wraps. Examples:
   * 
   * <pre>
   * countUpToWordWrap(20, 5) -> "1,2,3,4,5,
   *                              6,7,8,9,10,
   *                              11,12,13,14,15,
   *                              16,17,18,19,20,"
   * countUpToWordWrap(15, 6) -> "1,2,3,4,5,6
   *                              7,8,9,10,11,12,
   *                              13,14,15,"
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String simpleLoopWordWrap(int max, int length)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    String answer = "";
    int count = 0;
    int i = 0;
    while (count != max)
    {
      count++;
      i++;
      answer += count + ",";
      if (i == length)
      {
        i = 0;
        answer += "\n";
      }
    }
    return answer;
  }

  /**
   * The client sends the max through a parameter and you return a list of
   * numbers from 1 to that number separated by commas.
   * 
   * @param max
   * @return
   */
  public static String countUpTo(int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    String answer = "";
    int count = 0;
    while (count != max)
    {
      if (count == 0)
      {
        answer = "Starting counting at ";
      }
      count++;
      answer += count + ",";
      if (count == max)
      {
        answer += "and we are done!";
      }
    }
    return answer;
  }

  /**
   * The client sends the max through a parameter and you return a list of
   * numbers from max down to zero in brackets in intervals of 2.
   * 
   * @param max
   * @return
   */
  public static String countDownBrackets(int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    String answer = "";
    while (max >= 0)
    {
      answer += "[" + max + "] ";
      max -= 2;
    }
    return answer;
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
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.

    String answer = "";
    int count = 0;
    while (count != max)
    {
      count++;
      if (count % weirdNum == 0)
      {
        answer += "[" + count + "] ";
      }
      else
      {
        answer += count + " ";
      }
    }
    return answer;
  }

  /**
   * Given a min and a max, return a list of numbers that are divisible by five
   * or six, but not both. The line will wrap after 10 numbers.
   * 
   * <pre>
   * numbersThatAreDivisibleByFiveOrSixButNotBoth(23, 38) ->
   *                                       "24,25,35,36,"
   * </pre>
   * 
   * @param min
   * @param max
   * @return
   */
  public static String numbersThatAreDivisibleByFiveOrSixButNotBoth(int min,
                                                                    int max)
  {
    String response = "";
    int i = min; // We'll use i as the LCV
    int count = 1; // keep track of the end of each line.

    while (i <= max)
    {
      // I love local variables.
      // Students need to know that these are possible:
      boolean divisableByFive = i % 5 == 0;
      boolean divisibleBySix = i % 6 == 0;
      boolean divisibleByFiveOrSix = divisableByFive || divisibleBySix;
      boolean divisibleByBothFiveAndSix = divisableByFive && divisibleBySix;

      // Isn't this easy to read?
      if (divisibleByFiveOrSix && !divisibleByBothFiveAndSix)
      {
        response += i; // always concatentate the number.
        // Now decide if we should append a comma OR put a new line.
        if (count < 10)
        {
          response += ",";
        }
        else
        {
          response += "\n";
          count = 0;
        }
        count++;
      }
      i++; // bump the LCV up so that someday it will cause while condition to
           // be false.
    }
    return response;
  }

  /**
   * Given max, this will generate a String of numbers from 1 to max separated
   * by commas. The last number will not have a comma after it. simpleLoop(5) ->
   * "1,2,3,4,5"
   * 
   * @param max
   * @return
   */
  public static String simpleLoopNoTrailingComma(int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    String answer = "";
    int count = 0;
    while (count != max)
    {
      count++;
      if (count < max)
      {
        answer += count + ",";
      }
      else
      {
        answer += count;
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
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.

    String answer = "T-Minus " + start + " seconds:";
    while (start >= 1)
    {
      answer += start + "...";
      start--;
    }
    answer += "BLAST OFF";
    return answer;

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
   * @return
   */
  public static String sumThemUp(int min, int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    String answer = "";
    int sum = min;
    if (min == max)
    {
      answer = min + " = " + max;
    }
    else
    {
      while (min <= max)
      {
        answer += min + " + ";
        min++;
        sum += min;
        if (min == max)
        {
          answer += min + " = " + sum;
          min++;
          sum += min;
        }
      }
    }
    return answer;
  }

  /**
   * Builds an algebra 1 T chart with the function f(x) = 3x + 2. The client
   * supplies the smallest and largest numbers for the T chart. This is also
   * called the domain.
   * 
   * @param max
   * @return
   */
  public static String buildTChart(int min, int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.

    String answer =
      "-----------------\n" + "x | f(x) = 3x + 2\n" + "-----------------\n";
    while (min <= max)
    {
      answer += min + "   " + ((min * 3) + 2) + "\n";
      min++;
    }
    answer += "-----------------\n";
    return answer;
  }

  /**
   * Builds a T chart the computes the square roots of numbers from min to max
   * by thousands. The square roots are rounded to the nearest integer. This T
   * chart will display the square root of negative numbers as imaginary. All
   * you do with imaginary numbers is put an "i" at the end of the number. The
   * Square root of -25 is 5i. See, imaginary numbers are easy!
   * 
   * <pre>
   * PRECONDITION: You can assume that min will always be a multiple of 1000.
   * </pre>
   * 
   * @param min
   *          will be a multiple of 1000.
   * @param max
   * @return
   */
  public static String buildSqrtTChart(int min, int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    /* "---------------------------\n" +
     * "x | f(x) = Square root of x\n" +
     * "---------------------------\n" +
     * "9000   95\n" +
     * "10000   100\n" +
     * "---------------------------\n" */
    String answer =
      "---------------------------\n" + "x | f(x) = Square root of x\n"
        + "---------------------------\n";
    while (min <= max)
    {
      if (min > 0)
      {
        answer += min + "   " + Math.round(Math.sqrt(min)) + "\n";
        min += 1000;
      }
      else if (min == 0)
      {
        answer += min + "   " + 0 + "\n";
        min += 1000;
      }
      else
      {
        answer += min + "   " + Math.round(Math.sqrt(min * -1)) + "i\n";
        min += 1000;
      }
    }
    answer += "---------------------------\n";
    return answer;
  }

  /**
   * Will say the name of the game equal to the number of times supplied by the
   * client.
   * 
   * <pre>
   * favoriteGame("meh", 3) -> "My favorite game is "meh", "meh", "meh"
   * </pre>
   * 
   * @param max
   * @return a sentence starting off with My favorite game is and the name of
   *         the game surrounded by double quotes.
   */
  public static String favoriteGame(String game, int times)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    int count = 0;
    String answer = "My favorite game is ";
    while (times > count)
    {
      answer += "\"" + game + "\", ";
      count++;
      if (times - 1 == count)
      {
        answer += "\"" + game + "\"!";
        count++;
      }
    }
    return answer;
  }

  /**
   * Writes out the number of tardies from min to max. Uses the correct ordinal
   * indicator ("th", "nd", "rd", "st") after the number. For example:
   * 
   * <pre>
   * tardies(2, 4) -> "2nd tardy"
   *                  "3rd tardy"
   *                  "4th tardy"
   *                  
   * tardies(20, 22) -> "20th tardy"
   *                    "21st tardy"
   *                    "22nd tardy"
   * </pre>
   * 
   * Hints: To find the last digit, you want to use % 10
   * 
   * @param min
   * @param max
   * @return
   */
  public static String tardies(int min, int max)
  {
    // YOU MAY ONLY USE WHILE LOOPS. ANY USE OF FOR
    // LOOPS WILL RESULT IN A SCORE OF ZERO.
    // "199th tardy\n"
    String answer = "";
    while (min <= max)
    {
      if (min % 10 == 0 || min % 10 == 4 || min % 10 == 5 || min % 10 == 6
        || min % 10 == 7 || min % 10 == 8 || min % 10 == 9)
      {
        answer += min + "th tardy\n";
        min++;
      }
      else if (min % 10 == 1)
      {
        if (min == 11 || min == 211)
        {
          answer += min + "th tardy\n";
          min++;
        }
        else
        {
          answer += min + "st tardy\n";
          min++;
        }
      }
      else if (min % 10 == 2)
      {
        if (min == 12 || min == 212)
        {
          answer += min + "th tardy\n";
          min++;
        }
        else
        {
          answer += min + "nd tardy\n";
          min++;
        }
      }
      else
      {
        if (min == 13 || min == 213)
        {
          answer += min + "th tardy\n";
          min++;
        }
        else
        {
          answer += min + "rd tardy\n";
          min++;
        }
      }
    }
    return answer;
  }

}