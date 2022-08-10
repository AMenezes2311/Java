/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class StringDemo
{

  public static void main(String[] args)
  {
    /* QUESTIONS
     * Why is password1 == password2 true, yet password3 == password4 is false?
     * Because the == operator checks whether the variables are referring to the
     * same object, not if they have the same content.
     * 
     * How does .equals differ than "==" when comparing Strings?
     * Because .equals method checks whether the string have the same content,
     * while == operator checks if the strings are referring to the same object
     * 
     * How can compareTo be used to check if two Strings have the same letters?
     * If two strings have the same letter the .compareTo method will return 0,
     * therefore you know that both strings have the same letter. */

    // Explicitly constructing a String using the new keyword and using the
    // implicit construction
    String s1 = new String("Hello World!");

    // Demonstrate how String interning works.
    String s2 = "Hello World!";

    String s3 = "Hello World!";

    // Demonstrate the difference between "==", "equals", and "compareTo" when
    // deal with Strings.
    // String below used for further development on this example
    String s4 = new String("Hello World!");

    System.out.println(s1 == s4); // returns false (different objects)
    System.out.println(s1.equals(s4)); // returns true (same content)
    System.out.println(s1.compareTo(s4) + "\n"); // returns 0 (same content)

    System.out.println(s2 == s3); // returns true (same object)
    System.out.println(s2.equals(s3)); // returns true (same content)
    System.out.println(s2.compareTo(s3) + "\n"); // returns 0 (same content)

    System.out.println(s1 == s2); // returns false (different objects)
    System.out.println(s1.equals(s2)); // returns true (same content)
    System.out.println(s1.compareTo(s2) + "\n"); // returns 0 (same content)

  }

}
