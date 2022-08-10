/**
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 * 
 * @version 3.0
 */
import static org.junit.Assert.*;
import org.junit.Test;

//Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU11VTest
{

  @Test
  public void test01PosZeroNeg1()
  {
    assertEquals("42 is positive.", JU11V.posZeroNeg(42));
  }

  @Test
  public void test01PosZeroNeg2()
  {
    assertEquals("-10 is negative.", JU11V.posZeroNeg(-10));
  }

  @Test
  public void test01PosZeroNeg3()
  {
    assertEquals("0 is zero.", JU11V.posZeroNeg(0));
    assertEquals("-4 is negative.", JU11V.posZeroNeg(-4));
    assertEquals("8 is positive.", JU11V.posZeroNeg(8));
  }

  @Test
  public void test02IsEvenOrOdd1()
  {
    assertEquals("100 is even.", JU11V.isEvenOrOdd(100));
  }

  @Test
  public void test02IsEvenOrOdd2()
  {
    assertEquals("67 is odd.", JU11V.isEvenOrOdd(67));
  }

  @Test
  public void test02IsEvenOrOdd3()
  {
    assertEquals("44 is even.", JU11V.isEvenOrOdd(44));
  }

  @Test
  public void test02IsEvenOrOdd4()
  {
    assertEquals("13 is odd.", JU11V.isEvenOrOdd(13));
  }

  @Test
  public void test03SimpleIf1()
  {
    assertEquals("HiEven", JU11V.simpleIf(4));
  }

  @Test
  public void test03SimpleIf2()
  {
    assertEquals("HiFiveAndEven", JU11V.simpleIf(30));
  }

  @Test
  public void test03SimpleIf3()
  {
    assertEquals("HiFiveAndEven", JU11V.simpleIf(100));
  }

  @Test
  public void test03SimpleIf4()
  {
    assertEquals("HiFive", JU11V.simpleIf(15));
  }

  @Test
  public void test03SimpleIf5()
  {
    assertEquals("Sorry", JU11V.simpleIf(81));
  }

  @Test
  public void test03SimpleIf6()
  {
    assertEquals("Sorry", JU11V.simpleIf(99));
  }

  @Test
  public void test04GetLetterGrade1()
  {
    assertEquals("A", JU11V.getLetterGrade(90));
  }

  @Test
  public void test04GetLetterGrade2()
  {
    assertEquals("B", JU11V.getLetterGrade(89));
  }

  @Test
  public void test04GetLetterGrade3()
  {
    assertEquals("B", JU11V.getLetterGrade(81));
  }

  @Test
  public void test04GetLetterGrade4()
  {
    assertEquals("C", JU11V.getLetterGrade(79));
    assertEquals("C", JU11V.getLetterGrade(70));
  }

  @Test
  public void test04GetLetterGrade5()
  {
    assertEquals("D", JU11V.getLetterGrade(69));
    assertEquals("D", JU11V.getLetterGrade(66));
    assertEquals("D", JU11V.getLetterGrade(60));
  }

  @Test
  public void test04GetLetterGrade6()
  {
    assertEquals("F", JU11V.getLetterGrade(3));
    assertEquals("F", JU11V.getLetterGrade(59));
    assertEquals("F", JU11V.getLetterGrade(55));
  }
  
  @Test
  public void test08InAlphabeticalOrder1()
  {
    assertEquals("apple, peach, and zebra are in alphabetical order.", JU11V.inAlphabeticalOrder("apple", "peach", "zebra"));
  }
  
  @Test
  public void test08InAlphabeticalOrder2()
  {
    assertEquals("pear, branch, and road are NOT in alphabetical order.", JU11V.inAlphabeticalOrder("pear", "branch", "road"));
  }
  
  @Test
  public void test08InAlphabeticalOrder3()
  {
    assertEquals("horse, house, and hzzz are in alphabetical order.", JU11V.inAlphabeticalOrder("horse", "house", "hzzz"));
  }
  
  @Test
  public void test08InAlphabeticalOrder4()
  {
    assertEquals("zoo, zip, and zzz are NOT in alphabetical order.", JU11V.inAlphabeticalOrder("zoo", "zip", "zzz"));
  }
  
  @Test
  public void test05FirstTwoCharacters1()
  {
    assertEquals("gr", JU11V.firstTwoCharacters("grace hopper"));
  }

  @Test
  public void test05FirstTwoCharacters2()
  {
    assertEquals("i#", JU11V.firstTwoCharacters("i"));
  }
  
  @Test
  public void test05FirstTwoCharacters3()
  {
    assertEquals("su", JU11V.firstTwoCharacters("supermanisop"));
  }
  
  @Test
  public void test05FirstTwoCharacters4()
  {
    assertEquals("##", JU11V.firstTwoCharacters(""));
  }


}
