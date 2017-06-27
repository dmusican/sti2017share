import java.util.ArrayList;

public class Collections {
   public static void main(String[] args) {
   
      //arrays
      int[] nums = new int[5];
      for (int i=0; i < nums.length; i++) {
         nums[i] = i*i;
      }
      
      // ArrayLists
      ArrayList<String> mydata = new ArrayList<String>();
      for (int i=0; i < 5; i++) {
         mydata.add("Your number is : " + i);
      }
      
      for (int i=0; i < 5; i++) {
         System.out.print(mydata.get(i) + " ");
      }
   }
}