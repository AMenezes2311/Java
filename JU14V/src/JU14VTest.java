/**
 * Make no changes to this file.
 * Do not submit this file to the dropbox.
 * Press play on this file.
 * to run these tests.
 * @version 2.0
 */
import static org.junit.Assert.*;
import org.junit.Test;
//Needed to protect against infinite loops.
import org.junit.rules.Timeout;
import org.junit.Rule;
//Used to keep tests in order
import org.junit.FixMethodOrder;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU14VTest
{
  //Snazzy new feature of Junit that
  //guards against students who write
  //infinite loops to solve problems.
  @Rule
  public Timeout globalTimeout = Timeout.seconds(2);

  @Test
  public void test01DisplayStarsOnOneLine1()
  {
    assertEquals("************", JU14V.displayStarsOnOneLine(12));
    assertEquals("****", JU14V.displayStarsOnOneLine(4));
  }

  @Test
  public void test02SimpleLoop()
  {
    assertEquals("[1,2,3,4]", JU14V.simpleLoop(4));
    assertEquals("[1,2,3,4,5,6,7,8,9,10]", JU14V.simpleLoop(10));
    assertEquals(
      "[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32]",
      JU14V.simpleLoop(32));
  }

  @Test
  public void test03BasicCountUpBy7s1()
  {
    assertEquals("[71421]", JU14V.basicCountUpBy7s(21));
    assertEquals("[714]", JU14V.basicCountUpBy7s(20));
  }

  @Test
  public void test03BasicCountUpBy7s2()
  {
    assertEquals("[714212835424956637077849198]", JU14V.basicCountUpBy7s(100));
    assertEquals(
      "[714212835424956637077849198105112119126133140147154161168175182189196]",
      JU14V.basicCountUpBy7s(200));
  }

  @Test
  public void test04FlexibleLoop1()
  {
    assertEquals("[5,6,7,8,]", JU14V.flexibleLoop(5, 8, 1));
  }

  @Test
  public void test04FlexibleLoop2()
  {
    assertEquals("[3,5,7,9,11,]", JU14V.flexibleLoop(3, 12, 2));
  }

  @Test
  public void test04FlexibleLoop3()
  {
    assertEquals("[9,8,7,6,5,4,3,2,1,0,-1,-2,-3,]",
      JU14V.flexibleLoop(9, -3, -1));
  }

  @Test
  public void test04FlexibleLoop4()
  {
    assertEquals("[10,7,4,1,]", JU14V.flexibleLoop(10, 0, -3));
  }

  @Test
  public void test04FlexibleLoop5()
  {
    assertEquals("[-8,-3,2,7,12,17,22,27,32,]", JU14V.flexibleLoop(-8, 34, 5));
  }

  @Test
  public void test04FlexibleLoop6()
  {
    assertEquals("[50,42,34,26,18,10,2,-6,-14,-22,-30,-38,]",
      JU14V.flexibleLoop(50, -45, -8));
  }

  @Test
  public void test05DivisibleBy1()
  {
    assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 ",
      JU14V.divisibleBy(3, 16));
    assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 17 [18] 19 ",
      JU14V.divisibleBy(3, 19));
    assertEquals(
      "1 2 3 4 [5] 6 7 8 9 [10] 11 12 13 14 [15] 16 17 18 19 [20] 21 22 23 24 [25] ",
      JU14V.divisibleBy(5, 25));
  }

  @Test
  public void test06NasaCountDown1()
  {
    String actual1 = JU14V.nasaCountDown(6);
    assertEquals("T-Minus 6 seconds:6...5...4...3...2...1...BLAST OFF",
      actual1);
    String actual2 = JU14V.nasaCountDown(10);
    assertEquals(
      "T-Minus 10 seconds:10...9...8...7...6...5...4...3...2...1...BLAST OFF",
      actual2);

  }

  @Test
  public void test07SumThemUp4()
  {
    assertEquals("2 + 3 + 4 + 5 = 14", JU14V.sumThemUp(2, 5));
    assertEquals("7 + 8 + 9 + 10 + 11 + 12 + 13 = 70", JU14V.sumThemUp(7, 13));
  }

  @Test
  public void test08BuildTChart3()
  {
    assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
      + "-----------------\n" + "-5   -13\n" + "-4   -10\n" + "-3   -7\n"
      + "-2   -4\n" + "-1   -1\n" + "0   2\n" + "1   5\n" + "2   8\n"
      + "3   11\n" + "4   14\n" + "5   17\n" + "-----------------\n" + "",
      JU14V.buildTChart(-5, 5));
  }

  @Test
  public void test08BuildTChart4()
  {
    assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
      + "-----------------\n" + "0   2\n" + "1   5\n" + "2   8\n" + "3   11\n"
      + "-----------------\n" + "", JU14V.buildTChart(0, 3));
  }


}
