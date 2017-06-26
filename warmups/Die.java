public class Die {

   // instance variables
   private int top;
    
   // public methods
   public void roll() {
      top = (int)(Math.random()*6+1);
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