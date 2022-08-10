/**
 * Name: Andre Menezes. Exercises practicing using 1D arrays of
 * primitives. Submit this to the dropbox. Restrictions: You may not use the
 * Arrays nor List class to solve any of these problems. This includes the
 * Arrays.equals method which would solve some of these problems in one line of
 * code.
 * 
 * @author - Andre Menezes
 * 
 *         You may only official AP Subset methods.
 * 
 * @version 2.0 - fixed typos in the comment, talked about null arrays.
 */

public class JU19V
{
  // Declare any constants here.

  // Since all of these methods are static, you will not
  // declare any instance variables.

  /**
   * We send an array to be mutated. This method changes the 1st element of the
   * array to 40. and the fourth element to 35 if a fourth element exists.
   * 
   * <pre>
   *  Example 1
   *  stuff ==  {23, 23, 38, 12, 22, 30}
   *  changeThe1stAnd4thValue(stuff);
   *  stuff ==  {40, 23, 38, 35, 22, 30}
  
   *  Example 2 (there is no 4th element)
   *  cruft ==  {23, 23, 38}
   *  changeThe1stAnd4thValue(stuff);
   *  cruft ==  {40, 23, 38}
   * </pre>
   * 
   * @param score
   */
  public static void changeThe1stAnd4thValue(int[] score)
  {
    // TODO: Finish
    // Hint: How to change values in an array is on page 229 in the EText
    // Don't forget to check the length of the array. Use an IF statement.
    if (score.length >= 4)
    {
      score[0] = 40;
      score[3] = 35;
    }
    else
    {
      score[0] = 40;
    }
  }

  /**
   * Given three non-null arrays, return back the total number of elements of
   * all three arrays.
   * 
   * <pre>
   * arr1 == {1, 4, 4}
   * arr2 == {8, 3, 2, 1}
   * arr3 == {4}
   * totalNumberOfElements(arr1, arr2, arr3) -> 8
   * </pre>
   * 
   * @param arr1
   * @param arr2
   * @param arr3
   */
  public static int totalNumberOfElements(int[] arr1, int[] arr2, int[] arr3)
  {
    // TODO: Finish
    int aLen = arr1.length;
    int bLen = arr2.length;
    int cLen = arr3.length;

    int result = aLen + bLen + cLen;
    return result;
  }

  /**
   * Calculates the capacity of a given array; that is, how many integers can be
   * stored into the array reference that is sent to the parameter itemArray
   * 
   * <pre>
   * int[] arr = new int[13];
   * getCapacity(arr) -> 13
   * 
   * int[] stuff = null
   * getCapacity(arr) -> 0
   * 
   * int[] moreStuff = {3, 4, 1};
   * getCapacity(arr) -> 3
   * </pre>
   * 
   * 
   * @param itemArray
   * @return
   */
  public static int getCapacity(int[] itemArray)
  {
    // TODO: Finish

    /* Non-primitive types like 1D arrays and Strings aren't zero or "" when
     * they are declared but not initialized. The book doesn't really touch on
     * this so there's a big hint on Lesson 14.2 in the 7.2 notes.
     * In Summary, if a variable has a null value, your app will crash if you
     * try
     * to call a method or property off it with the "." operator. */
    if (itemArray == null)
      return 0;
    else
      return itemArray.length;
  }

  /**
   * Given an non-null array, this method mutates the array by raising just the
   * last element to the given power parameter. Note: Math.pow always returns a
   * double, so you'll have to deal with that.
   * 
   * <pre>
   * itemArray == {3, 3, 5, 2}
   * then
   * raiseTheLastElementToThePower(itemArray, 3) mutates itemArray to
   * itemArray = {3, 3, 5, 8}
   * </pre>
   * 
   * @param itemArray
   * @param power
   */
  public static void raiseTheLastElementToThePower(int[] itemArray, int power)
  {
    // TODO: Finish
    itemArray[itemArray.length - 1] =
      (int) Math.pow(itemArray[itemArray.length - 1], power);

  }

  /**
   * Mutates the myArray by swapping element 4 with element 5. PRECONDITION:
   * myArray will have at least 5 elements. Remember that in Java, arrays start
   * at zero.
   * 
   * <pre>
   * Given: 
   * myArray == {10, 20, 4, 30, 2, 8} 
   * swapEm(myArray);
   * myArray == {10, 20,4, 2, 30, 8}
   * </pre>
   * 
   * @param myArray
   */
  public static void swapEm(int[] myArray)
  {
    // Pretty much the entire solution to
    // this problem is in the TestPassArray.java
    // file in the book on page 240.
    // TODO: Finish
    if (myArray.length >= 5)
    {
      int temp = myArray[4];
      myArray[4] = myArray[5];
      myArray[5] = temp;
    }
  }

  /**
   * Given a non-null array of integers, calling this method mutates the array
   * by swapping the first element with the last one. The array can be of any
   * size.
   * 
   * <pre>
   * Given:
   * myArray == {10, 20, 4, 30, 2, 8};
   * swapFirstWithLast(myArray);
   * myArray == {8, 20, 4, 30, 2, 10};
   * </pre>
   * 
   * @param myArray
   */
  public static void swapFirstWithLast(int[] myArray)
  {
    // TODO: Finish
    int temp = myArray[0];
    myArray[0] = myArray[myArray.length - 1];
    myArray[myArray.length - 1] = temp;
  }

  /**
   * Calculates the number of non zero elements in the array.
   * 
   * <pre>
   * if myArray is {2, 0, 0, 1, 0, 0, 2, 0}
   * then getNumberOfNonZeroElements(myArray) -> 3
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int getNumberOfNonZeroElements(int[] myArray)
  {
    // TODO: Finish
    int nonZeroElements = 0;
    for (int i = 0; i < myArray.length; i++)
    {
      if (myArray[i] != 0)
      {
        nonZeroElements++;
      }
    }
    return nonZeroElements;
  }

  /**
   * Given an array, this method builds a String describing the array element by
   * element. See the tests.
   * 
   * @param list
   * @return
   */
  public static String prettyPrint(int[] list)
  {
    // TODO: Finish
    // Remember that you are not allowed to use
    // the Array's class to solve.
    // You may only use official AP Subset methods that
    // are outlined in the AP Quick Reference Guide
    // If you use any unofficial methods, you will get zero points
    // for the entire assignment.

    String output = "This array contains " + list.length + " elements.\n";
    if (list.length == 0)
    {
      output += "The array is empty.\n";
    }
    else
    {
      for (int i = 0; i < list.length; i++)
      {
        output += "The value of list sub " + i + " is " + list[i] + "\n";
      }
    }
    return output;
  }

  /**
   * Checks if the values of myArray match the values in yourArray. If the two
   * arrays have different length, they are not equal. Do not use the Arrays
   * class.
   * 
   * <pre>
   * equalArrays({4, 2, 9}, {4, 2, 9}) -> true
   * equalArray({9, 8, 2}, {9, 8}) -> false
   * </pre>
   * 
   * @param myArray
   *          will never be null
   * @param yourArray
   *          will never be null
   * @return
   */
  public static boolean equalArrays(int[] myArray, int[] yourArray)
  {
    // TODO: Finish
    // Again you are not allowed to use the Arrays class.
    // just use a loop, if you find one that doesn't match, then return false...
    // if the loop iterates all the way through, then return true.
    boolean equalArr = true;
    if (myArray.length == yourArray.length)
      for (int i = 0; i < myArray.length; i++)
      {
        if (myArray[i] == yourArray[i] && equalArr == true)
        {
          equalArr = true;
        }
        else
        {
          equalArr = false;
        }
      }
    else
      equalArr = false;
    return equalArr;
  }

  /**
   * Counts the number of 42's stored in myArray.
   * 
   * <pre>
   *  stuff == {0, 1, 42, 2, 42, 1, 2}
   *  countFortyTwos(stuff) returns 2
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int countFortyTwos(int[] myArray)
  {
    // TODO: Finish
    int count = 0;
    for (int i = 0; i < myArray.length; i++)
    {
      if (myArray[i] == 42)
      {
        count++;
      }
    }
    return count;
  }

  /**
   * Sums up the total value of the array elements. Look at the bottom of page
   * 231 for an epic victory royale hint.
   * 
   * <pre>
   * myArray = {4, 2, 3}
   * getTotal(myArray) -> 9
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int getTotal(int[] myArray)
  {
    // TODO: Finish
    int total = 0;
    for (int i = 0; i < myArray.length; i++)
    {
      total += myArray[i];
    }
    return total;
  }

  /**
   * Calculates the average score of all test values in the array. So if the
   * student got a 100, an 80, and a 90, then the average is 90.0.
   * 
   * <pre>
   * getAverage({100, 80}) -> 90.0
   * 
   * @param scoreArray
   * @return
   */
  public static double getAverage(int[] scoreArray)
  {
    // TODO: Finish
    // Look in the eBook on page 234 the AnalyzeNumbers problem
    // for a huge hint.
    double average = 0;
    for (int i = 0; i < scoreArray.length; i++)
    {
      average += scoreArray[i];
    }
    average = average / scoreArray.length;
    return average;
  }

  /**
   * Given an non null array of grades, it returns the final letter grade that
   * the student should receive. It doesn't round, so an 89.9 is a B.
   * 
   * <pre>
   *  calculateGrade({90, 100}) -> "A"
   *  calculateGrade({90, 80, 100) -> "A"
   *  calculateGrade({70, 90, 81}) -> "B"
   * </pre>
   * 
   * @param scoreArray
   * @return
   */
  public static String calculateGrade(int[] scoreArray)
  {
    // TODO: Finish
    double average = getAverage(scoreArray);
    if (average >= 90)
    {
      return "A";
    }
    else if (average >= 80)
    {
      return "B";
    }
    else if (average >= 70)
    {
      return "C";
    }
    else if (average >= 60)
    {
      return "D";
    }
    else
    {
      return "F";
    }
  }

  /**
   * Finding the largest element. (Answer is on page 232 of the EBook). Given an
   * array of integers, return the value of the largest element in the array.
   * 
   * <pre>
   *  stuff == {30, 11, 23, 17, 5}
   *  getTheBiggest(stuff) -> 30 
   *  stuff == {8, 3, 101, 89, 88, 22}
   *  getTheBiggest(stuff) -> 101
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int getTheBiggest(int[] myArray)
  {
    // The answer is in your Ebook on page 232.
    // TODO: fix
    int highest = myArray[0];
    for (int i = 0; i < myArray.length; i++)
    {
      if (myArray[i] > highest)
      {
        highest = myArray[i];
      }
    }
    return highest;
  }

  /**
   * Given the titles of books that you are going to put on a shelf, find the
   * one that would go at the end of the shelf if you alphabetically sorted
   * them. PRECONDITION: all books start with an uppercase letter.
   * 
   * <pre>
   *  stuff == {"Horse", "Chicken", "Snake", "Apple"}
   *  bookAtEndOfShelf(stuff) -> "Snake" 
   *  stuff == {"Zebra", "Zoo", "Monster"}
   *  bookAtEndOfShelf(stuff) -> "Zoo"
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static String bookAtEndOfShelf(String[] books)
  {
    // > and < only work for doubles and ints,,, how do you compare two Strings?
    // TODO: fix
    String lastLetter = books[0];
    for (int i = 0; i < books.length; i++)
    {
      if (lastLetter.compareTo(books[i]) < 0)
      {
        lastLetter = books[i];
      }
    }
    return lastLetter;

  }

  /**
   * Shift all numbers in the array one spot forward. The last element goes to
   * the front. Look the bottom of page 232 in the EText.
   * 
   * <pre>
   * nums = {34, 10, 42, 8, 13}
   * shiftAllForwardOne(nums)
   * nums now is {13, 34, 10, 42, 8}
   * </pre>
   * 
   * @param nums
   */
  public static void shiftAllForwardOne(int[] nums)
  {
    // TODO: read the comments above for an hint that will make you floss and
    // dab at the same time.
    int temp = nums[nums.length - 1];
    for (int i = nums.length - 1; i > 0; i--)
    {
      // Shift element of array by one
      nums[i] = nums[i - 1];
    }
    nums[0] = temp;
  }

  /**
   * The array stores a different word in each element. Count the total number
   * of letters in the array. Hint: The String class has a length() accessor
   * method that returns the number of letters in a String reference.
   * 
   * <pre>
   *  Example:
   *  words == {"apple", "bah", "oh"};
   *  getTotalLetters(words) -> 10
   * </pre>
   * 
   * @param wordArray
   * @return
   */
  public static int getTotalLetters(String[] wordArray)
  {
    int total = 0;
    // TODO: Finish
    for (int i = 0; i < wordArray.length; i++)
    {
      total += wordArray[i].length();
    }
    return total;
  }

}