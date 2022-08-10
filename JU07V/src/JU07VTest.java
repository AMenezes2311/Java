
/**
 * Hello.  You will press play on this file once, then 
 * you can press PLAY on the JU07V.java file anytime after that.
 * You may look at the test cases below, but do not change them.
 * DO NOT TURN THIS FILE IN.  SUBMIT JU07V.java to the dropbox.
 * 
 * @Version 4.0 WindChill tests fixed
 */
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU07VTest
{

  @Test
  public void test00DecreaseByOne1()
  {
    assertEquals(4, JU07V.decreaseByOne(5));
  }
  
  @Test
  public void test00DecreaseByOne2()
  {
    assertEquals(-10, JU07V.decreaseByOne(-9));
  }
  
  
  
  @Test
  public void test01GetAverage1()
  {
    assertEquals(1.5, JU07V.getAverage(1, 2), 0.001);
  }

  @Test
  public void test01GetAverage2()
  {
    assertEquals(3.5, JU07V.getAverage(6, 1), 0.001);
  }

  @Test
  public void test01GetAverage3()
  {
    assertEquals(-1.0, JU07V.getAverage(3, -5), 0.001);
  }
  
  @Test
  public void test02roundPositiveToNearestInteger1()
  {
    assertEquals(6, JU07V.roundPositiveToNearestInteger(5.8));
  }
  
  @Test
  public void test02roundPositiveToNearestInteger2()
  {
    assertEquals(6, JU07V.roundPositiveToNearestInteger(5.5));
  }
  
  @Test
  public void test03roundNegativeToNearestInteger1()
  {
    assertEquals(-5, JU07V.roundNegativeToNearestInteger(-5.49));
  }
  
  @Test
  public void test03roundNegativeToNearestInteger2()
  {
    assertEquals(-6, JU07V.roundNegativeToNearestInteger(-5.8));
  }
  
  @Test
  public void test04findRemainder1()
  {
    assertEquals(1, JU07V.findRemainder(17, 4));
  }
  
  @Test
  public void test04findRemainder2()
  {
    assertEquals(3, JU07V.findRemainder(3, 5));
  }
  
  @Test
  public void test04findRemainder3()
  {
    assertEquals(5, JU07V.findRemainder(21,8));
  }



}