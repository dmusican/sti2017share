public class SlowSorts {
   public static void main(String[] args) {
      int[] array = new int[5];
      for (int i=0; i < array.length; i++) {
         array[i] = (int)(Math.random()*10000);
      }
      
      for (int element : array) {
         System.out.print(element + " ");
      }
      
      for (int i=0; i < 5; i++) {
         System.out.println();
      }
      
      System.out.println();
   }
}
      
      