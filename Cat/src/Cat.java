/**
 * Preference file version 092020
 * 
 * @author: André Menezes
 */

public class Cat
{
  public static int crazyCount(int n)
  {
    if (n < 8)
      return 0;
    else if ((n / 10) % 10 == 8 && (n % 10) == 8)
      return 2 + crazyCount(n / 10);
    else if ((n % 10) == 8)
      return 1 + crazyCount(n / 10);
    else
      return 0 + crazyCount(n / 10);
  }

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    System.out.println(crazyCount(3));
  }

}
