/**
 * Superstar base class for the Superstar game.
 * 
 * @version 1.5
 */
public class Superstar
{
  private String answer;
  private String clue;

  // attributes/instance vars
  /**
   * The clue to determine the Superstar
   */
  // TODO: Activity 1

  /**
   * The answer or name of the Superstar.
   */
  // TODO: Activity 1

  /**
   * Creates a Superstar instance with the supplied answer and clue
   * 
   * @param answer
   * @param clue
   */
  public Superstar(String answer, String clue)
  {
    // TODO: Activity 1
    this.answer = answer;
    this.clue = clue;
  }

  /**
   * Supplies the clue for the Superstar
   * 
   * @return
   */
  public String getClue()
  {
    // TODO: Activity 1
    return clue;
  }

  /**
   * Supplies the answer for the Superstar.
   * 
   * @return
   */
  public String getAnswer()
  {
    // TODO: Activity 1
    return answer;
  }

  /**
   * Updates the clue to the provided String.
   * 
   * @param clue
   *          The new clue.
   */
  public void setClue(String clue)
  {
    // TODO: Activity 1
    this.clue = clue;
  }

  /**
   * Updates the answer to the provided String.
   * 
   * @param answer
   *          The new answer.
   */
  public void setAnswer(String answer)
  {
    // TODO: Activity 1
    this.answer = answer;

  }

  /**
   * Provides a String representation of the Superstar.
   */
  @Override
  public String toString()
  {
    // TODO: Activity 1

    return "The Superstar's name is: " + answer
      + ". The clue for this superstar is: " + clue;
  }

}
