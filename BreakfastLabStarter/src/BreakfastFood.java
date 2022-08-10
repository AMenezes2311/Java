/**
 * This goes with Activity 2, Question 6.
 * Copy all of this into Question 6 when complete.
 * After you create this class, you'll want to work on TestBreakfastFood.java
 * 
 * @author Andre Menezes
 *
 */
public class BreakfastFood
{
  // Instance variables go here. (look at your answers to question 5)
  private String name;
  private String type;
  private int calories;
  private int protein;
  private int fat;
  private int sodium;
  private int fiber;
  private int carbohydrates;
  private int sugar;
  private int potassium;
  private int vitamins;
  private int shelf;
  private double weight;
  private double cups;
  private double rating;

  // Constructor(s) go here
  public BreakfastFood(String initName, String initType, int initCalories,
    int initProtein, int initFat, int initSodium, int initFiber,
    int initCarbohydrates, int initSugar, int initPotassium, int initVitamins,
    int initShelf, double initWeight, double initCups, double initRating)
  {
    name = initName;
    type = initType;
    calories = initCalories;
    protein = initProtein;
    fat = initFat;
    sodium = initSodium;
    fiber = initFiber;
    carbohydrates = initCarbohydrates;
    sugar = initSugar;
    potassium = initPotassium;
    vitamins = initVitamins;
    shelf = initShelf;
    weight = initWeight;
    cups = initCups;
    rating = initRating;
  }

  // Accessor methods
  public String getName()
  {
    return name;
  }

  public String getType()
  {
    return type;
  }

  public int getCalories()
  {
    return calories;
  }

  public int getProtein()
  {
    return protein;
  }

  public int getFat()
  {
    return fat;
  }

  public int getSodium()
  {
    return sodium;
  }

  public int getFiber()
  {
    return fiber;
  }

  public int getCarbohydrates()
  {
    return carbohydrates;
  }

  public int getSugar()
  {
    return sugar;
  }

  public int getPotassium()
  {
    return potassium;
  }

  public int getVitamins()
  {
    return vitamins;
  }

  public int getShelf()
  {
    return shelf;
  }

  public double getWeight()
  {
    return weight;
  }

  public double getCups()
  {
    return cups;
  }

  public double getRating()
  {
    return rating;
  }

  public String getProteinCalorieRatio()
  {
    return name + " contains " + calories + " calories and " + protein
      + " amino acids\nThe rate is 1 amino acid to " + calories / protein
      + " calories";

  }

  // toString() method
  public String toString()
  {
    return "Name" + ": " + name + ", Type: " + type + ", Calories: " + calories
      + ", Protein: " + protein + ", Fat: " + fat + ", Sodium: " + sodium
      + ", Fiber: " + fiber + ", Carbohydrates: " + carbohydrates + ", Sugar: "
      + sugar + ", Potassium: " + potassium + ", Vitamins: " + vitamins
      + ", Shelf: " + shelf + ", Weight: " + weight + ", Cups" + cups
      + ", Rating: " + rating + ".";
  }
}
