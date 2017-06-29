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
   
   
    // Kick it all off
   public static void mergeSort(int[] array)
   {
      int[] tempArray = new int[array.length];
      mergeSort(array,tempArray,0,array.length-1);
   }
   
   // Recursive method that outlines the procedure
   private static void mergeSort(int[] array, int[] tempArray,
                 int left, int right)
   {
      if (left < right)
      {
         int center = (left + right) / 2;
         mergeSort(array, tempArray, left, center);
         mergeSort(array, tempArray, center+1, right);
         merge(array, tempArray, left, center+1, right);
      }
   }
   
   // Workhorse: Merge together two sorted runs of integers: one starting
   // at leftStart, and ending at rightStart-1; the second starting at
   // rightStart, and ending at rightEnd
   private static void merge(int array[], int tempArray[],
                             int leftStart, int rightStart, int rightEnd) {
      int leftEnd = rightStart - 1;
      int left = leftStart;
      int right = rightStart;
      int temp = 0;  // index into temp array
   
       // Start merging until one of the halves is exhausted
      while (left <= leftEnd && right <= rightEnd) {
         if (array[left] <= array[right])
         {
            tempArray[temp] = array[left];
            left = left+1;
         }
         else
         {
            tempArray[temp] = array[right];         
            right = right+1;
         }
         temp = temp+1;
      }
   
       // If above loop exits, either left half or right half is
       // done. Finish copying other half that's not done.
   
       // If left half is not done
   
      while (left <= leftEnd)
      {
         tempArray[temp] = array[left];
         temp = temp + 1;
         left = left + 1;
      }
   
      // If right half is not done
      while (right <= rightEnd)
      {
         tempArray[temp] = array[right];
         temp = temp + 1;
         right = right + 1;
      }
   
       // Copy temp array over original array
   
      for (int i=0; i < rightEnd - leftStart + 1; i++)     
         array[leftStart + i] = tempArray[i];
   
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
    
      // Display values  
      for (int element : array) {
         System.out.print(element + " ");
      }

      selectionSort(array);
      testSorted(array);
      
      // Display values  
      for (int element : array) {
         System.out.print(element + " ");
      }
       
      System.out.println();
   }
}
      
