
/**
 * @author Andre Menezes
 *         This class deals with chapter 10.10 in the eText.
 *         Turn this in to the dropbox.
 *         Note: You are only allowed to use methods from
 *         the official APCS Subset. The String class specific ones are:
 *         <ol>
 *         <li>int length()</li>
 *         <li>String substring(from, to),</li>
 *         <li>String substring(from),</li>
 *         <li>int indexOf(String value),</li>
 *         <li>int compareTo(Object other),</li>
 *         <li>boolean equals(Object other)</li>
 *         <li>String toString()</li>
 *         </ol>
 *         <p>
 *         Use of any other method from the String class will result in a zero.
 *         </p>
 * 
 * @version 1.0
 */

public class JU10V
{
  // TODO: Add constant declarations here.
  // Use descriptive names. Do not say FIVE = 5, rather HIGH_SCORE = 5;

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
    // Setting both words to start on the second letter and printing them
    // together
    word1 = word1.substring(1);
    word2 = word2.substring(1);
    return word1 + word2;
  }

  /**
   * Given a string of odd length, return a three letter word from its middle,
   * so "Candy" yields "and". The string length will be at least 3. If the
   * string is not of odd length or has less than 3 letters, return "nope".
   * 
   * <pre>
   * getMiddleThree("Candy") -> "and"
   * getMiddleThree("graceap") -> "ace"
   * getMiddleThree("ababab") -> "nope"
   * </pre>
   */
  public static String getMiddleThree(String str)
  {
    // TODO: finish
    // Finding out if the number is odd or even
    if (str.length() % 2 == 0)
    {
      // str equals "nope" if the number is even
      str = "nope";
    }
    else
    {
      // if the number is odd, the middle three letters are displayed
      int middle = str.length() / 2;
      str = str.substring(middle - 1, middle + 2);
    }
    return str;
  }

  /**
   * A string dateStr represents a date in the format "mm/dd/yyyy" (for example,
   * "05/31/2009"). Write a statement or a fragment of code that changes dateStr
   * to the format "dd-mm-yyyy" (e.g., "31-05-2009"). It shouldn't matter if the
   * parameter uses forward slashes or hypens as a delimiter.
   * 
   * @param usaDate
   * @return
   */
  public static String getEuroDate(String usaDate)
  {
    // Creating a variable date format in Europe
    String euroDate =
      (usaDate.substring(3, 5) + "-" + usaDate.substring(0, 2) + "-"
        + usaDate.substring(6, usaDate.length()));
    // Returns euroDate
    return euroDate;
  }

  /**
   * Given two strings, return a new string created with the first letter of
   * firstWord and the last letter of lastWord. Substitute a hashtag symbol for
   * any string parameter that is empty.
   * 
   * <pre>
   * Examples: 
   * firstAndLast("kitten", "zip") -> "kp" 
   * firstAndLast("", "egg") -> "#p"
   * </pre>
   * 
   * @param firstWord
   * @param lastWord
   * @return
   */
  public static String firstAndLast(String firstWord, String lastWord)
  {
    // Redefining firstWord
    if ((firstWord.length() == 0) || (firstWord.substring(0, 1) == ""))
    {
      firstWord = "#";
    }
    else
    {
      firstWord = firstWord.substring(0, 1);
    }

    // Redefining lastWord
    if ((lastWord.length() == 0)
      || (lastWord.substring(lastWord.length() - 1, lastWord.length()) == ""))
    {
      lastWord = "#";
    }
    else
    {
      lastWord = lastWord.substring(lastWord.length() - 1, lastWord.length());
    }

    // Returning both words together
    return firstWord + lastWord;
  }

  /**
   * Suppose a string holds a person's last name and first name, separated by a
   * comma. Write a method convertName that takes such a string and returns a
   * string where the first name is placed first followed by one space and then
   * the last name.
   * 
   * <pre>
   * convertName("Hopper, Grace") -> "Grace Hopper"
   * convertName("Skywalker, Luke") -> "Luke Skywalker"
   * </pre>
   * 
   * @param phrase
   *          has two strings separated by a comma and a space. There will
   *          always be a comma and a space after the comma.
   * @return the first name followed by a space and the last name. No comma.
   */
  public static String convertName(String phrase)
  {
    String[] name = phrase.split(", ");

    phrase = name[1] + " " + name[0];

    return phrase;
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
    int indexA = sentence.indexOf('a'), indexE = sentence.indexOf('e'),
      indexI = sentence.indexOf('i'), indexO = sentence.indexOf('o'),
      indexU = sentence.indexOf('u');

    return "The first position of a is " + indexA + ".\n"
      + "The first position of e is " + indexE + ".\n"
      + "The first position of i is " + indexI + ".\n"
      + "The first position of o is " + indexO + ".\n"
      + "The first position of u is " + indexU + ".\n";
  }

}