import java.util.Scanner;

public class Human implements Player {
   private int playerNumber;
   
   public Human(int number) {
      playerNumber = number;
   }

   public int drawSticks() {
      System.out.print("Player " + playerNumber +
                       ", how many sticks?");
      Scanner input = new Scanner(System.in);
      return input.nextInt();
   }
   
   public void summarize() {
      System.out.println("Player " + playerNumber + 
                         ", you win!");
   }
}
