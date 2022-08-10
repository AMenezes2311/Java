/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class RecursiveBinarySearch
{
  // TODO: Declare a static int variable called mCount and initialize it to
  // zero.
  static int mCount = 0;

  public static String binarySearch(int[] list, int key)
  {
    int low = 0;
    int high = list.length - 1;
    return binarySearch(list, key, low, high);
  }

  private static String binarySearch(int[] list, int key, int low, int high)
  {
    // TODO: bump up the mCount by one.
    mCount++;
    // TODO: Write a statement that displays the mCount, and the formal
    // parameters of key, low, and high to the console.

    if (low > high) // The list has been exhausted without a match
      return "\n Method Call #" + mCount + " key= " + key + " low= " + low
        + " high= " + high + "\n" + (-low - 1);

    int mid = (low + high) / 2;
    if (key < list[mid])
      return "\n Method Call #" + mCount + " key= " + key + " low= " + low
        + " high= " + high + binarySearch(list, key, low, mid - 1);
    else if (key == list[mid])
      return "\n Method Call #" + mCount + " key= " + key + " low= " + low
        + " high= " + high + "\n" + mid;
    else
      return "\n Method Call #" + mCount + " key= " + key + " low= " + low
        + " high= " + high + binarySearch(list, key, mid + 1, high);
  }

  public static void main(String[] args)
  {
    // Make no changes to the main method.
    int[] list = {3, 5, 7, 8, 12, 17, 24, 29};
    mCount = 0;
    System.out.println(binarySearch(list, 7));
    mCount = 0;
    System.out.println(binarySearch(list, 0));
  }
}