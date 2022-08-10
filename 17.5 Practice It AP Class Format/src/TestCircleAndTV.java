/**
 * Preference file version 092020
 * 
 * @author: Andre Menzes
 */

public class TestCircleAndTV
{

  public static void main(String[] args)
  {
    System.out.println("Circle Test: Should be 1256.6370614359173");
    Circle bigBall = new Circle(20);
    System.out.println("Area is = " + bigBall.getArea());
    System.out.println("TV Test: Should be 44");
    TV bigScreen = new TV();
    bigScreen.turnOn();
    bigScreen.setChannel(42);
    // bigScreen.channel = 10;
    bigScreen.channelUp();
    bigScreen.channelUp();
    bigScreen.channelUp();
    bigScreen.channelDown();
    // you'll have to create getChannel accessor method.
    System.out.println("Current channel is = " + bigScreen.getChannel());

  }

}
