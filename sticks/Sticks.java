import java.util.Scanner;

public class Sticks {
   public static void main(String[] args) {
      int sticks = 10;
      int turn = 1;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Against computer or human? ");
      String response = input.next();
      boolean ai = false;
      if (response.equals("computer")) {
         ai = true;
      }

      while (sticks > 0) {
         int sticksDrawn = 0;
         if (turn == 1) {
            System.out.print("Player 1: how many sticks? ");
            sticksDrawn = input.nextInt();         
         } else if (turn == 2 && !ai) {
            System.out.print("Player 2: how many sticks? ");
            sticksDrawn = input.nextInt();         
         } else if (turn == 2 && ai) {
            System.out.print("Computer is choosing...");
            sticksDrawn = 1;
         }
         if (sticksDrawn >= sticks) {
            break;
         }
         
         sticks = sticks - sticksDrawn;
         
         System.out.println("Sticks left = " + sticks);
         
         if (turn == 1) {
            turn = 2;
         } else {
            turn = 1;
         }
      }
      
      if (turn == 1) {
         System.out.println("Player 1 lost.");
      } else {
         System.out.println("Player 2 lost.");
      }
   }
}
         
      