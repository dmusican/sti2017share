/*public interface Shape {
   double area();
   void getInfo();
   void speakUp();
}*/

public abstract class Shape {
   public abstract double area();
   public abstract void getInfo();
   public void speakUp() {
      System.out.println("I will make you happy!");
   }
}
