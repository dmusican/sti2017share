public class Examples {
   
   // 1. Base case
   // 2. Recursive step
 
   public static int factorial(int n) {

      if (n == 1) {
         return 1;  
      } else {
         return n * factorial(n-1);
      }
   }
      
  
   public static String reverseString(String s) {
      
      if (s.length() == 1) {
         return s;
      } else {
         return reverseString(s.substring(1)) + s.substring(0,1);
      }   
   }
   
   // Iteratively do exponentation
   public static int iterativeExp(int base, int power) {
      int answer = 1;
      for (int i=0; i < power; i++) {
         answer = answer * base;
      }
      return answer;
   }
   
   public static int recursiveExp(int base, int power) {
      if (power == 0) {
         return 1;
      //} else if (power == 1) {
      //   return base;
      } else if (power % 2 == 1) {
         // power is odd
         return base * recursiveExp(base, power-1);
      } else {
         // power is even
         int halfPower = power / 2;
         int partialAnswer = recursiveExp(base, halfPower);
         return partialAnswer * partialAnswer;
      }
   }
   
   
   public static void main(String[] args) {
   
      System.out.println(factorial(3));
      System.out.println(reverseString("friend"));
      System.out.println(iterativeExp(2,5));
      System.out.println(recursiveExp(2,5));
      System.out.println(recursiveExp(2,10));
      
   }
}