import java.util.Scanner;

public class TestLoanClass
{
  /** Main method */
  public static void main(String[] args)
  {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.println("Five loans are loaded into the database.");
    System.out.print("How many additional loans will you enter? ");
    int additionalLoans = input.nextInt();
    input.nextLine(); // consume the "\n" since nextInt doesn't eat those.

    Loan[] bankLoans = new Loan[5 + additionalLoans];

    // pre-load loans into the database.
    bankLoans[0] = new Loan("Bill Gates", 2.5, 5, 1000);
    bankLoans[1] = new Loan("Jade Raymond", 5.25, 6, 10000);
    bankLoans[2] = new Loan("Grace Hopper", 8.6, 10, 50000);
    bankLoans[3] = new Loan("Corrine Yu", 20, 4, 25000);
    bankLoans[4] = new Loan("Frances Spence", 8.25, 8, 40000);

    // The next Loan will be stored at subscript 5.

    // TODO: lots of code goes here.
    for (int i = 5; i < bankLoans.length; i++)
    {
      System.out.print("Enter borrower name: ");
      String borrower = input.nextLine();
      System.out.print("Enter annual interest rate, for example, 8.25: ");
      double annualInterestRate = input.nextDouble();
      input.nextLine();
      System.out.print("Enter the number of years as an integer: ");
      int numberOfYears = input.nextInt();
      input.nextLine();
      System.out.print("Enter the loan amount, for example, 120000.95: ");
      double loanAmount = input.nextDouble();
      input.nextLine();

      bankLoans[i] =
        new Loan(borrower, annualInterestRate, numberOfYears, loanAmount);
    }

    System.out.println();
    System.out
      .println("Display of all borrowers and respective monthly payments:");

    for (int i = 0; i < bankLoans.length; i++)
    {
      System.out.println(bankLoans[i].getBorrowerName() + " has a loan rate of "
        + bankLoans[i].getAnnualInterestRate() + "% with monthly payment of $"
        + roundToNearestPenny(bankLoans[i].getMonthlyPayment()));
    }

    System.out.print("\nWhat rate should we cap all loans at? ");
    double loanCap = input.nextDouble();
    System.out.println("");

    for (int i = 0; i < bankLoans.length; i++)
    {
      if (bankLoans[i].getAnnualInterestRate() > loanCap)
      {
        bankLoans[i].setAnnualInterestRate(loanCap);
        System.out.println(bankLoans[i].getBorrowerName()
          + " has a loan rate of " + bankLoans[i].getAnnualInterestRate()
          + "% with monthly payment of $"
          + roundToNearestPenny(bankLoans[i].getMonthlyPayment()));
      }
      else
      {
        System.out.println(bankLoans[i].getBorrowerName()
          + " has a loan rate of " + bankLoans[i].getAnnualInterestRate()
          + "% with monthly payment of $"
          + roundToNearestPenny(bankLoans[i].getMonthlyPayment()));
      }
    }
  }

  /**
   * Snazzy method that will return value that is rounded to the nearest penny.
   * You can't depend on Math.round or printf on the actual AP exam.
   * 
   * @param originalVal
   *          the unrounded amount.
   * @return the rounded value to the nearest penny.
   */
  public static double roundToNearestPenny(double originalVal)
  {
    return (int) (originalVal * 100.0 + 0.5) / 100.0;
  }
}