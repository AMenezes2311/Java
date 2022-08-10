import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 * The start screen for the SuperstarGame app. You will have to hack this file
 * in Activity 3. There are several hints in the code to help, but please
 * ask your instructor in the PT if you need extra hints.
 * 
 * Code CartoonSuperstar first, then add a GUI option for your
 * users to choose this superstar when they play the game.
 * 
 * @version 2.2
 */
public class StartPanel extends JPanel
{
  /**
   * Reference to the Game to call methods.
   */
  private SuperstarGame controller;

  /**
   * The layout manager for the screen.
   */
  private SpringLayout panelLayout;

  /**
   * Logical container for the RadioButtons to guarantee only one is selected at
   * a time.
   */
  private ButtonGroup typeGroup;

  /**
   * RadioButton for the default type.
   */
  private JRadioButton superstarRadio;

  /**
   * RadioButton for the Superstar type.
   */
  private JRadioButton literatureRadio;

  /**
   * Customize the JRadioButton for the class created sub class
   */

  // Activity 3 - Question 10 goes here - JRadioButton for Cartoon Class

  /**
   * Label to guide the user to what should be inputted.
   */
  private JLabel clueLabel;

  /**
   * Label for displaying the current number of celebrities added to the game
   */
  private JLabel superstarCountLabel;

  /**
   * Textfield to type in the answer for the Superstar.
   */
  private JTextField answerField;

  /**
   * Textfield to type in the clue for the Superstar.
   */
  private JTextField clueField;

  /**
   * Button used to verify and add a Superstar to the ArrayList of Superstar for
   * the game
   */
  private JButton addSuperstarButton;

  /**
   * Button used to start the game.
   */
  private JButton startButton;

  /**
   * String to populate the clueLabel if Superstar is picked.
   */
  private String superstarClue;

  /**
   * String to populate the clueLabel if Literature Superstar is picked.
   */
  private String literatureClue;

  /**
   * String to populate the clueLabel if Class Generated Superstar is picked.
   */

  // Activity 3 - Question 10 goes here - String for Cartoon Class Clue format

  /**
   * String used for static text in label.
   */
  private String countLabelText;

  /**
   * The current number of celebrities added to the game
   */
  private int superstarCount;

  /**
   * Constructs a StartPanel with a reference to the game passed as a parameter
   * to be used as a data member.
   * 
   * @param controller
   *          The reference to the game
   */
  public StartPanel(SuperstarGame controller)
  {
    super();
    this.controller = controller;
    this.panelLayout = new SpringLayout();
    this.typeGroup = new ButtonGroup();
    this.superstarRadio = new JRadioButton("Superstar");
    this.literatureRadio = new JRadioButton("Literature Superstar");
    // Activity 3 - Question 11 goes here - New JRadioButton Cartoon Class
    // button

    this.superstarClue = "Enter the clue for the superstar";
    this.literatureClue =
      "Enter the clues for the literature superstar separated by commas";
    // Activity 3 - Question 11 goes here - New clue format Cartoon Class string
    // note: the pdf calls this nameOfSuperstar but should be cartoonClue

    this.clueLabel = new JLabel(superstarClue);

    this.answerField =
      new JTextField("Type Superstar here (4 letters minimum)");
    this.clueField =
      new JTextField("Enter Superstar clue here (10 letters minimum)");
    this.addSuperstarButton = new JButton("Add current superstar");
    this.startButton = new JButton("Start superstar game");
    this.superstarCount = 0;
    this.countLabelText = "Current superstar Count: " + superstarCount;
    this.superstarCountLabel = new JLabel(countLabelText);

    setupPanel();
    setupLayout();
    setupListeners();
  }

  /**
   * Validation method for the text to create a Superstar instance.
   * 
   * @param answerText
   *          The name of the Superstar. Validation requires at least 4
   *          characters.
   * @param clueText
   *          The text for the clue. Validation depends on the selected
   *          Superstar type, but at least 10 characters are required.
   * @return Whether the appropriate text amounts are filled and the correct
   *         type of clue is given.
   */
  private boolean validate(String answerText, String clueText)
  {
    boolean validClue = false;
    boolean validAnswer = false;

    // Activity 3 - Question 15 goes here
    // write an IF ELSE that checks if your new radio isSelected.
    if (literatureRadio.isSelected())
    {
      validClue = controller.validateClue(clueText, "Literature");
    }
    else
    {
      validClue = controller.validateClue(clueText, "");
    }

    if (answerText.length() >= 4) // VHS
    {
      validAnswer = controller.validateSuperstar(answerText);
    }

    return (validClue && validAnswer);
  }

  /**
   * Adds all components to the StartPanel and uses the SpringLayout variable,
   * panelLayout, as the layout manager.
   */
  private void setupPanel()
  {
    this.setLayout(panelLayout);
    this.add(clueLabel);
    this.add(superstarRadio);
    this.add(literatureRadio);
    // Activity 3 - Question 12 - You'll need to add the button here similar
    // to the celeb and literature ones.

    this.add(answerField);
    this.add(clueField);
    this.add(startButton);
    this.add(superstarCountLabel);
    this.add(addSuperstarButton);

    // Adds the RadioButtons to the group so only one can be selected.
    superstarRadio.setSelected(true);
    startButton.setEnabled(false);
    typeGroup.add(superstarRadio);
    typeGroup.add(literatureRadio);
    // Activity 3 - Question 12 goes here
    // Do the same as in the lines above for your new celebtype.
  }

  /**
   * Uses the Springlayout constraint system to place all GUI components on
   * screen. All constraints grouped together to keep code clean and
   * maintainable.
   */
  private void setupLayout()
  {
    //@formatter:off
    panelLayout.putConstraint(SpringLayout.WEST, clueLabel, 0, SpringLayout.WEST, superstarRadio);
    panelLayout.putConstraint(SpringLayout.NORTH, superstarRadio, 15, SpringLayout.NORTH, this);
    panelLayout.putConstraint(SpringLayout.WEST, superstarRadio, 15, SpringLayout.WEST, this);
    panelLayout.putConstraint(SpringLayout.EAST, addSuperstarButton, 0, SpringLayout.EAST, startButton);
    panelLayout.putConstraint(SpringLayout.NORTH, addSuperstarButton, 20, SpringLayout.SOUTH, clueField);
    panelLayout.putConstraint(SpringLayout.WEST, addSuperstarButton, 0, SpringLayout.WEST, superstarRadio);

    panelLayout.putConstraint(SpringLayout.NORTH, startButton, 20, SpringLayout.SOUTH, addSuperstarButton);
    panelLayout.putConstraint(SpringLayout.NORTH, superstarCountLabel, 0, SpringLayout.NORTH, superstarRadio);
    panelLayout.putConstraint(SpringLayout.EAST, superstarCountLabel, -45, SpringLayout.EAST, this);

    // Activity 3 - Question 13 goes here - New JRadioButton Cartoon Class
    // All of this code positions the radio buttons relative to each other.
    // This was confusing, so the VHS staff will step you through:
    // To get question 13 done, comment out the following line of code:
    panelLayout.putConstraint(SpringLayout.NORTH, literatureRadio, 10, SpringLayout.SOUTH, superstarRadio);
    // Then uncomment the next three lines:
    // panelLayout.putConstraint(SpringLayout.NORTH, literatureRadio, 10, SpringLayout.SOUTH, cartoonRadio);
    // panelLayout.putConstraint(SpringLayout.WEST, cartoonRadio, 0, SpringLayout.WEST, superstarRadio);
    // panelLayout.putConstraint(SpringLayout.NORTH, cartoonRadio, 10, SpringLayout.SOUTH, superstarRadio);
    // Now you should see a new radio button for the CartoonSuperstar when you run the app.
    
    panelLayout.putConstraint(SpringLayout.WEST, literatureRadio, 0, SpringLayout.WEST, superstarRadio);
    panelLayout.putConstraint(SpringLayout.NORTH, clueLabel, 10, SpringLayout.SOUTH, answerField);
    panelLayout.putConstraint(SpringLayout.NORTH, answerField, 40, SpringLayout.SOUTH, literatureRadio);
    panelLayout.putConstraint(SpringLayout.WEST, answerField, 0, SpringLayout.WEST, superstarRadio);
    panelLayout.putConstraint(SpringLayout.EAST, answerField, -15, SpringLayout.EAST, this);

    panelLayout.putConstraint(SpringLayout.WEST, clueField, 0, SpringLayout.WEST, superstarRadio);
    panelLayout.putConstraint(SpringLayout.SOUTH, clueField, 55, SpringLayout.SOUTH, answerField);
    panelLayout.putConstraint(SpringLayout.EAST, clueField, 0, SpringLayout.EAST, answerField);
    panelLayout.putConstraint(SpringLayout.WEST, startButton, 0, SpringLayout.WEST, superstarRadio);
    panelLayout.putConstraint(SpringLayout.EAST, startButton, 0, SpringLayout.EAST, answerField);
    //@formatter:on
  }

  /**
   * Used to link all Listeners to the associated GUI components.
   */
  private void setupListeners()
  {
    /**
     * Links the submitButton to the validation and submit code. Provides user
     * input if information is not valid.
     */
    startButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent mouseClick)
      {
        controller.play();
      }
    });

    addSuperstarButton.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent mouseClick)
      {
        answerField.setBackground(Color.WHITE);
        clueField.setBackground(Color.WHITE);
        if (validate(answerField.getText(), clueField.getText()))
        {
          addToGame();
        }
        else
        {
          invalidInput();
        }
        superstarCount = controller.getSuperstarGameSize();
        superstarCountLabel.setText(countLabelText + superstarCount);
      }
    });

    /**
     * Adds listeners to the radio buttons using the Java 8+ Lambda structure
     * for short code.
     * 
     */
    literatureRadio
      .addActionListener(select -> clueLabel.setText(literatureClue));
    superstarRadio
      .addActionListener(select -> clueLabel.setText(superstarClue));
    // Activity 3 - Question 14 goes here

  }

  private void invalidInput()
  {
    answerField.setText("Type in the Superstar!!");
    answerField.setBackground(Color.RED);
    clueField.setText("Type in the clue");
    clueField.setBackground(Color.RED);
  }

  private void addToGame()
  {
    String type = "Superstar";
    // Activity 3 - Question 16 goes here
    // you will have to check if the new radio
    // button is selected, then set the type correctly.
    if (literatureRadio.isSelected())
    {
      type = "Literature";
    }
    String answer = answerField.getText().trim();
    String clue = clueField.getText().trim();
    answerField.setText("");
    clueField.setText("");
    controller.addSuperstar(answer, clue, type);
    startButton.setEnabled(true);
  }

}
