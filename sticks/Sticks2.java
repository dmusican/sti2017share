import java.util.Scanner;

public class Sticks2 {
   public static void main(String[] args) {
      int sticks = 10;
      int turn = 1;
      Scanner input = new Scanner(System.in);

      Player player1 = new Human();
      Player player2 = null;
            
      System.out.println("Against computer or human? ");
      String response = input.next();
      if (response.equals("computer")) {
         player2 = new AI();
      } else {
         player2 = new Human();
      }
      
      Player currentPlayer = player1;
      while (sticks > 0) {
         int sticksDrawn = currentPlayer.drawSticks();

         if (sticksDrawn >= sticks) {
            break;
         }
         
         sticks = sticks - sticksDrawn;
         
         System.out.println("Sticks left = " + sticks);

         if (currentPlayer == player1) {
            currentPlayer = player2;
         } else {
            currentPlayer = player1;
         }         
      }

      currentPlayer.summarize();      
   }
}
         
      