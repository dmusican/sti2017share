public class SlowSorts {
   public static void main(String[] args) {
      int[] array = new int[5];
      for (int i=0; i < array.length; i++) {
         array[i] = (int)(Math.random()*10000);
      }
      
      for (Integer element : array) {
         System.out.print(element + " ");
      }
      System.out.println();
   }
}
      
      