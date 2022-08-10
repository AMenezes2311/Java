
/**
 * JU10V Focuses on Strings.  Do not turn this particular file to the dropbox grading system.
 * Student Version
 * @version 2.0 Palindrome is spelled correctly now.
 */
import static org.junit.Assert.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
//Used to keep tests in order - otherwise would make students insane.
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
//
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU10VTest
{

  
  @Test
  public void test02NoFirstLetterConcat1()
  {
    assertEquals("raceopper", JU10V.noFirstLetterConcat("Grace", "Hopper"));
  }
  
  @Test
  public void test02NoFirstLetterConcat2()
  {
    assertEquals("teveobs", JU10V.noFirstLetterConcat("Steve", "Jobs"));
  }
  
  @Test
  public void test02NoFirstLetterConcat3()
  {
    assertEquals("haggyoo", JU10V.noFirstLetterConcat("Shaggy", "Doo"));
  }
  
  @Test
  public void test03GetMiddleThree1()
  {
    assertEquals("and", JU10V.getMiddleThree("Candy"));
  }
  
  @Test
  public void test03GetMiddleThree2()
  {
    assertEquals("exe", JU10V.getMiddleThree("barreexercise"));
  }
  
  @Test
  public void test03GetMiddleThree3()
  {
    assertEquals("gsa", JU10V.getMiddleThree("stringsarefun"));
  }
  
  @Test
  public void test03GetMiddleThree4()
  {
    assertEquals("nope", JU10V.getMiddleThree("even"));
    assertEquals("nope", JU10V.getMiddleThree("rt"));
    assertEquals("nope", JU10V.getMiddleThree("bathbathbath"));
  }




  @Test
  public void test08ConvertName1()
  {
    assertEquals("John von Neumann", JU10V.convertName("von Neumann, John"));
  }

  @Test
  public void test08ConvertName2()
  {
    assertEquals("Grace Hopper", JU10V.convertName("Hopper, Grace"));
  }


  @Test
  public void test09FirstAndLast1()
  {
    assertEquals("pe", JU10V.firstAndLast("pasta", "rice"));
  }

  @Test
  public void test09FirstAndLast2()
  {
    assertEquals("t#", JU10V.firstAndLast("turbo", ""));
  }

  @Test
  public void test09FirstAndLast3()
  {
    assertEquals("##", JU10V.firstAndLast("", ""));
  }


  @Test
  public void test10GetEuroDate1()
  {
    assertEquals("31-05-2009", JU10V.getEuroDate("05/31/2009"));
  }
  
  @Test
  public void test10GetEuroDate2()
  {
    assertEquals("01-01-2001", JU10V.getEuroDate("01/01/2001"));
  }



  @Test
  public void test14FindVowels1()
  {
    assertEquals(
      "The first position of a is 14.\nThe first position of e is 4.\nThe first position of i is 2.\nThe first position of o is 11.\nThe first position of u is 0.\n",
      JU10V.findVowels("university of arizona"));
  }

  @Test
  public void test14FindVowels2()
  {
    assertEquals(
      "The first position of a is -1.\nThe first position of e is 6.\nThe first position of i is 11.\nThe first position of o is 1.\nThe first position of u is 4.\n",
      JU10V.findVowels("computer science"));
  }


}