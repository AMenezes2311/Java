
/**
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 * 
 * @version 4.0
 */
import static org.junit.Assert.assertEquals;

// Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU12VTest
{

  @Test
  public void test01xyInfo1()
  {
    assertEquals("(0, 0) is the origin.", JU12V.xyInfo(0, 0));
  }

  @Test
  public void test01xyInfo2()
  {
    assertEquals("(4, 0) is on the x-axis.", JU12V.xyInfo(4, 0));
    assertEquals("(0, -3) is on the y-axis.", JU12V.xyInfo(0, -3));
  }

  @Test
  public void test01xyInfo3()
  {
    assertEquals("(6, 8) is in the first quadrant.", JU12V.xyInfo(6, 8));
    assertEquals("(3, 3) is in the first quadrant.", JU12V.xyInfo(3, 3));
    assertEquals("(-2, 3) is in the second quadrant.", JU12V.xyInfo(-2, 3));
    assertEquals("(-11, 25) is in the second quadrant.", JU12V.xyInfo(-11, 25));
  }

  @Test
  public void test01xyInfo4()
  {
    assertEquals("(-1, -7) is in the third quadrant.", JU12V.xyInfo(-1, -7));
    assertEquals("(-8, -7) is in the third quadrant.", JU12V.xyInfo(-8, -7));
    assertEquals("(3, -7) is in the fourth quadrant.", JU12V.xyInfo(3, -7));
    assertEquals("(5, -5) is in the fourth quadrant.", JU12V.xyInfo(5, -5));
  }

  @Test
  public void test02CostOfShipping1()
  {
    assertEquals("The shipping cost is $3.5", JU12V.costOfShipping(0.75));
    assertEquals("The shipping cost is $3.5", JU12V.costOfShipping(1.0));
  }

  @Test
  public void test02CostOfShipping2()
  {
    assertEquals("The shipping cost is $5.5", JU12V.costOfShipping(1.22));
    assertEquals("The shipping cost is $5.5", JU12V.costOfShipping(3.0));
  }

  @Test
  public void test02CostOfShipping3()
  {
    assertEquals("The shipping cost is $8.5", JU12V.costOfShipping(3.02));
    assertEquals("The shipping cost is $8.5", JU12V.costOfShipping(9.5));
    assertEquals("The shipping cost is $8.5", JU12V.costOfShipping(10));
  }

  @Test
  public void test02CostOfShipping4()
  {
    assertEquals("The shipping cost is $10.5", JU12V.costOfShipping(10.3));
    assertEquals("The shipping cost is $10.5", JU12V.costOfShipping(15.2));
    assertEquals("The shipping cost is $10.5", JU12V.costOfShipping(20));
  }

  @Test
  public void test02CostOfShipping5()
  {
    assertEquals("The package cannot be shipped", JU12V.costOfShipping(20.1));
    assertEquals("The package cannot be shipped", JU12V.costOfShipping(30));
  }

  @Test
  public void test03inNumericalOrder1()
  {
    assertEquals("3, 5, and 19 are in numerical order.",
                 JU12V.inNumericalOrder(3, 5, 19));
    assertEquals("3, 2, and 3 are NOT in numerical order.",
                 JU12V.inNumericalOrder(3, 2, 3));
  }

  @Test
  public void test03inNumericalOrder2()
  {
    assertEquals("5, 5, and 5 are in numerical order.",
                 JU12V.inNumericalOrder(5, 5, 5));
    assertEquals("5, 5, and 3 are NOT in numerical order.",
                 JU12V.inNumericalOrder(5, 5, 3));
  }

  @Test
  public void test03inNumericalOrder3()
  {
    assertEquals("6, 10, and 12 are in numerical order.",
                 JU12V.inNumericalOrder(6, 10, 12));
    assertEquals("8, 5, and 10 are NOT in numerical order.",
                 JU12V.inNumericalOrder(8, 5, 10));
  }

  @Test
  public void test04weirdRoundedSum1()
  {
    assertEquals("20", JU12V.weirdRoundSum(8, 7, 6) + "");
  }

  @Test
  public void test04weirdRoundedSum2()
  {
    assertEquals("150", JU12V.weirdRoundSum(50, 51, 49) + "");
  }

  @Test
  public void test04weirdRoundedSum3()
  {
    assertEquals("580", JU12V.weirdRoundSum(127, 126, 328) + "");
    assertEquals("90", JU12V.weirdRoundSum(28, 27, 29) + "");
  }

  @Test
  public void test04weirdRoundedSum4()
  {
    assertEquals("170", JU12V.weirdRoundSum(55, 56, 74) + "");
    assertEquals("120", JU12V.weirdRoundSum(23, 11, 88) + "");
  }

  @Test
  public void test04weirdRoundedSum5()
  {
    assertEquals("0", JU12V.weirdRoundSum(0, 0, 1) + "");
    assertEquals("10", JU12V.weirdRoundSum(9, 4, 4) + "");
  }

  @Test
  public void test05NumExpander1()
  {
    assertEquals("914 = 9 X 100 + 1 X 10 + 4 X 1", JU12V.numExpander(914));
  }

  @Test
  public void test05NumExpander2()
  {
    assertEquals("528 = 5 X 100 + 2 X 10 + 8 X 1", JU12V.numExpander(528));
  }

  @Test
  public void test05NumExpander3()
  {
    assertEquals("652 = 6 X 100 + 5 X 10 + 2 X 1", JU12V.numExpander(652));
  }

  @Test
  public void test06RoundToNearestOnesPlace1()
  {
    assertEquals("8.9 rounded to the nearest one's place is 9",
                 JU12V.roundToNearestOnesPlace(8.9));
  }

  @Test
  public void test06RoundToNearestOnesPlace2()
  {
    assertEquals("-8.9 rounded to the nearest one's place is -9",
                 JU12V.roundToNearestOnesPlace(-8.9));
  }

  @Test
  public void test06RoundToNearestOnesPlace3()
  {
    assertEquals("59.4 rounded to the nearest one's place is 59",
                 JU12V.roundToNearestOnesPlace(59.4));
  }

  @Test
  public void test06RoundToNearestOnesPlace4()
  {
    assertEquals("59.5 rounded to the nearest one's place is 60",
                 JU12V.roundToNearestOnesPlace(59.5));
  }

  @Test
  public void test06RoundToNearestOnesPlace5()
  {
    assertEquals("-59.5 rounded to the nearest one's place is -60",
                 JU12V.roundToNearestOnesPlace(-59.5));
  }

  @Test
  public void test06RoundToNearestOnesPlace6()
  {
    assertEquals("-8.5 rounded to the nearest one's place is -9",
                 JU12V.roundToNearestOnesPlace(-8.5));
  }

  @Test
  public void test07GetQuadraticRoots1()
  {
    assertEquals("The equation has two roots 0.5 and -3.0",
                 JU12V.getQuadraticRoots(2, 5, -3));
  }

  @Test
  public void test07GetQuadraticRoots2()
  {
    assertEquals("The equation has one root -1.0",
                 JU12V.getQuadraticRoots(1, 2.0, 1));
  }

  @Test
  public void test07GetQuadraticRoots3()
  {
    assertEquals("The equation has two roots 1.0 and -4.0",
                 JU12V.getQuadraticRoots(1, 3, -4));
  }

  @Test
  public void test07GetQuadraticRoots4()
  {
    assertEquals("The equation has two roots 0.4 and 0.25",
                 JU12V.getQuadraticRoots(20, -13, 2));
  }

  @Test
  public void test07GetQuadraticRoots5()
  {
    assertEquals("The equation has one root -2.0",
                 JU12V.getQuadraticRoots(2, 8, 8));
  }

  @Test
  public void test07GetQuadraticRoots6()
  {
    assertEquals("The equation has one root -0.0",
                 JU12V.getQuadraticRoots(1, 0, 0));
  }

  @Test
  public void test07GetQuadraticRoots7()
  {
    assertEquals("The equation has no real roots",
                 JU12V.getQuadraticRoots(1, 4, 5));
  }

  @Test
  public void test07GetQuadraticRoots8()
  {
    assertEquals("The equation has no real roots",
                 JU12V.getQuadraticRoots(1, -3, 10));
  }
}
