/**
 * Preference file version 092020
 * 
 * @author: Andre Menezes
 */

public class TV
{
  private int channel = 1; // Default channel is 1, Instance variable
  private int volumeLevel = 1; // Default volume level is 1, Instance variable
  private boolean on = false; // TV is off, Instance variable
  final static int MIN_VOLUME = 1; // Constant
  final static int MAX_VOLUME = 7; // Constant
  final static int MIN_CHANNEL = 1; // Constant
  final static int MAX_CHANNEL = 120; // Constant

  // Default constructor
  public TV()
  {
  }

  // Mutator method
  public void turnOn()
  {
    on = true;
  }

  // Mutator method
  public void turnOff()
  {
    on = false;
  }

  // Mutator method
  public void setChannel(int newChannel)
  {
    if (on && newChannel >= 1 && newChannel <= 120)
      channel = newChannel;
  }

  // Mutator method
  public void setVolume(int newVolumeLevel)
  {
    if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
      volumeLevel = newVolumeLevel;
  }

  // Mutator method
  public void channelUp()
  {
    if (on && channel < 120)
      channel++;
  }

  // Mutator method
  public void channelDown()
  {
    if (on && channel > 1)
      channel--;
  }

  // Mutator method
  public void volumeUp()
  {
    if (on && volumeLevel < 7)
      volumeLevel++;
  }

  // Mutator method
  public void volumeDown()
  {
    if (on && volumeLevel > 1)
      volumeLevel--;
  }

  // Accessor method
  public int getChannel()
  {
    return channel;
  }

  // Accessor method
  public int getVolumeLevel()
  {
    return volumeLevel;
  }
}
