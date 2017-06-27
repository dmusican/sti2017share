public class ParameterExample {

   public static void method1(int b) {
      b = 7;
   }

   public static void method2(Wrapper t) {
      t.value = 6;
      //t = new Wrapper();
      //t.value = 7;
   }
   
   public static void method3(String t) {
      t = "goodbye";
   }

   public static void main(String[] args) {
      int z = 9;
      System.out.println(z);
      method1(z);
      System.out.println(z);

      System.out.println();

      Wrapper w = new Wrapper();
      w.value = 5;
      System.out.println(w.value);
      method2(w);
      System.out.println(w.value);
      
      String s = "hello";
      method3(s);
      System.out.println(s);
   }
}
