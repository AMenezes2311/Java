
/**
 * Use to test your Activity 1 and Activity 1 answers.
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 * 
 * @version 1.1
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Field;
import java.util.ArrayList;

// Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SuperstarGameTest
{

  @Test
  public void test01Act1SuperstarCtor1()
  {
    Superstar celeb = new Superstar("Big Bird", "Covered in yellow feathers");
    assertEquals("The Superstar's name is: Big Bird. The clue for this superstar is: Covered in yellow feathers",
                 celeb.toString());
  }

  @Test
  public void test01Act1SuperstarCtor2()
  {
    Superstar celeb =
      new Superstar("Grace Hopper",
                    "Helped invent the COBOL programming language");
    assertEquals("The Superstar's name is: Grace Hopper. The clue for this superstar is: Helped invent the COBOL programming language",
                 celeb.toString());
  }

  @Test
  public void test02Act1GetClue1()
  {
    Superstar celeb = new Superstar("Big Bird", "Covered in yellow feathers");
    assertEquals("Covered in yellow feathers", celeb.getClue());
  }

  @Test
  public void test02Act1GetClue2()
  {
    Superstar celeb = new Superstar("Bill Gates", "Created Microsoft");
    assertEquals("Created Microsoft", celeb.getClue());
  }

  @Test
  public void test03Act1GetAnswer1()
  {
    Superstar celeb = new Superstar("Big Bird", "Covered in yellow feathers");
    assertEquals("Big Bird", celeb.getAnswer());
  }

  @Test
  public void test03Act1GetAnswer2()
  {
    Superstar celeb = new Superstar("Bill Gates", "Created Microsoft");
    assertEquals("Bill Gates", celeb.getAnswer());
  }

  @Test
  public void test04Act1SetClue1()
  {
    Superstar celeb = new Superstar("Big Bird", "Covered in yellow feathers");
    celeb.setClue("Friends with Bert and Ernie");
    assertEquals("The Superstar's name is: Big Bird. The clue for this superstar is: Friends with Bert and Ernie",
                 celeb.toString());
  }

  @Test
  public void test04Act1SetClue2()
  {
    Superstar celeb = new Superstar("Bill Gates", "Created Microsoft");
    celeb.setClue("Destroyed the polio disease");
    assertEquals("The Superstar's name is: Bill Gates. The clue for this superstar is: Destroyed the polio disease",
                 celeb.toString());
  }

  @Test
  public void test05Act1SetAnswer1()
  {
    Superstar celeb = new Superstar("Big Bird", "Covered in yellow feathers");
    celeb.setAnswer("Baby Chicken");
    assertEquals("The Superstar's name is: Baby Chicken. The clue for this superstar is: Covered in yellow feathers",
                 celeb.toString());
  }

  @Test
  public void test05Act1SetAnswer2()
  {
    Superstar celeb = new Superstar("Bill Gates", "Created Microsoft");
    celeb.setAnswer("Paul Allen");
    assertEquals("The Superstar's name is: Paul Allen. The clue for this superstar is: Created Microsoft",
                 celeb.toString());
  }

  // TESTS BELOW ARE FOR THE Superstar GAME
  // Activity 2

  @Test
  public void test06Act2ValidateSuperstar1()
  {
    SuperstarGame cg = new SuperstarGame();
    assertTrue(cg.validateSuperstar("Phil"));
    assertTrue(cg.validateSuperstar("Grace"));
    assertFalse(cg.validateSuperstar("Z"));
    assertFalse(cg.validateSuperstar("Ace"));
  }

  @Test
  public void test06Act2ValidateSuperstar2()
  {
    // Test trim method.
    SuperstarGame cg = new SuperstarGame();
    assertTrue(cg.validateSuperstar("  Phil"));
    assertTrue(cg.validateSuperstar("Grace   "));
    assertFalse(cg.validateSuperstar("    Z"));
    assertFalse(cg.validateSuperstar("Ace     "));
  }

  @Test
  public void test07Act2ValidateClue1()
  {
    SuperstarGame cg = new SuperstarGame();
    assertTrue(cg.validateClue("tenletters", ""));
    assertTrue(cg.validateClue("tenletterss", ""));
    assertFalse(cg.validateClue("nottenten", ""));
    assertFalse(cg.validateClue("notten", ""));
  }

  @Test
  public void test07Act2ValidateClue2()
  {
    // Test trim method.
    SuperstarGame cg = new SuperstarGame();
    assertTrue(cg.validateClue("  tenletters", ""));
    assertTrue(cg.validateClue("tenletterss   ", ""));
    assertFalse(cg.validateClue("    nottenten", ""));
    assertFalse(cg.validateClue("notten     ", ""));
  }

  @Test
  public void test08Act2AddSuperstar1()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Ford", "Played Han Solo in StarWars", "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("starGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Superstar's name is: Ford. The clue for this superstar is: Played Han Solo in StarWars]",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var");
    }
  }

  @Test
  public void test08Act2AddSuperstar2()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Ford", "Played Han Solo in StarWars", "");
    cg.addSuperstar("Mark Hamil", "Voices Joker in Batman cartoons", "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("starGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Superstar's name is: Ford. The clue for this superstar is: Played Han Solo in StarWars, The Superstar's name is: Mark Hamil. The clue for this superstar is: Voices Joker in Batman cartoons]",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var");
    }
  }

  @Test
  public void test08Act2AddSuperstar3()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("AAAA", "CLUECLUECLUEA", "");
    cg.addSuperstar("BBBB", "CLUECLUECLUEB", "");
    cg.addSuperstar("CCCC", "CLUECLUECLUEC", "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("starGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Superstar's name is: AAAA. The clue for this superstar is: CLUECLUECLUEA, The Superstar's name is: BBBB. The clue for this superstar is: CLUECLUECLUEB, The Superstar's name is: CCCC. The clue for this superstar is: CLUECLUECLUEC]",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var");
    }
  }

  @Test
  public void test09Act2GetSuperstarGameSize1()
  {
    SuperstarGame cg = new SuperstarGame();
    assertEquals("0", cg.getSuperstarGameSize() + "");
  }

  @Test
  public void test09Act2GetSuperstarGameSize2()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Heyhey", "CLUECLUECLUEhey", "");
    assertEquals("1", cg.getSuperstarGameSize() + "");
  }

  @Test
  public void test09Act2GetSuperstarGameSize3()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("AAAA", "CLUECLUECLUEA", "");
    cg.addSuperstar("BBBB", "CLUECLUECLUEB", "");
    cg.addSuperstar("CCCC", "CLUECLUECLUEC", "");
    assertEquals("3", cg.getSuperstarGameSize() + "");
  }

  @Test
  public void test10Act2ProcessGuess1()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
  }

  @Test
  public void test10Act2ProcessGuess2()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Bill Gates") + "");
  }

  @Test
  public void test10Act2ProcessGuess1b()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("GrAce Hopper") + "");
  }

  @Test
  public void test10Act2ProcessGuess2b()
  {
    // This should be false because the first celeb loaded is Grace
    // when the play method is invoked.
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Ada Lovelace") + "");
  }

  @Test
  public void test10Act2ProcessGuess3()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("starGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Superstar's name is: Ada Lovelace. The clue for this superstar is: Created the Analytical Engine]",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var");
    }
  }

  @Test
  public void test10Act2ProcessGuess4()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Bill Gates") + "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("starGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Superstar's name is: Grace Hopper. The clue for this superstar is: Admiral for the United States Navy, The Superstar's name is: Ada Lovelace. The clue for this superstar is: Created the Analytical Engine]",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var");
    }
  }

  @Test
  public void test10Act2ProcessGuess5()
  {
    // When a player guesses correct, the current gameSuperstar changes
    // to the next one in the array list.
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("gameSuperstar");
      field.setAccessible(true);
      Object value = (Superstar) field.get(cg);
      assertEquals("The Superstar's name is: Ada Lovelace. The clue for this superstar is: Created the Analytical Engine",
                   value.toString());
    }
    catch (Exception e)
    {
      System.out.println(e.toString());
      fail("SuperstarGame.java missing ArrayList starGameList instance var:"
        + e.toString());
    }
  }

  @Test
  public void test10Act2ProcessGuess6()
  {
    // When a player guesses wrong, the current gameSuperstar remains
    // the same.
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addSuperstar("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Bill Gates") + "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("gameSuperstar");
      field.setAccessible(true);
      Object value = (Superstar) field.get(cg);
      assertEquals("The Superstar's name is: Grace Hopper. The clue for this superstar is: Admiral for the United States Navy",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var:"
        + e.toString());
    }
  }

  @Test
  public void test10Act2ProcessGuess7()
  {
    // When a player guesses correctly, and there are
    // no more celebs to guess, then an empty celeb is set
    // as the current Superstar (where the clue and answer are both "")
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Grace Hopper", "Admiral for the United States Navy", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("gameSuperstar");
      field.setAccessible(true);
      Object value = (Superstar) field.get(cg);
      assertEquals("The Superstar's name is: . The clue for this superstar is: ",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var:"
        + e.toString());
    }
  }

  @Test
  public void test10Act2ProcessGuess8()
  {
    // General test for processGuess method.
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("AAAA", "CLUECLUECLUE1", "");
    cg.addSuperstar("BBBB", "CLUECLUECLUE2", "");
    cg.addSuperstar("CCCC", "CLUECLUECLUE3", "");
    cg.addSuperstar("DDDD", "CLUECLUECLUE4", "");
    cg.addSuperstar("EEEE", "CLUECLUECLUE5", "");
    cg.play();
    assertEquals("true", cg.processGuess("AAAA") + "");
    assertEquals("true", cg.processGuess("bbbb") + "");
    assertEquals("false", cg.processGuess("zzzz") + "");
    assertEquals("true", cg.processGuess("CCCC") + "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("gameSuperstar");
      field.setAccessible(true);
      Object value = (Superstar) field.get(cg);
      assertEquals("The Superstar's name is: DDDD. The clue for this superstar is: CLUECLUECLUE4",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var:"
        + e.toString());
    }
  }

  @Test
  public void test10Act2ProcessGuess9()
  {
    // General test for processGuess method.
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("AAAA", "CLUECLUECLUE1", "");
    cg.addSuperstar("BBBB", "CLUECLUECLUE2", "");
    cg.addSuperstar("CCCC", "CLUECLUECLUE3", "");
    cg.addSuperstar("DDDD", "CLUECLUECLUE4", "");
    cg.addSuperstar("EEEE", "CLUECLUECLUE5", "");
    cg.play();
    assertEquals("true", cg.processGuess("AAAA") + "");
    assertEquals("true", cg.processGuess("bbbb") + "");
    assertEquals("false", cg.processGuess("zzzz") + "");
    assertEquals("true", cg.processGuess("CCCC") + "");
    try
    {
      // Use reflection to see if student modified state correctly.
      Field field = SuperstarGame.class.getDeclaredField("starGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Superstar's name is: DDDD. The clue for this superstar is: CLUECLUECLUE4, The Superstar's name is: EEEE. The clue for this superstar is: CLUECLUECLUE5]",
                   value.toString());
    }
    catch (Exception e)
    {
      fail("SuperstarGame.java missing ArrayList starGameList instance var:"
        + e.toString());
    }
  }

  @Test
  public void test11Act2SendClue1()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Clifford", "A big red dog", "");
    cg.play();
    assertEquals("A big red dog", cg.sendClue());
  }

  @Test
  public void test11Act2SendClue2()
  {
    SuperstarGame cg = new SuperstarGame();
    cg.addSuperstar("Dora", "The explorer", "");
    cg.play();
    assertEquals("The explorer", cg.sendClue());
  }

}
