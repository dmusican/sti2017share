public class Game {
   public static void main(String[] args) {
      Die die1 = new Die();
      Die die2 = new Die(20);
      die1.roll();
      System.out.println(die1.onTop());
      die2.roll();
      System.out.println(die2.onTop());
      die1.sayHello(3);
   }
}