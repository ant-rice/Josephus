import java.util.*;
import java.io.*;

public class JosephusSim {
   private PersonNode circle;     // a PersonNode pointer that tracks first node
   private int size;              // the number of people in the circle
   private int eliminationCount;  // the number to count to for elimination       
   private PersonNode track;      // a PersonNode pointer to help with elimination

   public JosephusSim(String fileName) {
      try {
         // load names from the file in order, generating a singly linked list of PersonNodes
         Scanner file = new Scanner(new File(fileName));
         while(file.hasNextLine()) {
            String name = file.nextLine();
            
            add(name);
            size++;
         }
         // make the ring circular by attaching last node's next to front
         track.next = circle;
         // remember the last node as the one in front of the next to get eliminated
         
         // generate, print, and save the random elimination count
         
         Random r = new Random();
         eliminationCount = r.nextInt(size) + 1;
         System.out.println("=== Elimination count is " + eliminationCount + " ===");

         
      } catch(FileNotFoundException e) {
         System.out.println("Something went wrong with " + fileName);
      }
   }
   
   // optional helper method for constructing the circle
   private void add(String val) {
      PersonNode newNode = new PersonNode(val);
      if (circle == null) {
         track = newNode;
         circle = newNode;
      } else {
         track = newNode;
         circle = newNode;
      }
   }
   
   public void eliminate() {
      // count to the elimination count
      int eliminating;
      for(int i = 0; i < eliminationCount - 1; i++) {
         track = circle(i);
      }
      // print who will be eliminated
      System.out.println(track + " eliminated!");
      // eliminate the person and update "front" of the circle and size
      remove.track;
      track = newNode;
   }
   
   public boolean isOver() {
      // check if there's only one person left in the circle
      return false;
   }
   
   public String toString() {
      // if there's only one person left, print them as the last survivor
      
      // print the remaining survivors (watch out for infinite loop since list is circular)

      return "";
   }

}