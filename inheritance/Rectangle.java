public class Rectangle extends Shape {

   private double length;
   private double width;
   
   public Rectangle() {
      length = 3;
      width = 9;
   }
   
   public double area() {
      return length*width;
   }
   
   public double diagonalLength() {
      return Math.sqrt(Math.pow(length,2) + Math.pow(width,2));
   }
   
   public void getInfo() {
      System.out.println("I am a rectangle!");
   }
   
}