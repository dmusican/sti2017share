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
   
   public static void selectionSort(int[] array) {
      int smallestPos;
      
      for (int i=0; i < array.length-1; i++) {
         smallestPos = i;
         for (int j=i+1; j < array.length; j++) {
            if (array[j] < array[smallestPos]) {
               smallestPos = j;
            }
         }
         swap(array, smallestPos, i);
      }
  }


   public static void insertionSort(int[] array) {
      for (int i = 1; i < array.length; i++) {
         int j = i;
         while (j > 0 && array[j-1] > array[j]) {
            swap(array,j,j-1);
            j--;
         }
      }
   }
   
   public static void insertionSortOptimized(int[] array) {
      for (int i = 1; i < array.length; i++) {
         int j = i;
         int swapVal = array[i];
         while (j > 0 && array[j-1] > swapVal) {
            array[j] = array[j-1];
            j--;
         }
         array[j] = swapVal;
      }
   }
   
   
   
   
   
   
   
   public static void testSorted(int[] array) {
      for (int i=0; i < array.length-1; i++) {
         if (array[i] > array[i+1]) {
            System.out.println("Not sorted!");
            return;
         }
      }
      System.out.println("Sorted!");
   }
   
    

   public static void main(String[] args) {
      int[] array = new int[500];
      
      // Generate random values
      for (int i=0; i < array.length; i++) {
         array[i] = (int)(Math.random()*10000);
      }
    
      insertionSortOptimized(array);
      testSorted(array);
      
      // Display values  
      /*for (int element : array) {
         System.out.print(element + " ");
      }*/
       
      System.out.println();
   }
}
      
      