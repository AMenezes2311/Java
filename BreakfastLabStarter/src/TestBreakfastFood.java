/**
 * @author: Andre Menezes
 * @version: 2.0
 */

public class TestBreakfastFood
{

  public static void main(String[] args)
  {
    // Calling instances
    BreakfastFood calorieBomb =
      new BreakfastFood("Cocoa Puffs", "C", 110, 1, 1, 180, 0, 12, 13, 55, 25,
                        2, 1, 1.0, 22.74);
    BreakfastFood bestCereal =
      new BreakfastFood("Apple Jacks", "C", 110, 2, 0, 125, 1, 11, 14, 30, 25,
                        2, 1, 1, 33.17);
    BreakfastFood quickCereal =
      new BreakfastFood("Cream of Wheat (Quick)", "H", 100, 3, 0, 80, 1, 21, 0,
                        -1, 0, 2, 1, 1, 64.53);
    BreakfastFood cornFlakes =
      new BreakfastFood("Corn Flakes", "C", 100, 2, 0, 290, 1, 21, 2, 35, 25, 1,
                        1, 1, 45.86);
    BreakfastFood appleJacks =
      new BreakfastFood("Apple Jacks", "C", 110, 2, 0, 125, 1, 11, 14, 30, 25,
                        2, 1, 1, 33.17);

    // Displays all info
    System.out.println(calorieBomb.toString());
    System.out.println(bestCereal.toString());
    System.out.println(quickCereal.toString());
    System.out.println(cornFlakes.toString());
    System.out.println(appleJacks.toString());
    System.out.println("\n-------------------------------------- \n");

    // Accessor methods...
    System.out.println(bestCereal.getCalories()); // prints 110
    System.out.println(quickCereal.getType()); // prints "H"
    System.out.println(quickCereal.getCalories()); // prints 100
    System.out.println(quickCereal.getProtein()); // prints 3
    System.out.println(quickCereal.getFat()); // prints 0
    System.out.println(quickCereal.getSodium()); // prints 80
    System.out.println(quickCereal.getCups()); // prints 1.0
    System.out.println("\n-------------------------------------- \n");
    
    System.out.println(quickCereal.getProteinCalorieRatio()); // prints the protein - calories ratio
    System.out.println(bestCereal.getProteinCalorieRatio());
    System.out.println(cornFlakes.getProteinCalorieRatio());
  }

}
