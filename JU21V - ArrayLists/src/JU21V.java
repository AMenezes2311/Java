import java.util.ArrayList;

/**
 * JU15 focuses on ArrayLists which are really 1D arrays of reference types.
 * There
 * are some review problems of 1D arrays so you will appreciate the power of
 * Lists.
 * You are only allowed to use AP Subset methods. That means you can only use
 * add, get, remove, indexOf
 * 
 * @version 2.1 - spelled broccoli with one "l'. and exchanged List interface
 *          with concrete ArrayList
 * @author Andre Menezes
 */

public class JU21V
{
  // Declare your constants up here.
  // Don't use non-descriptive names like EIGHT=8

  /**
   * Add aName at location and scoot all values down one. For
   * example:
   *
   * <pre>
   * arr == {"cdohs", "irhs", "ahs"};
   * epicAdd(0, "cross", arr);
   * arr == {"cross", "cdohs", "irhs", "ahs"}
   *
   * arr == {"cdohs", "irhs"};
   * epicAdd(1, "cross", arr);
   * arr == {"cdohs", "cross", "irhs"}
   *
   * PRECONDITION: arr is not null.
   * POSTCONDITION: arr has the same length, but has a new element inserted.
   * </pre>
   *
   * @param location
   *          a valid subscript in arr.
   * @param aName
   *          a non null String.
   * @param arr
   *          not null, and has extra space in the array to accomidate the new
   *          value.
   */
  public static void epicAdd(int location, String aName, ArrayList<String> arr)
  {
    // TODO: Write code in the body of this method.
    // this is super easy to get your confidence up.
    arr.add(location, aName);
  }

  /**
   * Deletes the first two elements of myList
   *
   * @param myList
   *          has at least two elements.
   */
  public static void removeTheFirstTwoValues(ArrayList<Integer> myList)
  {
    // TODO: Write code in the body of this method.
    // this is super easy to get your confidence up.
    myList.remove(0);
    myList.remove(0);
  }

  /**
   * Removes the last element of mylist. If the arraylist is empty, nothing
   * happens to the array.
   *
   * @param myList
   *          != null
   */
  public static void removeTheLastValue(ArrayList<String> myList)
  {
    // TODO: Write code in the body of this method.
    // this is super easy to get your confidence up.
    if (myList.isEmpty() == false)
    {
      myList.remove(myList.size() - 1);
    }
  }

  /**
   * Adds spaghetti to the middle of your sandwich.
   *
   * @param sandwich
   *          != null
   */
  public static void addSpaghetti(ArrayList<String> sandwich)
  {
    // TODO: Write code in the body of this method.
    // a little tougher but not AP quality
    sandwich.add(sandwich.size() / 2, "spaghetti");
  }

  /**
   * Remove the last half of the people from the list.
   * So if the list is ["Fred", "Grace", "Bill", "Sue"] then after the snap
   * it should be ["Fred", "Grace"]
   * If it's an odd number of people, then keep the middle person because
   * Thanos is giving. /r/ThanosDidNothingWrong
   * 
   * @param victims
   */
  public static void thanosSnap(ArrayList<String> victims)
  {
    // TODO: Complete by mutating the victims reference.
    int length = victims.size() / 2;
    int i = 0;
    while (i < length)
    {
      victims.remove(victims.size() - 1);
      i++;
    }
  }

  /**
   * Removes all occurrences of the String target from the ArrayList myList.
   *
   * @param myList
   *          != null
   * @param target
   *          != null
   */
  public static void removeThatWord(ArrayList<String> myList, String target)
  {
    // TODO: Write code in the body of this method.
    // the remove method is a bit trickier than you might think.

    // REMINDER: You may only use official AP SUBSET METHODS.
    // For example you can't use contains because it's not listed in the quick
    // reference guide.

    for (int i = 0; i < myList.size(); i++)
    {
      if (myList.contains(target))
      {
        myList.remove(myList.indexOf(target));
      }
    }
  }

  /**
   * Replace any pizza and hamburger with broccoli..
   *
   * @param myFood
   *          != null
   */
  public static void makeMeHealthy(ArrayList<String> myFood)
  {
    // TODO: Write code in the body of this method.
    // not too bad.
    for (int i = 0; i < myFood.size(); i++)
    {
      if (myFood.indexOf("hamburger") == i)
      {
        myFood.set(i, "broccoli");
      }
      else if (myFood.indexOf("pizza") == i)
      {
        myFood.set(i, "broccoli");
      }
    }
  }

  /**
   * Creates an array that has the values of myList but in reverse order.
   *
   * @param myList
   *          != null
   * @return an ArrayList reference with the same values in reverse order.
   */
  public static ArrayList<String> reverse(ArrayList<String> list)
  {
    // TODO: Write code in the body of this method.
    ArrayList<String> list = new ArrayList<>();
    list.add(0, "A");
    list.add(0, "B");
    list.add(0, "C");
    list.add(0, "D");
    list.add(list.set(1, "Z"));
    list.set(2, list.remove(3));
    return list;
  }

  /**
   * Adds on the following numbers to the end of the array: 4, 3, 1 and 8
   *
   * <pre>
   * if arr == {8, 8, 1};
   * after the call to fill1DArray(arr)
   * arr == {8, 8, 1, 4, 3, 1, 8};
   * </pre>
   *
   * @param arr
   *          != null
   * @return
   */
  public static int[] fill1DArray(int[] arr)
  {
    // TODO: Write code in the body of this method.
    // This is to show you what a pain 1d arrays can be.
    // create a new array, copy the values over, then copy the 4318 over too.
    int[] newArray = new int[arr.length + 4];
    for (int i = 0; i < arr.length; i++)
    {
      newArray[i] = arr[i];
    }
    newArray[arr.length] = 4;
    newArray[arr.length + 1] = 3;
    newArray[arr.length + 2] = 1;
    newArray[arr.length + 3] = 8;
    return newArray;
  }

  /**
   * Adds on the following numbers to the end of the array: 4, 3, 1 and 8
   *
   * <pre>
   * if arr == {8, 8, 1};
   * after the call to fill1DArray(arr)
   * arr == {8, 8, 1, 4, 3, 1, 8};
   * </pre>
   *
   * This should be alot easier than the 1D array version.
   *
   * @param arr
   * @return
   */
  public static ArrayList<Integer> fillArrayList(ArrayList<Integer> arr)
  {
    // TODO: Write code in the body of this method.
    int i = arr.size();
    arr.add(i, 4);
    arr.add(i + 1, 3);
    arr.add(i + 2, 1);
    arr.add(i + 3, 8);
    return arr;
  }

  /**
   * Removes the smallest value in myList. Remember to use the king of the hill
   * approach. Assume the first value in the array is the smallest and look for
   * another one that's smaller.
   *
   * <pre>
   * myList = {8, 10, 2, 100};
   * destroySmallest(myList);
   * myList = {8, 10, 100};
   * </pre>
   *
   * @param myList
   *          != null
   */
  public static void destroySmallest(ArrayList<Integer> myList)
  {
    int smallest = myList.get(0);
    // TODO: Write code in the body of this method.
    for (int i = 0; i < myList.size(); i++)
    {
      if (myList.get(i) < smallest)
      {
        smallest = myList.get(i);
      }
    }
    myList.remove(myList.indexOf(smallest));
  }

  /**
   * Computes the sum of all values in an numList, but not any after the first
   * 42 found in the list.
   *
   * <pre>
   * EXAMPLES:
   * 1,4,2 will add to 7
   * 1,42,2 will add to 43
   * </pre>
   *
   * @param numList
   * @return
   */
  public static int getSumButNotAfter42(ArrayList<Integer> numList)
  {
    // TODO: Write code in the body of this method.
    int sum = 0;
    for (int i = 0; i < numList.size(); i++)
    {
      if (numList.get(i) == 42)
      {
        sum += 42;
        return sum;
      }
      else
      {
        sum += numList.get(i);
      }
    }
    return sum;
  }

  /**
   * Given a List of one or more ints, return the difference between the largest
   * and smallest values in the list.
   * 
   * <pre>
   * if numList = {4, 10, 3, 100, 8}
   * then getRange -> 97
   * if numList = {8, 2, -4, 9, 10}
   * then getRange -> 14
   * </pre>
   * 
   * @param numList
   * @return the difference of the max and min in the list.
   */
  public static int getRange(ArrayList<Integer> numList)
  {
    // TODO: Write code in the body of this method.
    int smallest = numList.get(0);
    for (int i = 0; i < numList.size(); i++)
    {
      if (numList.get(i) < smallest)
      {
        smallest = numList.get(i);
      }
    }

    int largest = numList.get(0);
    for (int i = 0; i < numList.size(); i++)
    {
      if (numList.get(i) > largest)
      {
        largest = numList.get(i);
      }
    }
    return largest - smallest;
  }

  /**
   * Given a list of Strings, returns the length of the longest String in the
   * list. If aList is empty, then return zero. Hint. The String class has a
   * length() method that returns the number of letters in the String. For
   * example:
   *
   * <pre>
   * String myName = "Steve Jobs";
   * String yourName = "Student";
   * System.out.print(myName.length()) --> 10
   * System.out.print(yourName.length()) --> 7
   *
   * if aList == {"Ada", "Steve", "Grace Hopper", "Bill"}
   * then
   * getSizeOfBigWord(aList) returns 12
   * </pre>
   *
   * @param aList
   *          is not null.
   * @return returns the size of the largest word in aList.
   */
  public static int getSizeOfBigWord(ArrayList<String> aList)
  {
    // TODO: Write code in the body of this method.
    if (aList.isEmpty() == false)
    {
      String largestString = aList.get(0);
      for (int i = 0; i < aList.size(); i++)
      {
        if (aList.get(i).length() > largestString.length())
        {
          largestString = aList.get(i);
        }
      }
      return largestString.length();
    }
    else
    {
      return 0;
    }

  }

  /**
   * destroyDupes will make sure that each string is unique in a sorted list of
   * Strings by destroying any duplicates. This problem demonstrates a common
   * issue that new students to Lists experience when removing items. For
   * example:
   *
   * <pre>
   * aList = {"hey", "hey", "hey", "pizza", "zebra", "zebra"}
   * destroyDups(aList);
   * aList = {"hey", "pizza", "zebra"};
   * </pre>
   *
   * @param aList
   */
  public static void destroyDupes(ArrayList<String> aList)
  {
    // TODO: Write code in the body of this method.
    for (int i = 0; i < aList.size(); i++)
    {
      for (int j = i + 1; j < aList.size(); j++)
      {
        if (aList.get(i) == aList.get(j))
        {
          aList.remove(j);
          j--;
        }
      }
    }
  }

  /**
   * Doubles all of the words in aList. For example:
   *
   * <pre>
   * aList = {"i", "love", "java"};
   * talktalk(aList)
   * aList = {"i", "i", "love", "love", "java", "java"};
   * </pre>
   *
   * @param aList
   *          This list is mutated by your method.
   */
  public static void talktalk(ArrayList<String> aList)
  {
    // TODO: Write code in the body of this method.
    for (int i = 0; i < aList.size(); i += 2)
    {
      aList.add(i + 1, aList.get(i));
    }
  }

  /**
   * Given a list of integers, return true if the list contains either three
   * even or three odd values next to each other.
   * 
   * <pre>
   * numList = {7, 4, 9, 9, 9, 2, 1, -1}
   * threeOddEven -> true
   * numList = {7, 4, 9, 4, 2, 1, 3}
   * threeOddEven -> false
   * numList = {2, 4}
   * threeOddEven -> false
   * </pre>
   */
  public static boolean threeOddEven(ArrayList<Integer> numList)
  {
    // TODO: Write code in the body of this method.
    for (int i = 0; i < numList.size() - 2; i++)
    {
      if (numList.get(i) % 2 == numList.get(i + 1) % 2
        && numList.get(i) % 2 == numList.get(i + 2) % 2)
      {
        return true;
      }
    }
    return false;
  }

  /**
   * targetThrees will cram in a String of three asterisks before every String
   * of three characters in aList. (Hint: Use the .length() of String to count
   * the letters in a String reference) For example:
   *
   * <pre>
   * aList == {"wolf", "abc", "a", "e3e"}
   * After the call to targetThrees(aList);
   * aList == {"wolf", "***", "abc", "a", "***", "e3e"};
   * </pre>
   *
   * @param aList
   */
  public static void targetThrees(ArrayList<String> aList)
  {
    // TODO: Write code in the body of this method.
    for (int i = 0; i < aList.size(); i++)
    {
      if (aList.get(i).length() == 3)
      {
        aList.add(i++, "***");
      }
    }
  }

  /**
   * Flip every pair of words in aList. If odd number of words, then the last
   * one doesn't move. For example:
   *
   * <pre>
   * aList = {"bill", "gates", "steve", "jobs", "grace", "hopper"};
   * flipPairs(aList);
   * aList = {"gates", "bill", "jobs", "steve", "hopper", "grace"};
   * </pre>
   *
   * @param aList
   *          is not null
   */
  public static void flipPairs(ArrayList<String> aList)
  {
    // TODO: Write code in the body of this method.
    if (aList.size() % 2 == 0)
    {
      for (int i = 0; i < aList.size(); i += 2)
      {
        String temp = aList.get(i);
        aList.set(i, aList.get(i + 1));
        aList.set(i + 1, temp);
      }
    }
    else
    {
      for (int i = 0; i < aList.size() - 1; i += 2)
      {
        String temp = aList.get(i);
        aList.set(i, aList.get(i + 1));
        aList.set(i + 1, temp);
      }
    }
  }

  /**
   * Given an array of words, return a list of word pairs. A word pair consists
   * of
   * a word from the array paired with a word that appears later in the array.
   * 
   * <pre>
   * makeWordPairs({"one", "two", "three"}) would return
   * "onetwo", "onethree", "twothree"]
   * </pre>
   * 
   * @param words
   * @return
   */
  public static ArrayList<String> makeWordPairs(String[] words)
  {
    ArrayList<String> wordPairList = new ArrayList<>();
    // TODO: I used a nested pair of loops to solve this.
    for (int i = 0; i < words.length - 1; i++)
    {
      for (int j = i + 1; j < words.length; j++)
      {
        wordPairList.add(words[i] + words[j]);
      }
    }

    return wordPairList;
  }

}
