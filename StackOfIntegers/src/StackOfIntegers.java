
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.ArrayList;

public class StackOfIntegers
{
  private ArrayList<Integer> elements;
  private int size;
  public static final int DEFAULT_CAPACITY = 16;

  /** Construct a stack with the default capacity 16 */
  public StackOfIntegers()
  {
    elements = new ArrayList<>(DEFAULT_CAPACITY);
    this.size = elements.size();
  }

  public StackOfIntegers(int size)
  {
    elements = new ArrayList<>(size);
    this.size = elements.size();
  }

  /** Push a new integer to the top of the stack */
  public void push(int value)
  {
    elements.add(value);
    size = elements.size();
  }

  /** Return and remove the top element from the stack */
  public int pop()
  {
    int top = elements.get(elements.size() - 1);
    elements.remove(elements.size() - 1);
    return top;
  }

  /** Return the top element from the stack */
  public int peek()
  {
    return elements.get(elements.size() - 1);
  }

  /** Test whether the stack is empty */
  public boolean empty()
  {
    return elements.size() == 0;
  }

  public int getSize()
  {
    return size;
  }

}
