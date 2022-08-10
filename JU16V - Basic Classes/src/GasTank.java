/**
 * This represents a car's gasTank. The two properties
 * of a gasTank are the amount of gas and the capacity of
 * the gas tank.
 * 
 * @author Andre Menezes
 * @verison 2.0 Fixed constructor parameter.
 */

public class GasTank
{
  // Gas tank has two instance variables (fields, attributes etc)
  // that keeps track of the amount of gasoline
  // in the tank and it's total capacity. They can be decimals.
  // TODO: Add code here.
  private double gasAmount;
  private double totalCapacity;

  /**
   * Constructor that sets the maximum capacity of the
   * gas tank. The amount of gas is set to zero.
   */
  public GasTank(double maxCapacityOfGasTank)
  {
    // TODO: Add code here.
    // The job of constructor is to initialize all instance variables.
    gasAmount = 0;
    totalCapacity = maxCapacityOfGasTank;
  }

  /**
   * bumps up the amount of gas in the gas tank by amount,
   * but will not exceed the capacity of the gas tank.
   * 
   * @param amount
   */
  public void addGas(double amount)
  {
    // TODO: Add code here.
    if (gasAmount + amount <= totalCapacity)
      gasAmount += amount;
  }

  /**
   * Removes the gas from the gas tank by amountUsed. You can't have negative
   * gas!! so if the client uses more than what's in the tank then keep it zero.
   * 
   * @param amountUsed
   */
  public void useGas(double amountUsed)
  {
    // TODO: Add code here.
    if (amountUsed > gasAmount)
      gasAmount = 0;
    else
      gasAmount -= amountUsed;
  }

  /**
   * Tank is empty if we have less than 0.1 gallons of gas. So person has chance
   * to run to the gas station before they are really out.
   * 
   * @return
   */
  public boolean isEmpty()
  {
    // TODO: Add code here.
    if (gasAmount < 0.1)
      return true;
    else
      return false;
  }

  /**
   * The gas tank is full if the amount
   * is within 0.1 gallons of the total capacity of the tank.
   * 
   * @return
   */
  public boolean isFull()
  {
    // TODO: Add code here.
    if (gasAmount >= totalCapacity - 0.1)
      return true;
    else
      return false;
  }

  /**
   * Fills up the tank but ALSO returns the
   * amount of gas it took to fill up the tank to capacity.
   * Remember there might already be some gas in the tank.
   * 
   * @return
   */
  public double fillUp()
  {
    // TODO: Add code here.
    double gasAdded = totalCapacity - gasAmount;
    gasAmount = totalCapacity;
    return gasAdded;
  }

  /**
   * Just a simple getter that returns the amount of gas in the gas tank.
   * 
   * @return
   */
  public double getGasLevel()
  {
    // TODO: Add code here.
    return gasAmount;
  }

}
