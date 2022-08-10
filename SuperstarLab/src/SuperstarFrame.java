
/**
 * MAKE NO CHANGES TO THIS FILE
 */

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * GUI Frame class for the Superstar Game
 * 
 * @author cody.henrichsen
 * @version 2.1 17/09/2018
 */
public class SuperstarFrame extends JFrame
{
  // Data members for the JFrame subclass instance

  /**
   * The instance of the panel used for playing the game.
   */
  private SuperstarPanel gamePanel;

  /**
   * Blank panel used for the CardLayout switching screens feature.
   */
  private JPanel panelCards;

  /**
   * The instance variable used to add a Superstar to the game.
   */
  private StartPanel startPanel;

  /**
   * A reference to the SuperstarGame instance to allow for minimized coupling
   * in the object structure.
   */
  private SuperstarGame controller;

  /**
   * Builds an instance of the CelebFrame with a reference to the SuperstarGame
   * instance.
   * 
   * @param controller
   *          A reference to a SuperstarGame to share with the CelebPanel
   *          instance.
   */
  public SuperstarFrame(SuperstarGame controllerRef)
  {
    // The first line of any subclass should ALWAYS be a correct call to the
    // super constructor.
    super();
    this.controller = controllerRef;
    this.panelCards = new JPanel(new CardLayout());
    this.gamePanel = new SuperstarPanel(controller);
    this.startPanel = new StartPanel(controller);
    setupFrame();
  }

  /**
   * Configures the JFrame window subclass to add the panel and set size based
   * information.
   */
  private void setupFrame()
  {
    panelCards.add(gamePanel, "GAME");
    panelCards.add(startPanel, "START");
    this.setSize(600, 600); // VHS initial dimensions of the game.
    this.setTitle("Superstar Game");
    this.add(panelCards);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

    replaceScreen("START");

    // Must be the last line of the configuration segment to allow the GUI to be
    // displayed.
    // If not set as true the window will not display and the app will
    // terminate.
    this.setVisible(true);

  }

  /**
   * Swaps the screen between the existing panels based on the String parameter.
   * 
   * @param screen
   *          The name of the screen to open.
   */
  public void replaceScreen(String screen)
  {
    if (screen.equals("GAME"))
    {
      // If the selected screen is the game, sends the first clue to the screen.
      gamePanel.addClue(controller.sendClue());
    }
    // Sets the chosen JPanel subclass as the active class
    ((CardLayout) panelCards.getLayout()).show(panelCards, screen);
  }

}
