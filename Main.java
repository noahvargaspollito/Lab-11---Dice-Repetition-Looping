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
            int random = roll();

            System.out.println("Roll " + (i + 1) + ": [" + roll() + "]");

          if (roll() == 1){
              oneCount ++;
          }
          else if (random == 2)
              twoCount++;
          else if (random == 3)
              threeCount++;
          else if (random == 4)
              fourCount++;
          else if (random == 5)
              fiveCount++;
          else if (random == 6)
              sixCount++;
   }
      System.out.println("Final Roll Counts:");
      System.out.println("[1]: " + oneCount + " times");
      System.out.println("[2]: " + twoCount + " times");
      System.out.println("[3]: " + threeCount + " times");
      System.out.println("[4]: " + fourCount + " times");
      System.out.println("[5]: " + fiveCount + " times");
      System.out.println("[6]: " + sixCount + " times");


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