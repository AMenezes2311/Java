/**
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 */
import static org.junit.Assert.*;
import org.junit.Test;

//Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU09VTest
{
  
  @Test
  public void test01squareRootSentence1()
  {
    String expected = "The square root of 25 is 5.0";
    String actual = JU09V.squareRootSentence(25);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test01squareRootSentence2()
  {
    String expected = "The square root of 100 is 10.0";
    String actual = JU09V.squareRootSentence(100);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test01squareRootSentence3()
  {
    String expected = "The square root of 30 is 5.477225575051661";
    String actual = JU09V.squareRootSentence(30);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test02exponentSentence1()
  {
    String expected = "3 ^ 5 == 243.0";
    String actual = JU09V.exponentSentence(3, 5);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test02exponentSentence2()
  {
    String expected = "5 ^ 3 == 125.0";
    String actual = JU09V.exponentSentence(5, 3);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test02exponentSentence3()
  {
    String expected = "10 ^ 4 == 10000.0";
    String actual = JU09V.exponentSentence(10, 4);
    assertEquals(expected, actual);
  }
  
  
  @Test
  public void test01Shout1()
  {
    assertEquals("Steve loves to shout the phrase \"Apple\"!", JU09V.shout("Steve", "Apple"));
  }
  
  @Test
  public void test01Shout2()
  {
    assertEquals("Ellen loves to shout the phrase \"Games and Fun\"!", JU09V.shout("Ellen", "Games and Fun"));
  }
  
  @Test
  public void test01Shout3()
  {
    assertEquals("SpongeBob loves to shout the phrase \"Patrick\"!", JU09V.shout("SpongeBob", "Patrick"));
  }
  
  @Test
  public void test02GetFilePath1()
  {
    assertEquals("D:\\Downloads\\fred.txt", JU09V.getFilePath("D", "Downloads", "fred.txt"));
  }
  
  @Test
  public void test02GetFilePath2()
  {
    assertEquals("C:\\Documents\\ace.mp3", JU09V.getFilePath("C", "Documents", "ace.mp3"));
  }
  
  @Test
  public void test02GetFilePath3()
  {
    assertEquals("B:\\Videos\\math.mp4", JU09V.getFilePath("B", "Videos", "math.mp4"));
  }
  
  @Test
  public void test03EpicSqrt1()
  {
    assertEquals("Square root of 25 is 5.0", JU09V.epicSqrt(25));
    assertEquals("Square root of -25 is 5.0i", JU09V.epicSqrt(-25));
  }
  
  @Test
  public void test03EpicSqrt2()
  {
    assertEquals("Square root of 9 is 3.0", JU09V.epicSqrt(9));
    assertEquals("Square root of -9 is 3.0i", JU09V.epicSqrt(-9));
  }
  
  @Test
  public void test03EpicSqrt3()
  {
    assertEquals("Square root of 100 is 10.0", JU09V.epicSqrt(100));  
    assertEquals("Square root of -100 is 10.0i", JU09V.epicSqrt(-100));  
  }
  

  
 
  
  @Test
  public void test06NoFirstLetterConcat1()
  {
    assertEquals("raceopper", JU09V.noFirstLetterConcat("Grace", "Hopper"));
  }
  
  @Test
  public void test06NoFirstLetterConcat2()
  {
    assertEquals("teveobs", JU09V.noFirstLetterConcat("Steve", "Jobs"));
  }
  
  @Test
  public void test06NoFirstLetterConcat3()
  {
    assertEquals("haggyoo", JU09V.noFirstLetterConcat("Shaggy", "Doo"));
  }
  
  @Test
  public void test07FindVowels1()
  {
    assertEquals(
      "The first position of a is 14.\nThe first position of e is 4.\nThe first position of i is 2.\nThe first position of o is 11.\nThe first position of u is 0.\n",
      JU09V.findVowels("university of arizona"));
  }

  @Test
  public void test07FindVowels2()
  {
    assertEquals(
      "The first position of a is -1.\nThe first position of e is 6.\nThe first position of i is 11.\nThe first position of o is 1.\nThe first position of u is 4.\n",
      JU09V.findVowels("computer science"));
  }

  @Test
  public void test07FindVowels3()
  {
    assertEquals(
      "The first position of a is 1.\nThe first position of e is 8.\nThe first position of i is -1.\nThe first position of o is 4.\nThe first position of u is -1.\n",
      JU09V.findVowels("canyon del oro"));
  }
  

  

  
}
