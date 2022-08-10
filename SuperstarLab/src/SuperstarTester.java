/**
 * @author: Andre Menezes
 *          This relates to Activity 1 Question 6
 */

public class SuperstarTester
{
  public static void main(String[] args)
  {
    // construct a Superstar object
    // and demonstrate the methods of Superstar
    // TODO: Write code here:

    Superstar celeb =
      new Superstar("Neymar Junior", "PSG's player that was born in Brazil");

    System.out.println(celeb.getClue());
    System.out.println(celeb.getAnswer());

    celeb
      .setClue("Has been a PSG player for more than two years and was born in Brazil");
    celeb.setAnswer("Marquinhos");

    System.out.println(celeb.toString());
  }

}
