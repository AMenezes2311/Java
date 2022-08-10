
/**
 * Do not upload this file.
 * 
 * @version 2.0
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU23VTest
{

  @Rule
  public Timeout globalTimeout = Timeout.seconds(3);

  @Test
  public void test01WarmUpCount42s1()
  {
    int[] numbers = {9, 42, 42, 42, 42, 8};
    assertEquals(4, JU23V.warmUpCount42s(numbers));

    List<String> list = new ArrayList<String>();
    list.add("P");
    list.add("Q");
    list.add("R");
    list.set(2, "s");
    list.add(2, "T");
    list.add("u");
    System.out.println(list);
  }

  @Test
  public void test01WarmUpCount42s2()
  {
    int[] numbers = {42, 0, 0, 42, 1};
    assertEquals(2, JU23V.warmUpCount42s(numbers));
  }

  @Test
  public void test02WarmUpGetAllBefore42a()
  {
    int[] numbers = {8, 1, 5, 42, 1};
    assertEquals("[8, 1, 5]", JU23V.warmUpGetAllBefore42(numbers).toString());

  }

  @Test
  public void test02WarmUpGetAllBefore42b()
  {
    int[] numbers = {42, 9, 2, 0, 42};
    assertEquals("[]", JU23V.warmUpGetAllBefore42(numbers).toString());
    int[] check = {2, 42};
    assertEquals("[2]", JU23V.warmUpGetAllBefore42(check).toString());

  }

  @Test
  public void test02WarmUpGetAllBefore42c()
  {
    int[] numbers = {8, 9, -3, -10, 19, 0, 4, 2, 42, 8, 1, 3, 99, 4};
    assertEquals("[8, 9, -3, -10, 19, 0, 4, 2]",
                 JU23V.warmUpGetAllBefore42(numbers).toString());

  }

  @Test
  public void test03BinarySearchComparison1()
  {
    assertEquals("If you have 2 items in your collection,\n"
      + "it will take at most 1 comparisons\n"
      + "to find an element using the Binary Search algorithm.\n"
      + "However, it will take at most 2 comparisons\n"
      + "to find an element using the Sequential Search algorithm.",
                 JU23V.binarySearchComparison(2));
  }

  @Test
  public void test03BinarySearchComparison2()
  {
    assertEquals("If you have 200 items in your collection,\n"
      + "it will take at most 7 comparisons\n"
      + "to find an element using the Binary Search algorithm.\n"
      + "However, it will take at most 200 comparisons\n"
      + "to find an element using the Sequential Search algorithm.",
                 JU23V.binarySearchComparison(200));
  }

  @Test
  public void test03BinarySearchComparison3()
  {
    assertEquals("If you have 2500 items in your collection,\n"
      + "it will take at most 11 comparisons\n"
      + "to find an element using the Binary Search algorithm.\n"
      + "However, it will take at most 2500 comparisons\n"
      + "to find an element using the Sequential Search algorithm.",
                 JU23V.binarySearchComparison(2500));
  }

  @Test
  public void test03BinarySearchComparison4()
  {
    assertEquals("If you have 10000 items in your collection,\n"
      + "it will take at most 13 comparisons\n"
      + "to find an element using the Binary Search algorithm.\n"
      + "However, it will take at most 10000 comparisons\n"
      + "to find an element using the Sequential Search algorithm.",
                 JU23V.binarySearchComparison(10000));
  }

  @Test
  public void test04SwapEmIn1DArray1()
  {
    int[] original = {20, 10, 5, 90, 7};
    JU23V.swapEmIn1DArray(original, 0, 2);
    assertEquals("[5, 10, 20, 90, 7]", Arrays.toString(original));
  }

  @Test
  public void test04SwapEmIn1DArray2()
  {
    int[] original = {1, 2, 3, 19, 30, 50};
    JU23V.swapEmIn1DArray(original, 5, 6);
    assertEquals("[1, 2, 3, 19, 30, 50]", Arrays.toString(original));
    int[] check = {5, 2};
    JU23V.swapEmIn1DArray(check, 0, 1);
    assertEquals("[2, 5]", Arrays.toString(check));
  }

  @Test
  public void test04SwapEmIn1DArray3()
  {
    int[] original = {100, 2, 3, 19, 30, 50, 88, 66};
    JU23V.swapEmIn1DArray(original, 3, 6);
    assertEquals("[100, 2, 3, 88, 30, 50, 19, 66]", Arrays.toString(original));
  }

  @Test
  public void test05SwapEmInArrayList1()
  {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(20);
    al.add(10);
    al.add(5);
    al.add(90);
    al.add(7);
    JU23V.swapEmInArrayList(al, 1, 3);
    assertEquals("[20, 90, 5, 10, 7]", al.toString());
  }

  @Test
  public void test05SwapEmInArrayList2()
  {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(20);
    al.add(10);
    al.add(5);
    al.add(90);
    al.add(7);
    JU23V.swapEmInArrayList(al, 3, 6);
    assertEquals("[20, 10, 5, 90, 7]", al.toString());
    ArrayList<Integer> check = new ArrayList<Integer>();
    check.add(20);
    check.add(10);
    JU23V.swapEmInArrayList(check, 0, 1);
    assertEquals("[10, 20]", check.toString());
  }

  @Test
  public void test06SwapEmInArrayList3()
  {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(20);
    al.add(10);
    al.add(5);

    JU23V.swapEmInArrayList(al, -2, 1);
    assertEquals("[20, 10, 5]", al.toString());
    ArrayList<Integer> check = new ArrayList<Integer>();
    check.add(20);
    check.add(10);
    JU23V.swapEmInArrayList(check, 0, 1);
    assertEquals("[10, 20]", check.toString());
  }

  @Test
  public void test06SwapEmInArrayList4()
  {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(20);
    al.add(10);
    al.add(5);

    JU23V.swapEmInArrayList(al, 0, 1);
    assertEquals("[10, 20, 5]", al.toString());
  }

  @Test
  public void test06SwapEmInArrayList5()
  {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    JU23V.swapEmInArrayList(al, 3, 0);
    assertEquals("[4, 2, 3, 1]", al.toString());
  }

  @Test
  public void test06SwapEmInArrayList6()
  {
    ArrayList<Integer> al = new ArrayList<Integer>();
    al.add(233);
    al.add(44);
    al.add(88);
    al.add(-987);
    al.add(2);
    al.add(32);
    al.add(4);
    JU23V.swapEmInArrayList(al, 1, 4);
    assertEquals("[233, 2, 88, -987, 44, 32, 4]", al.toString());
  }

  @Test
  public void test07SelectSmallest1()
  {
    int[] arr = {20, 10, 5, 90, 7};
    assertEquals(2, JU23V.selectSmallest(arr));
  }

  @Test
  public void test07SelectSmallest2()
  {
    int[] arr = {5};
    assertEquals(0, JU23V.selectSmallest(arr));
  }

  @Test
  public void test07SelectSmallest3()
  {
    int[] arr = {5, 3, 2, 1, -4, -9, -100};
    assertEquals(6, JU23V.selectSmallest(arr));
  }

  @Test
  public void test08SelectLargest1()
  {
    int[] arr = {20, 10, 5, 90, 7};
    assertEquals("For the array [20, 10, 5, 90, 7], the largest value 90 can be found at index 3",
                 JU23V.selectLargest(arr));
  }

  @Test
  public void test08SelectLargest2()
  {
    int[] arr = {5, 3, 2, 1, -4, -9, -100};
    assertEquals("For the array [5, 3, 2, 1, -4, -9, -100], the largest value 5 can be found at index 0",
                 JU23V.selectLargest(arr));
  }

  @Test
  public void test08SelectLargest3()
  {
    int[] arr = {5, 3, 2, 43, -4, -9, -100};
    assertEquals("For the array [5, 3, 2, 43, -4, -9, -100], the largest value 43 can be found at index 3",
                 JU23V.selectLargest(arr));
  }

  @Test
  public void test08SelectLargest4()
  {
    int[] arr = {43};
    assertEquals("For the array [43], the largest value 43 can be found at index 0",
                 JU23V.selectLargest(arr));
  }

  @Test
  public void test08SelectLargest5()
  {
    int[] arr = {12, 4, 99, 100, 8, 102};
    assertEquals("For the array [12, 4, 99, 100, 8, 102], the largest value 102 can be found at index 5",
                 JU23V.selectLargest(arr));
  }

  @Test
  public void test09FindCorrectInsertionLocation1()
  {
    int[] arr = {4, 10, 16, 19, 20, -2};
    assertEquals(0, JU23V.findCorrectInsertionLocation(arr, 5));
  }

  @Test
  public void test09FindCorrectInsertionLocation2()
  {
    int[] arr = {4, 10, 16, 19, 20, 25};
    assertEquals(5, JU23V.findCorrectInsertionLocation(arr, arr.length - 1));
  }

  @Test
  public void test09FindCorrectInsertionLocation3()
  {
    int[] arr = {4, 10, 16, 19, 20, 25};
    assertEquals(0, JU23V.findCorrectInsertionLocation(arr, 0));
  }

  @Test
  public void test09FindCorrectInsertionLocation4()
  {
    int[] arr = {4, 10, 16, 1, 19, 20, 25};
    assertEquals(0, JU23V.findCorrectInsertionLocation(arr, 3));
  }

  @Test
  public void test09FindCorrectInsertionLocation5()
  {
    int[] arr = {4, 10, 16, 17, 60, 21, 100, 25};
    assertEquals(4, JU23V.findCorrectInsertionLocation(arr, 5));
  }

  @Test
  public void test09FindCorrectInsertionLocation6()
  {
    int[] arr = {4, 10, 16, 19, 20, 18};
    assertEquals(3, JU23V.findCorrectInsertionLocation(arr, arr.length - 1));
  }

  @Test
  public void test10InsertInOrder1()
  {
    int[] arr = {3, 8, 10, 25, 7, 2, 100, 50, 49};
    JU23V.insertValueInOrder(arr, 4);
    assertEquals("[3, 7, 8, 10, 25, 2, 100, 50, 49]", Arrays.toString(arr));

  }

  @Test
  public void test10InsertInOrder2()
  {
    int[] arr = {4, 10, 16, 19, 20, -2};
    JU23V.insertValueInOrder(arr, 5);
    assertEquals("[-2, 4, 10, 16, 19, 20]", Arrays.toString(arr));
  }

  @Test
  public void test10InsertInOrder3()
  {
    int[] arr = {4};
    JU23V.insertValueInOrder(arr, 0);
    assertEquals("[4]", Arrays.toString(arr));
    int[] thor = {4, 1};
    JU23V.insertValueInOrder(thor, 1);
    assertEquals("[1, 4]", Arrays.toString(thor));
  }

  @Test
  public void test10InsertInOrder4()
  {
    int[] thor = {4, 1};
    JU23V.insertValueInOrder(thor, 1);
    assertEquals("[1, 4]", Arrays.toString(thor));
  }

  @Test
  public void test10InsertInOrder5()
  {
    int[] thor = {3, 8};
    JU23V.insertValueInOrder(thor, 1);
    assertEquals("[3, 8]", Arrays.toString(thor));
    int[] check = {4, 1};
    JU23V.insertValueInOrder(check, 1);
    assertEquals("[1, 4]", Arrays.toString(check));
  }

  @Test
  public void test10InsertInOrder6()
  {
    int[] hawkeye = {1, 3, 5, 6, 7, 8, 10, 4, 12, 15, 99, 2000, 3000};
    JU23V.insertValueInOrder(hawkeye, 7);
    assertEquals("[1, 3, 4, 5, 6, 7, 8, 10, 12, 15, 99, 2000, 3000]",
                 Arrays.toString(hawkeye));
  }

  @Test
  public void test10InsertInOrder7()
  {
    int[] arr = {4, 10, 16, 19, 20, 25};
    JU23V.insertValueInOrder(arr, arr.length - 1);
    assertEquals("[4, 10, 16, 19, 20, 25]", Arrays.toString(arr));
    int[] check = {4, 1};
    JU23V.insertValueInOrder(check, 1);
    assertEquals("[1, 4]", Arrays.toString(check));
  }

  @Test
  public void test10InsertInOrder8()
  {
    int[] arr = {4, 10, 16, 19, 18, 20, 3, -42};
    JU23V.insertValueInOrder(arr, 4);
    assertEquals("[4, 10, 16, 18, 19, 20, 3, -42]", Arrays.toString(arr));
  }

  @Test
  public void test11GetMiddleValue1()
  {
    int[] arr = {1, 4, 8};
    assertEquals(4, JU23V.getMiddleValue(arr));
  }

  @Test
  public void test11GetMiddleValue2()
  {
    int[] arr = {1, 4};
    assertEquals(1, JU23V.getMiddleValue(arr));
  }

  @Test
  public void test11GetMiddleValue3()
  {
    int[] arr = {4, 10, 16, 19, 20, 25};
    assertEquals(16, JU23V.getMiddleValue(arr));
  }

  @Test
  public void test12IsSortedInAscendingOrder1()
  {
    String[] arr = {"Apple", "Zebra"};
    assertTrue(JU23V.isSortedInAscendingOrder(arr));
    String[] ugh = {"Apple", "Aardvark"};
    assertFalse(JU23V.isSortedInAscendingOrder(ugh));
  }

  @Test
  public void test12IsSortedInAscendingOrder2()
  {
    String[] arr = {"Apple", "Zebra", "Friend"};
    assertFalse(JU23V.isSortedInAscendingOrder(arr));
    String[] ugh = {"Apple", "Arizona"};
    assertTrue(JU23V.isSortedInAscendingOrder(ugh));
  }

  @Test
  public void test12IsSortedInAscendingOrder3()
  {
    String[] arr = {"Apple"};
    assertTrue(JU23V.isSortedInAscendingOrder(arr));
    String[] matey = {"Ball", "Alaska"};
    assertFalse(JU23V.isSortedInAscendingOrder(matey));
  }

}