import java.util.ArrayList;

public class History {

   public static void main(String[] args) {
   
      // Java 4, back in the day
      ArrayList mylist = new ArrayList();
      mylist.add("hello");
      mylist.add("goodbye");
      
      String word = (String)(mylist.get(0));
      
      // Java 5, with generics
      ArrayList<String> otherlist = new ArrayList<String>();
      otherlist.add("hello");
      otherlist.add("goodbye");
      String otherword = mylist.get(0);
  }
}