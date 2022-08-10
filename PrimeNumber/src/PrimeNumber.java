/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class PrimeNumber
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    final int NUMBER_OF_PRIMES = 50; // Number of primes to display
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness

    System.out.println("Prime numbers up to 500 are \n");

    // Repeatedly find prime numbers
    while (number <= 500)
    {
      // Assume the number is prime
      boolean isPrime = true; // Is the current number prime?

      // Test whether number is prime
      for (int divisor = 2; divisor <= number / 2 && isPrime; divisor++)
      {
        // If true, the number is not prime
        if (number % divisor == 0)
        {
          // Set isPrime to false, if the number is not prime
          isPrime = false;
        }
      }

      // Display the prime number and increase the count
      if (isPrime)
      {
        count++; // Increase the count

        if (count % NUMBER_OF_PRIMES_PER_LINE == 0)
        {
          // Display the number and advance to the new line
          System.out.println(number + "\n");
        }
        else

          System.out.println(number + " ");
      }

      // Check if the next number is prime
      number++;
    }
  }
}