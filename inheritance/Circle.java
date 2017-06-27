public class Circle extends Shape {

   private double radius;
   
   public Circle() {
      radius = 4;
   }
   
   public double area() {
      return Math.PI * Math.pow(radius,2);
   }
   
   public void getInfo() {
      System.out.println("I am a circle!");
   }
   
}