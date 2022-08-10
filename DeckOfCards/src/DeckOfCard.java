/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class DeckOfCard
{

  public static void main(String[] args)
  {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks =
      {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
       "King"};

    // Initialize the cards
    for (int i = 0; i < deck.length; i++)
    {
      deck[i] = i;
    }

    // Shuffle the cards
    for (int i = 0; i < deck.length; i++)
    {
      // Generate an index randomly
      int index = (int) (Math.random() * deck.length);
      int temp = deck[i];
      deck[i] = deck[index];
      deck[index] = temp;
    }

    // Ask the user how many cards he wants
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.println("The deck is shuffled. How many cards do you want? ");
    int n = input.nextInt();

    // Display the first four cards
    int total = 0;
    for (int i = 0; i < n; i++)
    {
      String suit = suits[deck[i] / 13];
      String rank = ranks[deck[i] % 13];

      if (suit == "Jack" || suit == "Queen" || suit == "king")
      {
        total += 10;
      }
      else
      {
        total += (deck[i] % 13) + 1;
      }

      System.out
        .println("Card number " + deck[i] + ": " + rank + " of " + suit);
    }

    if (total == 21)
    {
      System.out.println("The numerical value of those cards together is "
        + total + " which is at 21");
    }
    else if (total > 21)
    {
      System.out.println("The numerical value of those cards together is "
        + total + " which is over 21");
    }
    else
    {
      System.out.println("The numerical value of those cards together is "
        + total + " which is under 21");
    }
  }

}
