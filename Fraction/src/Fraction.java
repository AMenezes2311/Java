
/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */
import java.util.ArrayList;

public class Fraction
{
  ArrayList<String> list = new ArrayList<>();
  list.add(0, "A");
  list.add(0, "B");
  list.add(0, "C");
  list.add(0, "D");
  list.add(list.set(1, "Z"));
  list.set(2, list.remove(3));
}