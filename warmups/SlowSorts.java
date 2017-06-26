public class SlowSorts {
   public static void swap(int[] values, int i, int j) {
      int temp = values[i];
      values[i] = values[j];
      values[j] = temp;
   }
      
   
   public static void bubbleSort(int[] array) {
      for (int i=0; i < array.length - 1; i++) { 
         for (int j = 0; j < array.length - 1 - i; j++) {
            if (array[j] > array[j+1]) {
               swap(array, j, j+1);
            }
         }
      }
   }



   public static void main(String[] args) {
      int[] array = new int[5];
      
      // Generate random values
      for (int i=0; i < array.length; i++) {
         array[i] = (int)(Math.random()*10000);
      }
    
      bubbleSort(array);
      
      // Display values  
      for (int element : array) {
         System.out.print(element + " ");
      }
       
      System.out.println();
   }
}
      
      