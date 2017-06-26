public class Die {

   // instance variables
   private int top;
   private int sides;
   
   public Die() {
      sides = 6;
   }
   
   // constructor
   public Die(int numSides) {
      sides = numSides;
   }
   //public Die(int sides) {
   //   this.sides = sides;
   //}
      
   // public methods
   public void roll() {
      top = (int)(Math.random()*sides+1);
   }
   
   public int onTop() {
      return top;
   }
   
   public void sayHello(int n) {
      for (int i=0; i < n; i++) {
         System.out.println("I am a die.");
      }
   }

}