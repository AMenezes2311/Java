/**
 * Name: Firstname and Lastname This goes with chapter 5 and deals with String
 * methods and some math. You are not allowed to use any non subset methods to
 * solve these.
 * 
 * @version 2.0 - fixed -0.0 root issue.
 * 
 * @author Andre Menezes
 */

public class JU09V
{

  /**
   * This method accepts a number as parameter and then
   * creates a sentence in the form of "The square root of 9 is 3.0" or
   * "The square root of 100 is 10.0"
   * 
   * @param number
   *          >= 0
   * @return see above
   */
  public static String squareRootSentence(int number)
  {
    String response = "The square root of " + number + " is ";
    // TODO: Add code here to make the tests pass.
    return response + Math.sqrt(number);
  }

  /**
   * This method accepts a number as parameter and then
   * creates a sentence in the form of "9 ^ 2 == 81"
   * 
   * @return see above
   */
  public static String exponentSentence(int base, int exponent)
  {
    String response = base + " ^ " + exponent + " == ";
    // TODO: Add code here to make the tests pass.
    return response + Math.pow(base, exponent);
  }

  /**
   * Create a method that builds a sentence with the name and phrase that the
   * person shouts. shout("Grace", "Java") -> Grace loves to shout the phase
   * "Java"!
   * 
   * @param name
   * @param phrase
   * @return
   */
  public static String shout(String name, String phrase)
  {
    return name + " loves to shout the phrase " + "\"" + phrase + "\"" + "!";
  }

  /**
   * Build a computer file path given the drive letter, the main folder name,
   * and the filename. Examples:
   * 
   * <pre>
   * getFilePath("C", "Documents", "rap.mp3") - >
   * </pre>
   * 
   * @param driveLetter
   * @param mainFolder
   * @param fileName
   * @return
   */
  public static String getFilePath(String driveLetter, String mainFolder,
                                   String fileName)
  {
    return driveLetter + ":\\" + mainFolder + "\\" + fileName;
  }

  /**
   * Unlike the Java built-in Math.sqrt method, GoodSqrt can return imaginary
   * numbers. If you haven't completed Algebra II, don't worry. When you take
   * the square root of a negative number, just remove the negative before you
   * square root it. Then concatenate an "i" to the end of it. Examples
   * 
   * <pre>
   * epicSqrt(25) -> "Square root of 25 is 5.0"
   * epicSqrt(-25) -> "Square root of -25 is 5.0i"
   * epicSqrt(-16) -> "Square root of -16 is 4.0"
   * epicSqrt(16) -> "Square root of 16 is 4.0"
   * </pre>
   * 
   * @param age
   * @return
   */
  public static String epicSqrt(int value)
  {
    String value_str = value + "";
    if (value_str.startsWith("-"))
    {
      value_str = value_str.substring(1);
      value = Integer.parseInt(value_str);
      return "Square root of " + "-" + value + " is " + Math.sqrt(value) + "i";
    }
    else
    {
      return "Square root of " + value + " is " + Math.sqrt(value);
    }
  }

  /**
   * Given 2 strings, return their concatenation, except dump the first char of
   * each. The strings will be at least length 1.
   * 
   * <pre>
   * noFirstLetterConcat("Hello", "There") -> "ellohere"
   * noFirstLetterConcat("java", "code") -> "avaode"
   * noFirstLetterConcat("shotl", "java") -> "hotlava"
   * </pre>
   * 
   * @param word1
   * @param word2
   * @return
   */
  public static String noFirstLetterConcat(String word1, String word2)
  {
    // TODO: Finish
    return word1.substring(1) + word2.substring(1);
  }

  /**
   * Creates a string that displays the first position of the letters a, e, i,
   * o, and u in sentence. If a vowel is not located, it will report -1 as the
   * position. Hint: use indexOf to simplify things.
   * 
   * <pre>
   *  findVowels("appleapp") would return
   *  The first position of a is 0.
   *  The first position of e is 4.
   *  The first position of i is -1.
   *  The first position of o is -1.
   *  The first position of u is -1.
   * </pre>
   * 
   * @param sentence
   *          != null and lowercase
   * @return
   */
  public static String findVowels(String sentence)
  {
    String a = "The first position of a is " + sentence.indexOf("a") + ".";
    String e = "The first position of e is " + sentence.indexOf("e") + ".";
    String i = "The first position of i is " + sentence.indexOf("i") + ".";
    String o = "The first position of o is " + sentence.indexOf("o") + ".";
    String u = "The first position of u is " + sentence.indexOf("u") + ".";
    return a + "\n" + e + "\n" + i + "\n" + o + "\n" + u + "\n";
  }

}