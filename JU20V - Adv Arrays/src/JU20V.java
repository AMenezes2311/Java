
/**
 * Name: Andre Menezes
 * Only turn this file in to the dropbox. Only use AP official
 * subset methods for ArrayLists, Strings, 1D arrays, etc. Focuses on Chapter 7
 * in the EText
 * 
 * @version 1.1 - shifted order to match tests.
 */

public class JU20V
{
  // Declare any constants up here.

  /**
   * Using a regular FOR loop, build a single sentence out of all of the names
   * in the names array. Example:
   * 
   * <pre>
   * sayNamesRegularFOR({"Grace","Steve","Ada"})
   *                    -> "<Grace><Steve><Ada>"
   * </pre>
   * 
   * @param names
   * @return
   */
  public static String sayNamesRegularFOR(String[] names)
  {
    // You MUST use a regular FOR loop to solve this.
    String sentence = "Start:";
    for (int i = 0; i < names.length; i++)
    {
      sentence += "<" + names[i] + ">";
    }
    return sentence + ":Finish";
  }

  /**
   * Using a FOR EACH loop, build a single sentence out of all of the names in
   * the names array. Example:
   * 
   * <pre>
   * sayNamesFOREACH({"Grace","Steve","Ada"})
   *                    -> "<Grace><Steve><Ada>"
   * </pre>
   * 
   * @param names
   * @return
   */
  public static String sayNamesFOREACH(String[] names)
  {
    // Remember to do this using a FOR EACH loop.
    // These are discussed at the bottom of page 233 in the
    // ebook.
    String sentence = "Start:";
    for (String name : names)
    {
      sentence += "<" + name + ">";
    }
    return sentence + ":Finish";
  }

  /**
   * Using a regular FOR loop, given an array, simply count the number of 42's
   * you find in the array. Related to: sequential search
   * 
   * <pre>
   * For example, 
   * arr = {5, 3, 8, 42, 9, 42, 9, 42, 42}
   * then 
   * warmUpCount42s(arr) -> 4
   * </pre>
   * 
   * @param arr
   * @return
   */
  public static int warmUpCount42RegularFOR(int[] arr)
  {
    // TODO: Need to complete.
    // Hint: You can use a normal FOR loop here. Do not use a FOR EACH loop.
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == 42)
      {
        count++;
      }
    }
    return count;
  }

  /**
   * Given four Strings, create an array and fill it with those strings in the
   * order given. So if name1 = "A", name2 = "Barry", name3 = "C", name4 = "D",
   * then the array would look:
   * 
   * <pre>
   * {"A", "Barry", "C", "D"}
   * </pre>
   * 
   * @param name1
   * @param name2
   * @param name3
   * @param name4
   * @return
   */
  public static String[] fillArrayWithNames(String name1, String name2,
                                            String name3, String name4)
  {
    // TODO: Finish
    String[] myList = new String[4];
    myList[0] = name1;
    myList[1] = name2;
    myList[2] = name3;
    myList[3] = name4;

    return myList;
  }

  /**
   * Using a FOR EACH loop, given an array, simply count the number of 42's you
   * find in the array. Related to: sequential search
   * 
   * <pre>
   * For example, 
   * arr = {5, 3, 8, 42, 9, 42, 9, 42, 42}
   * then 
   * warmUpCount42s(arr) -> 4
   * </pre>
   */
  public static int warmUpCount42FOREACH(int[] arr)
  {
    // TODO: Need to complete.
    // Hint: You can use a FOR EACH loop here.
    int count = 0;
    for (int number : arr)
    {
      if (number == 42)
      {
        count++;
      }
    }
    return count;
  }

  /**
   * Creates an array filled with whole numbers starting at zero and ending at
   * max.
   * 
   * <pre>
   * createArrayOfWholeNumbers(4) would return {0, 1, 2, 3, 4}
   * </pre>
   * 
   * @param max
   * @return
   */
  public static int[] createArrayOfWholeNumbers(int max)
  {
    // TODO: Finish
    // Big hint is on page 241 in the Ebook
    int[] myList = new int[max + 1];
    for (int i = 0; i < myList.length; i++)
    {
      myList[i] = i;
    }
    return myList;
  }

  /**
   * Takes an array, creates a new array with the opposite values.
   * 
   * @param itemArray
   * @return
   */
  public static boolean[] reverseTheTruth(boolean[] itemArray)
  {
    // TODO: Finish
    boolean[] myList = new boolean[itemArray.length];
    for (int i = 0; i < itemArray.length; i++)
    {
      if (itemArray[i] == true)
      {
        myList[i] = false;
      }
      else
      {
        myList[i] = true;
      }
    }
    return myList;
  }

  /**
   * Creates a new array with values that are double the values in the original
   * array. itemArray is NOT changed after the call to doubleAllOfThem
   * 
   * <pre>
   *  Example
   *  stuff == {2, 3, -4,  8, 0, 1}
   *  thingy = doubleAllOfThem(stuff);
   *  thingy == {4, 6, -8, 16, 0, 2}
   *  stuff == {2, 3, -4, 8, 0, 1}
   * </pre>
   * 
   * @param itemArray
   * @return
   */
  public static int[] doubleAllOfThem(int[] itemArray)
  {
    // TODO: Finish
    int[] myList = new int[itemArray.length];
    for (int i = 0; i < itemArray.length; i++)
    {
      myList[i] = itemArray[i] * 2;
    }

    return myList;
  }

  /**
   * Creates a new array using the values of myArray and yourArray. Basically
   * you are creating a new array by stitching the first array with the second.
   * 
   * <pre>
   *  stuff1 = {1, 4, 2}
   *  stuff2 = {5, 3};
   *  stuff3 = appendArrays(stuff1, stuff2);
   *  stuff3 == {1, 4, 2, 5, 3};
   * </pre>
   * 
   * @param myArray
   * @param yourArray
   * @return
   */
  public static int[] appendArrays(int[] myArray, int[] yourArray)
  {
    // TODO: Finish
    int[] myList = new int[myArray.length + yourArray.length];
    int pos = 0;
    for (int number : myArray)
    {
      myList[pos] = number;
      pos++;
    }

    for (int number : yourArray)
    {
      myList[pos] = number;
      pos++;
    }
    return myList;
  }

  /**
   * Returns true if the numbers in the values array contain four numbers that
   * have the same value.
   * 
   * <pre>
   * isConsecutiveFour({3, 4, 5, 5, 5, 5, 4, 5}) -> true
   * isConsecutiveFour({3, 4, 5}) -> false
   * isConsecutiveFour({1, 1, 1, 1, 1, 4}) -> true
   * </pre>
   * 
   * @param values
   *          is not null
   * @return true or false
   */
  public static boolean isConsecutiveFour(int[] values)
  {
    // A big hint can be found if you sign into your EText and then
    // watch the video on this exact problem.
    // https://mediaplayer.pearsoncmg.com/assets/secs-liang-pr-Consecutive_Four?
    // TODO: Finish
    for (int i = 0; i < values.length - 3; i++)
    {
      boolean isEqual = true;
      for (int j = i; j < i + 3; j++)
      {
        if (values[j] != values[j + 1])
        {
          isEqual = false;
          break;
        }
      }
      if (isEqual)
      {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array, find the VALUE of the largest element in the array.
   * Once you find it, build a String sentence with the following format:
   * 
   * <pre>
   * "For the array [20, 10, 5, 90, 7], the largest value 90 can be found at index 3"
   * </pre>
   * 
   * @param arr
   *          non-empty, non null
   * @return a string of the format above.
   */
  public static String selectLargest(int[] arr)
  {
    String response = "For the array [";
    for (int i = 0; i < arr.length; i++)
    {
      if (i != arr.length - 1)
      {
        response += arr[i] + ", ";
      }
      else
      {
        response += arr[i] + "], ";
      }
    }
    int largest = arr[0];
    int index = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] > largest)
      {
        largest = arr[i];
        index = i;
      }
    }
    return response + "the largest value " + largest + " can be found at index "
      + index;
  }

  /**
   * Given an array, and two locations, you will swap the values of those two
   * locations. If the x and y parameters represent invalid indexes, then no
   * changes
   * will be made to the arr array.
   * 
   * @param arr
   *          not null, non-empty.
   * @param x
   *          could be negative or too large
   * @param y
   *          could be negative or too large
   */
  public static void swapEmIn1DArray(int[] arr, int x, int y)
  {
    // first check if the indexes are valid.
    // Java subscripts can not be negative nor larger than the length.
    // TODO: Finish
    // if either of the indexes are valid, then do nothing.
    if (x < 0 || x > arr.length - 1 || y < 0 || y > arr.length - 1)
    {
      return;
    }
    else
    {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }
  }

}