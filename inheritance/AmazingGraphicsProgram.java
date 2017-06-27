public class AmazingGraphicsProgram {
   public static void main(String[] args) {
      Rectangle r = new Rectangle();
      System.out.println(r.diagonalLength());
      
      Shape s;   
      if (Math.random() > 0.5) {
         s = new Circle();
      } else {
         s = new Rectangle();
      }
      System.out.println(s.area());
      s.getInfo();
      s.speakUp();
      //System.out.println(((Rectangle)s).diagonalLength());
   }
}