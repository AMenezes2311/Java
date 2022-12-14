
/**
 * MAKE NO CHANGES TO THIS FILE.
 * This will help you with Activity 3.
 * Take a look at CartoonSuperstar as well.
 */
import java.util.ArrayList;

/**
 * Subclass of Superstar to show how methods can be overridden and super can be
 * called while changing functionality.
 * 
 * @version 1.0 15/09/2018
 */
public class LiteratureSuperstar extends Superstar
{
  /**
   * The list of clues for the Literature Superstar. They can be titles of
   * texts, important characters, settings, etc...s
   */
  private ArrayList<String> clueList;

  /**
   * Builds a LiteratureSuperstar instance with an answer and a series of clues
   * as a String separated by commas.
   * 
   * @param answer
   *          The literature Superstar
   * @param clues
   *          Clues for the literature Superstar
   */
  public LiteratureSuperstar(String answer, String clues)
  {
    super(answer, clues);
    processClues(); // Put all of the splitting stuff into a private method
    // to make ctor look nice and tidy.
  }

  /**
   * Processes the series of clues for the LiteratureSuperstar by adding all the
   * values to an ArrayList<String> by splitting the original clue to an array
   * of String. The original value is not impacted, thus preserving data and
   * inheritance integrity.
   */
  private void processClues()
  {
    String[] clues = super.getClue().split(",");
    clueList = new ArrayList<String>();
    System.out.println(clueList);
    for (String currentClue : clues)
    {
      clueList.add(currentClue);
    }
  }

  /**
   * Overridden version of the getClue() method that cycles through each of the
   * individual clues in the series. It recreates the clueList if the user has
   * finished the series of clues.
   */
  @Override
  public String getClue()
  {
    if (clueList.size() == 0)
    {
      processClues();
    }
    String currentClue = clueList.remove(0);

    return currentClue;
  }

  @Override
  public String toString()
  {
    String dsc =
      "This is the literature Superstar: " + getAnswer() + "\nThe clues are:\n";

    for (String word : super.getClue().split(","))
    {
      dsc += word + "\n";
    }

    return dsc;
  }

}
