import org.junit.runner.notification.StoppedByUserException;

import java.util.Random;

class Main
{
  public static void main(String[] args)
  {
    // Example calling the roll() method
      int oneCount = 0;
      int twoCount = 0;
      int threeCount = 0;
      int fourCount = 0;
      int fiveCount = 0;
      int sixCount = 0;


      for (int i=0; i< 100; i++){
            roll();
          System.out.println(" Roll ["+ i + "]: " + roll());
          if (roll() == 1){
              oneCount ++;
          }
          else if (roll() == 2)
              twoCount++;
          else if (roll() == 3)
              threeCount++;
          else if (roll() == 4)
              fourCount++;
          else if (roll() == 5)
              fiveCount++;
          else if (roll() == 6)
              sixCount++;
   }
      System.out.println("Final Roll Counts");
      System.out.println("[1]: " + oneCount);
      System.out.println("[2]: " + twoCount);
      System.out.println("[3]: " + threeCount);
      System.out.println("[4]: " + fourCount);
      System.out.println("[5]: " + fiveCount);
      System.out.println("[6]: " + sixCount);


  }
  
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
}