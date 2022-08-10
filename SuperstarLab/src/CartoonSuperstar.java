/**
 * This helps you do Activity 3
 * You'll hack this file and turn it in.
 * Take a look at LiteratureSuperstar for ideas.
 * Note: There are no Junit tests for this because this class
 * uses random numbers. You will need to test it by running SuperstarRunner
 * and actually playing the game.
 * 
 * @version 1.1
 */
public class CartoonSuperstar extends Superstar
{
  // Activity 3 - Question 3

  // TODO: create one instance variable
  // to store the movie/show name. Superstar already stores the name and the
  // clue.
  /**
   * Constructs a CartoonSuperstar
   * 
   * @param answer
   *          - the cartoon character's name
   * @param clue
   *          - a clue about the cartoon character other than the show/movie it
   *          appears in
   */
  public CartoonSuperstar(String answer, String clue)
  {
    super("TODO", "TODO"); // Change this.
    // You'll store the answer into the parent class.
    // You need to extract the normal clue after the first comma and send
    // it to the parent class. The stuff before the comma is the movie/show
    // that the superstar is in.

    // TODO: Look at LiteratureSuperstar for ideas on
    // how to get the user to enter stuff after the
    // first clue.
    // Remember you must call super in the first line of code to send
    // information to the parent's constructor.

    // When the user chooses to add a cartoon superstar, they will
    // add a normal clue, then ONLY ONE comma, then a famous show they starred
    // in.

  }

  /**
   * This is what really separates a CartoonSuperstar vs a regular Superstar
   * randomly returns either the clue (80% of the time) or the show (20% of the
   * time)
   */
  @Override
  public String getClue()
  {
    // TODO: how would get clue work differently
    // than the Superstar's version? Maybe it randomly sends back
    // one of the special clues, or it will just send back the normal clue.
    return super.getClue(); // You'll need to change this.
  }

  @Override
  public String toString()
  {
    // TODO: Make sure you add your new instance vars
    // to this toString.
    return super.toString();
  }

  /* Getter to return the movie/show that the Superstar is in */
  public String getShow()
  {
    return "TODO";
  }
}
