import java.util.ArrayList;

public class Collections {
   public static void main(String[] args) {
   
      //arrays
      String[] things = new String[5];
      for (int i=0; i < things.length; i++) {
         things[i] = "Your number is : " + i;
      }

      for (int i=0; i < nums.length; i++) {
         System.out.println(things[i]);
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