
/**
 * Scroll to the of this file to see the method stubs
 * that you need to complete for the four different
 * activities.
 * Open the file TestReview.java to test these methods.
 * 
 * @author Andre Menezes
 */

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review
{
  // VHS - I added this constant to make file handling easier
  // for VHS students. Students don't have to worry if they
  // are using Windows or OSX/Linux, and don't have to specify
  // the path as the parameter.
  private static final String FOLDER_PATH_PREFIX = "src" + File.separator;

  // HashMaps are not on the AP exam.
  private static HashMap<String, Double> sentiment =
    new HashMap<String, Double>();
  // ArrayLists ARE tested on the AP exam, but you don't need to know
  // how to use them in this lab.
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();

  private static final String SPACE = " ";

  /**
   * These methods are called automatically once when any method of the Review
   * class is called. The Scanner class default searches the root folder. Well
   * the College Board puts all the text files in the same folder as the code,
   * so as Eclipse users, we'll dump them in the 'src' folder as well. FileIO is
   * not tested on the AP exam, so you don't need to stress over this code.
   */
  static
  {
    // Load in the big sentiment database.
    try
    {
      Scanner input =
        new Scanner(new File(FOLDER_PATH_PREFIX + "cleanSentiment.csv"));
      int count = 0;
      while (input.hasNextLine())
      {
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0], Double.parseDouble(temp[1]));
        count++;
      }
      input.close();
      System.out.println(count
        + " strings loaded successfully from cleanSentiment.csv");
    }
    catch (Exception e)
    {
      System.out.println("Error reading or parsing cleanSentiment.csv\n\t" + e);
    }

    // read in the positive adjectives in postiveAdjectives.txt
    try
    {
      Scanner input =
        new Scanner(new File(FOLDER_PATH_PREFIX + "positiveAdjectives.txt"));
      int count = 0;
      while (input.hasNextLine())
      {
        String temp = input.nextLine().trim();
        posAdjectives.add(temp);
        count++;
      }
      input.close();
      System.out.println(count
        + " strings loaded successfully from positiveAdjectives.txt");
    }
    catch (Exception e)
    {
      System.out
        .println("Error reading or parsing postitiveAdjectives.txt\n\t" + e);
    }

    // read in the negative adjectives in negativeAdjectives.txt
    try
    {
      Scanner input =
        new Scanner(new File(FOLDER_PATH_PREFIX + "negativeAdjectives.txt"));
      int count = 0;
      while (input.hasNextLine())
      {
        negAdjectives.add(input.nextLine().trim());
        count++;
      }
      input.close();
      System.out.println(count
        + " strings loaded successfully from negativeAdjectives.txt");
    }
    catch (Exception e)
    {
      System.out
        .println("Error reading or parsing negativeAdjectives.txt\n\t" + e);
    }
  }

  /**
   * returns a string containing all of the text in fileName (including
   * punctuation), with words separated by a single space. 8/30/19 - Modified so
   * that you don't have to worry about the path. Now displays the number of
   * words that were loaded from fileName.
   */
  public static String textToString(String fileName)
  {
    String temp = "";
    try
    {
      Scanner input = new Scanner(new File(FOLDER_PATH_PREFIX + fileName));
      // add 'words' in the file to the string, separated by a single space
      int count = 0;
      while (input.hasNext())
      {
        temp = temp + input.next() + " ";
        count++;
      }
      input.close();
      System.out
        .println(count + " strings loaded successfully from " + fileName);
    }
    catch (Exception e)
    {
      System.out.println("Error reading or parsing " + fileName + "\n\t" + e);
    }
    // make sure to remove any additional space that may have been added at the
    // end of the string.
    return temp.trim();
  }

  /**
   * Returns the sentiment of the word. Zero is returned if the word is neutral
   * or doesn't exist in the database. A -4 is for terrible review words. A 3 is
   * for really nice review words. Note: toLowerCase is not tested on the AP
   * Exam.
   * 
   * @returns the sentiment value of word as a number between -4 (very negative)
   *          to 3 (very positive sentiment)
   */
  public static double sentimentVal(String word)
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch (Exception e)
    {
      return 0;
    }
  }

  /**
   * Returns the ending punctuation of a string, or the empty string if there is
   * nothing.
   * 
   * <pre>
   *   getPunctuation("pizza!") -> "!"
   *   getPunctuation("ugh.") -> "."
   *   getPunctuation("maybe") -> ""
   * </pre>
   * 
   * Note: This uses non-APCSA subset methods such as the Character class and
   * charAt method. Students will not be tested on these methods.
   */
  public static String getPunctuation(String word)
  {
    String punc = "";
    for (int i = word.length() - 1; i >= 0; i--)
    {
      if (!Character.isLetterOrDigit(word.charAt(i)))
      {
        punc = punc + word.charAt(i);
      }
      else
      {
        return punc;
      }
    }
    return punc;
  }

  /**
   * Returns the word after removing any beginning or ending punctuation Note:
   * This uses non-APCSA subset methods such as the Character class and charAt
   * method. Students will not be tested on these methods.
   * 
   * <pre>
   *   removePunctuation("pizza!") -> "pizza"
   *   removePunctuation("#ugh.") -> "ugh"
   *   removePunctuation("maybe") -> "maybe"
   * </pre>
   */
  /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation(String word)
  {
    String cloneWord = word; // Bad form to modify parameter, so we make a copy.
    while (cloneWord.length() > 0
      && !Character.isAlphabetic(cloneWord.charAt(0)))
    {
      cloneWord = cloneWord.substring(1);
    }
    while (cloneWord.length() > 0
      && !Character.isAlphabetic(cloneWord.charAt(cloneWord.length() - 1)))
    {
      cloneWord = cloneWord.substring(0, cloneWord.length() - 1);
    }

    return cloneWord;
  }

  /**
   * Randomly picks a positive adjective from the positiveAdjectives.txt file
   * and returns it. Make sure that the positiveAdjectives.txt file doesn't have
   * any blank lines in it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int) (Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }

  /**
   * Randomly picks a negative adjective from the negativeAdjectives.txt file
   * and returns it.Make sure that the negativeAdjectives.txt file doesn't have
   * any blank lines in it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int) (Math.random() * negAdjectives.size());
    return negAdjectives.get(index);

  }

  /**
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if (positive)
    {
      return randomPositiveAdj();
    }
    else
    {
      return randomNegativeAdj();
    }
  }

  /**
   * Gets the highest positive sentiment value of all words in the
   * postiveAdjectives.txt file. This is needed in Activity 4 when you are
   * looking to replace a positive word with a stronger one. If the original
   * adjective has higher value than all of the words in postiveAdjectives.txt,
   * then don't replace it.
   * 
   * @return
   */
  public static double highestPositiveSentimentVal()
  {
    double highestVal = Review.sentimentVal(Review.posAdjectives.get(0));
    for (String item : posAdjectives)
    {
      double itemSentimentVal = sentimentVal(item);
      if (itemSentimentVal > highestVal)
      {
        highestVal = itemSentimentVal;
      }
    }
    return highestVal;
  }

  /**
   * Gets the lowest positive sentiment value of all words in the
   * negativeAdjectives.txt file. This is needed in Activity 4 when you are
   * looking to replace a negative word with a stronger one. If the original
   * adjective has lower value than all of the words in negativeAdjectives.txt,
   * then don't replace it.
   * 
   * @return
   */
  public static double lowestNegativeSentimentVal()
  {

    double lowestVal = Review.sentimentVal(Review.negAdjectives.get(0));
    for (String item : negAdjectives)
    {
      double itemSentimentVal = sentimentVal(item);
      if (itemSentimentVal < lowestVal)
      {
        lowestVal = itemSentimentVal;
      }
    }
    return lowestVal;
  }

  // You have to finish these methods below:

  /**
   * Calculates the total sentiment of a review by adding up the sentiment of
   * all the words in the file.
   * 
   * @param fileName
   *          make sure to use the txt file extension.
   * @return
   */
  public static double totalSentiment(String fileName)
  {
    double answer = 0.0;
    String reviewText = textToString(fileName);
    removePunctuation(reviewText);
    while (reviewText.indexOf(" ") != -1)
    {
      answer +=
        sentimentVal(removePunctuation(reviewText
          .substring(0, reviewText.indexOf(" "))));
      reviewText = reviewText.substring(reviewText.indexOf(" ") + 1);
    }

    return answer;
  }

  /**
   * Returns a rating from 0 to 4. A zero rating means the review was brutal, a
   * four meant it was epic. Use the following scale for totalSentiment to
   * stars:
   * 
   * <pre>
   * Less than -10 is a 0
   * From -10 to -1 is a 1
   * From 0 to 9 is a 2
   * From 10 to 19 is a 3
   * 20 and higher is a 4.
   * </pre>
   * 
   * @param fileName
   * @return
   * @return
   */
  public static int starRating(String fileName)
  {
    double answer = totalSentiment(fileName);

    if (answer < -10)
    {
      answer = 0;
    }
    else if (answer >= -10 && answer <= -1)
    {
      answer = 1;
    }
    else if (answer >= 0 && answer <= 9)
    {
      answer = 2;
    }
    else if (answer >= 10 && answer <= 19)
    {
      answer = 3;
    }
    else
    {
      answer = 4;
    }
    return (int) answer;
  }

  /**
   * Given a review with asterisks in front of adjectives to be replaced, this
   * will randomly substitute words from the files positiveNegative.txt and
   * negativeAdjectives.txt.
   * 
   * @param fileName
   *          Must have asterisks in some of the words.
   * @return
   */
  public static String fakeReview(String fileName)
  {
    String reviewText = textToString(fileName);

    String fakeReview = "";

    while (reviewText.indexOf(" ") != -1)
    {
      String word = reviewText.substring(0, reviewText.indexOf(" "));

      if (word.indexOf("*") == 0)
      {
        double v = sentimentVal(removePunctuation(word));
        if (v > 0)
        {
          String strongAdj = randomPositiveAdj();
          while (v < sentimentVal(strongAdj))
          {
            strongAdj = randomPositiveAdj();
          }
          word = strongAdj;
          fakeReview += word + " ";
        }
        else if (v < 0)
        {
          String strongAdj = randomNegativeAdj();
          while (v > sentimentVal(strongAdj))
          {
            strongAdj = randomNegativeAdj();
          }
          word = strongAdj;
          fakeReview += word + " ";
        }
        else
        {
          fakeReview += removePunctuation(word) + " ";
        }
      }
      else
      {
        fakeReview += word + " ";
      }
      reviewText = reviewText.substring(reviewText.indexOf(" ") + 1);
    }
    return fakeReview + reviewText;
  }

  // For Activity 4, replace positive words with more positive sentiment ones.
  // Replace negative words with worse sentiment negative ones.
  // If a positive word has higher sentiment than any of yours, then leave it.
  // methods you will need to use to solve this:
  // textToString, indexOf, substring, equals
  // getPunctuation, randomPositiveAdj, randomNegativeAdj
  // highestPositiveSentimentVal, lowestNegativeSentimentVal

  private static void replaceAll()
  {
    // TODO Auto-generated method stub

  }

  private static int indexOf(String string)
  {
    // TODO Auto-generated method stub
    return 0;
  }

}