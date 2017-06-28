import java.util.Scanner;

public class Sticks {
   public static void main(String[] args) {
      int sticks = 10;
      int turn = 1;
      Scanner input = new Scanner(System.in);

      while (sticks > 0) {
         if (turn == 1) {
            System.out.println("Player 1: how many sticks?");
         } else if (turn == 2) {
            System.out.println("Player 2: how many sticks?");
         }
         int sticksDrawn = input.nextInt();
         
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
         
      