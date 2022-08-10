import java.util.ArrayList;

/**
 * The framework for the Superstar Game project,
 * This file goes with Activity 2.
 * If you want to start the game, you need to run SuperstarRunner.java
 * 
 * @version 2.4
 */
public class SuperstarGame
{
  /**
   * A reference to a Superstar or subclass instance.
   */
  private ArrayList<String> starGameList = new ArrayList<String>();
  private String gameSuperstar = "";
  /**
   * The GUI frame for the Superstar game.
   */
  private SuperstarFrame gameWindow; // We did this for you :)

  /**
   * The ArrayList of Superstar values that make up the game
   */
  // TODO: Activity 2
  /**
   * Constructor that builds the game and starts the GUI
   */
  public SuperstarGame()
  {
    // TODO: Activity 2
    System.out.println("Activity 2 assignment:");
    System.out
      .println("Game will not run until\nSuperstarGame ctor completed!");

  }

  /**
   * Prepares the game to start by re-initializing the starGameList and having
   * the gameFrame open the start screen.
   */
  public void prepareGame()
  {
    // TODO: Activity 2

  }

  /**
   * Validates the name of the Superstar. It must have at least 4 characters.
   * 
   * @param name
   *          The name of the Superstar
   * @return If the supplied Superstar is valid
   */
  public boolean validateSuperstar(String name)
  {
    // TODO:
    return false;
  }

  /**
   * Checks that the supplied clue has at least 10 characters or is a series of
   * clues This method would be expanded based on your subclass of Superstar.
   * 
   * @param clue
   *          The text of the clue(s)
   * @param type
   *          Supports a subclass of Superstar
   * @return If the clue is valid.
   */
  public boolean validateClue(String clue, String type)
  {
    // TODO:
    return false;
  }

  /**
   * Adds a Superstar of specified type to the game list
   * 
   * @param name
   *          The name of the Superstar
   * @param guess
   *          The clue(s) for the Superstar
   * @param type
   *          What type of Superstar
   */
  public void addSuperstar(String name, String guess, String type)
  {
    // TODO:
  }

  /**
   * Asserts that the list is initialized and contains at least one Superstar.
   * Sets the current Superstar as the first item in the list. Opens the game
   * play screen.
   */
  public void play()
  {
    // TODO: Activity 2
  }

  /**
   * Accessor method for the current size of the list of celebrities
   * 
   * @return Remaining number of celebrities
   */
  public int getSuperstarGameSize()
  {
    // TODO: Activity 2
    return 42;
  }

  /**
   * Determines if the supplied guess is correct.
   * 
   * @param guess
   *          The supplied String
   * @return Whether it matches regardless of case or extraneous external
   *         spaces.
   */
  public boolean processGuess(String guess)
  {
    // TODO: Activity 2
    return false;
  }

  /**
   * Accessor method for the games clue to maintain low coupling between classes
   * 
   * @return The String clue from the current Superstar.
   */
  public String sendClue()
  {
    // TODO: Activity 2
    return null;
  }

}
