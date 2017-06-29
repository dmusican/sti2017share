public class Examples {
   
   // 1. Base case
   // 2. Recursive step
 
   public static int factorial(int n) {

      if (n == 1) {
         return 1;  
      } else {
         return n * factorial(n-1);
      }
      
  
   public static String reverseString(String s) {
      
      if (s.length() == 1) {
         return s;
      } else {
         return reverseString(s.substring(1)) + s.substring(0,1);
      }
   
   
   }
   
   public static void main(String[] args) {
   
      System.out.println(factorial(3));
      System.out.println(reverseString("friend"));
      
   }
}