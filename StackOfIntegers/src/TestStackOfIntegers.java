/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class TestStackOfIntegers
{

  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    StackOfIntegers stack = new StackOfIntegers();

    for (int i = 0; i < 10; i++)
    {
      stack.push(i);
    }

    while (!stack.empty())
    {
      System.out.print(stack.pop() + " ");
    }
  }
}
