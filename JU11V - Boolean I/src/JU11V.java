/**
 * Name: Andre Menezes
 * This goes with chapter 3 and deals with selection statements
 * such as IF THEN ELSE
 *
 * @version 3.0
 *
 */

public class JU11V
{
  // declare your constants here to fix "magic" numbers.

  /**
   * Write a method that returns if a number is positive, negative, or zero.
   * 
   * <pre>
   * For Example:
   * posZeroNeg(-4) -> "-4 is negative."
   * posZeroNeg(42) -> "42 is positive."
   * posZeroNeg(0) -> "0 is zero."
   * </pre>
   *
   * @param number
   * @return read the description and unit tests.
   */
  public static String posZeroNeg(int number)
  {
    String response = "";
    // TODO: Finish
    if (number > 0)
    {
      response = number + " is positive.";
    }
    else if (number < 0)
    {
      response = number + " is negative.";
    }
    else
    {
      response = number + " is zero.";
    }
    return response;
  }

  /**
   * Determines if a number is even or odd. For example:
   * 
   * <pre>
   * isEvenOrOdd(5) -> "5 is odd."
   * isEvenOrOdd(10) -> "10 is even."
   * </pre>
   * 
   * @param number
   * @return
   */
  public static String isEvenOrOdd(int number)
  {
    String answer = "";// declare a String variable answer and assign it empty
                       // string (which is different than null)

    // note if you just declare a String variable without initializing it,
    // it will have the value null.

    // TODO: Put code here.
    if (number % 2 == 0)
    {
      answer = number + " is even.";
    }
    else
    {
      answer = number + " is odd.";
    }
    return answer;
  }

  /**
   * If the number is a multiple of 5, return "HiFive" If the number is even,
   * return "HiEven" If they are both even and multiple of five, then return
   * "HiFiveAndEven" If neither is the case, return "Sorry" Hint: Look at page
   * 75 in the eBook.
   * 
   * @param number
   * @return
   */
  public static String simpleIf(int number)
  {
    String answer = ""; // declare a String variable answer and assign it
                        // "Sorry".

    /* Hint, you can use this code if you wish.... or not. if (number % 5 == 0)
     * { answer = "HiFive"; } if (number % 2
     * 
     * 
     * number % 5 != 0 && number % 2 != 0) { answer = "Sorry"; } */
    if (number % 5 == 0 && number % 2 == 0)
    {
      answer = "HiFiveAndEven";
    }
    else if (number % 5 == 0)
    {
      answer = "HiFive";
    }
    else if (number % 2 == 0)
    {
      answer = "HiEven";
    }
    else
    {
      answer = "Sorry";
    }
    return answer;
  }

  /**
   * The score parameter receives a score from 0.0 to 100.0. This method will
   * return the letter grade that matches the score. For example, an 86.5 would
   * return a "B", a 90.1 would return an "A". Any score under 60 would receive
   * an "F".
   * 
   * @param score
   * @return
   */
  public static String getLetterGrade(int score)
  {
    String letterGrade = "";
    if (score >= 90)
    {
      letterGrade = "A";
    }
    else if (score >= 80)
    {
      letterGrade = "B";
    }
    else if (score >= 70)
    {
      letterGrade = "C";
    }
    else if (score >= 60)
    {
      letterGrade = "D";
    }
    else
    {
      letterGrade = "F";
    }

    return letterGrade;
  }

  /**
   * Determines if the String's a, b, c are sorted in alphabetical order.
   * Returns a sentence that says if they are in order or not.
   * 
   * <pre>
   * Examples:
   * inAlphabeticalOrder("acorn", "apple", "pizza") -> "acorn, apple, and pizza are in alphabetical order."
   * inAlphabeticalOrder("bear", "morning", "zebra") -> "bear, morning, and zebra are in alphabetical order."
   * inAlphabeticalOrder("giraff", "morning", "zebra") -> "bear, morning, and zebra are NOT in alphabetical order."
   * </pre>
   * 
   */
  public static String inAlphabeticalOrder(String a, String b, String c)
  {
    String order = "";
    if (a.compareTo(b) < 0 && b.compareTo(c) < 0 && a.compareTo(c) < 0)
    {
      order = a + ", " + b + ", and " + c + " are in alphabetical order.";
    }
    else
    {
      order = a + ", " + b + ", and " + c + " are NOT in alphabetical order.";
    }
    return order;
  }

  /**
   * Create a String made up of just the first two letters. Hashtags are used if
   * there are not enough letters.
   * 
   * <pre>
   * firstTwoCharacters("superman") -> "su" 
   * firstTwoCharacters("e") -> "e#"
   * firstTwoCharacters("") -> "##"
   * </pre>
   * 
   * @param phrase
   *          != null
   * @return the first two letters, or hashtags if there's not enough letters
   *         for that.
   */
  public static String firstTwoCharacters(String phrase)
  {
    if (phrase.length() == 1)
    {
      phrase = phrase + "#";
    }
    else if (phrase.length() == 0)
    {
      phrase = "##";
    }
    else
    {
      phrase = phrase.substring(0, 2);
    }
    return phrase;
  }

}