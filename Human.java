public class Human implements Player {
   public int drawSticks() {
      System.out.print("Player, how many sticks?");
      Scanner input = new Scanner(System.in);
      return input.nextInt();
   }
   
   public void summarize() {
      System.out.println("Player, you win!");
   }
}
