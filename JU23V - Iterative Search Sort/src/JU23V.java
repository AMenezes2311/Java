
/**
 * Only use AP official subset methods for ArrayLists, Strings, 1D arrays, etc.
 * These methods focus on Searching and Sorting Algorithm.
 * You may not use the Arrays or System class.
 * 
 * @author Andre Menezes
 * @version 1.7
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JU23V
{
  // Declare any constants up here.

  /**
   * Given an array, simply count the number of 42's you find in the array.
   * Related to: sequential search
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
  public static int warmUpCount42s(int[] arr)
  {
    // TODO: Need to complete.
    // Hint: You can use a FOR EACH loop here.
    int total = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == 42)
      {
        total++;
      }
    }
    return total;
  }

  /**
   * Given a 1D array of ints, create a List of all values that exist before the
   * value of 42. Related to: sequential search
   * 
   * <pre>
   * PRECONDITION: the arr array will have a 42 value element.
   * </pre>
   * 
   * @param arr
   * @return
   */
  public static List<Integer> warmUpGetAllBefore42(int[] arr)
  {
    List<Integer> answer = new ArrayList<Integer>();
    // TODO: Need to complete.
    int i = 0;
    while (arr[i] != 42)
    {
      answer.add(arr[i]);
      i++;
    }
    return answer;
  }

  /**
   * Binary search requires the collection to be sorted in advance. Write code
   * that will tell you how fast binary search is compared to sequential search
   * is if you give the parameter as the number of elements in the collection.
   * (note: you will have to use Math.log10 and use the change of base formula
   * to get it to log2. If you have not taken Algebra 2, then ask me)
   * 
   * <pre>
   * binarySearchComparison(10000)
   * If you have 10000 items in your collection,
   * it will take at most 13 comparisons
   * to find an element using the Binary Search algorithm.
   * However, it will take at most 10000 comparisons
   * to find an element using the Sequential Search algorithm.
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String binarySearchComparison(int lengthOfArray)
  {
    int binaryComparison =
      (int) Math.floor(Math.log10(lengthOfArray) / Math.log10(2));
    int sequentialComparison = lengthOfArray;
    String response =
      "If you have " + lengthOfArray
        + " items in your collection,\nit will take at most " + binaryComparison
        + " comparisons\nto find an element using the Binary Search algorithm.\nHowever, it will take at most "
        + sequentialComparison
        + " comparisons\nto find an element using the Sequential Search algorithm.";
    if (binaryComparison == 1)
    {
      response =
        "If you have " + lengthOfArray
          + " items in your collection,\nit will take at most "
          + binaryComparison
          + " comparisons\nto find an element using the Binary Search algorithm.\nHowever, it will take at most "
          + sequentialComparison
          + " comparisons\nto find an element using the Sequential Search algorithm.";
      return response;
    }

    return response;
  }

  /**
   * Given an array, and two locations, you will swap the values of those two
   * locations. Note: the locations x, and y could be bogus. Related to:
   * selection sort.
   * 
   * @param arr
   * @param x
   * @param y
   */
  public static void swapEmIn1DArray(int[] arr, int x, int y)
  {
    // TODO: Need to complete.
    if (x < arr.length && y < arr.length)
    {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }
  }

  /**
   * Given an List, and two locations, you will swap the values of those two
   * locations. Note: the locations x, and y could be bogus. Related to:
   * selection sort.
   * 
   * @param arr
   * @param x
   * @param y
   */
  public static void swapEmInArrayList(List<Integer> arr, int x, int y)
  {
    // TODO: Need to complete.
    if (x < arr.size() && y < arr.size() && x >= 0 && y >= 0)
    {
      int temp = arr.get(x);
      arr.set(x, arr.get(y));
      arr.set(y, temp);
    }
  }

  /**
   * Hunts for the location of the smallest value in the array. Related to:
   * sequential search
   * 
   * <pre>
   * arr = {8, 3, 10, 5}
   * selectSmallest(arr) -> 1
   * </pre>
   * 
   * @param arr
   * @return
   */
  public static int selectSmallest(int[] arr)
  {
    // TODO: Need to complete.
    int smallest = arr[0];
    int index = 0;

    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] < smallest)
      {
        smallest = arr[i];
        index = i;
      }
    }
    return index;
  }

  /**
   * Given an array, find the VALUE of the largest element in the array. Related
   * to: sequential search
   * 
   * @param arr
   * @return
   */
  public static String selectLargest(int[] arr)
  {
    // TODO: Need to complete.
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

    return "For the array " + Arrays.toString(arr) + ", the largest value "
      + largest + " can be found at index " + index;
  }

  /**
   * You are given an array where all values before itemLocation are sorted in
   * increasing order. Your objective is to find the location before
   * itemLocation where the value should be inserted at. Related to: insertion
   * sort
   * 
   * <pre>
   * For example:
   * if arr[] is the array 
   * {3, 8, 10, 25, 7, 2, 100, 50, 49}
   * findCorrectInsertionLocation(arr, 4) -> 1
   * </pre>
   */
  public static int findCorrectInsertionLocation(int[] arr, int itemLocation)
  {
    // TODO: Need to complete.
    int location = 0;

    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] < arr[itemLocation])
      {
        location = i + 1;
      }
    }

    return location;
  }

  /**
   * You are given an array where all values before itemLocation are sorted in
   * increasing order. Your objective is to insert the value at itemLocation
   * leaving the rest of the array after itemLocation in the original order.
   * Related to: insertion sort
   * 
   * <pre>
   * For example:
   * if arr[] is the array 
   * {3, 8, 10, 25, 7, 2, 100, 50, 49}
   * then after the call
   * insertValueInOrder(arr, 4);
   * the arr would be mutated so that it now looks like
   * {3, 7, 8, 10, 25, 2, 100, 50, 49}
   * </pre>
   * 
   * @param arr
   */
  public static void insertValueInOrder(int[] arr, int itemLocation)
  {
    int location = 0;
    for (int i = 1; i < arr.length - 1; i++)
    {
      if (arr[i] < arr[itemLocation])
      {
        location = i + 1;
      }
    }
    int sub = arr[location];
    int num = arr[itemLocation];

    for (int i = 0; i < arr.length; i++)
    {
      if (i == location)
      {
        arr[i] = num;
      }
      else if (i == itemLocation)
      {
        arr[i] = sub;
      }
    }
  }

  /**
   * This method returns the middle value of an integer array. Related to:
   * binary search
   * 
   * <pre>
   * if arr = {53, 18, 99}
   * getMiddleValue(arr) -> 18
   * if arr = {10, 3, 5, 50}
   * getMiddleValue(arr) -> 3
   * </pre>
   * 
   * @param arr
   * @return
   */
  public static int getMiddleValue(int[] arr)
  {
    // TODO: Need to complete.
    if (arr.length % 2 != 0)
      return arr[(arr.length / 2)];
    else
      return arr[(arr.length / 2) - 1];

  }

  /**
   * Checks to see if the String array is sorted in ascending alphabetical
   * order. Related to: binary search or any sort
   * 
   * @param arr
   *          != null
   * @return
   */
  public static boolean isSortedInAscendingOrder(String[] arr)
  {
    // TODO: Need to complete.
    boolean sorted = true;
    for (int i = 0; i < arr.length; i++)
    {
      for (int j = i + 1; j < arr.length; j++)
      {
        if (arr[i].compareTo(arr[j]) > 0)
        {
          sorted = false;
        }
      }
    }
    return sorted;

  }

}