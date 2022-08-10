/**
 * Starts the Superstar Game application
 * You normally run this file to play the game.
 * This won't work correctly until you
 * pass all tests in the SuperstarGameTest.
 * 
 * Do not change any code in this file. Just run it to play the game.
 * 
 * @version 1.1
 */
public class SuperstarRunner
{
  /**
   * The entry point of the Java application.
   * 
   * @param args
   *          Unused parameter as it is a GUI based program.
   */
  public static void main(String[] args)
  {
    // All this does is instanciate SuperstarGame which
    // in turn will instanciate SuperstarFrame, which in turns
    // instanciates StartPanel.
    new SuperstarGame();
  }
}
