/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class UniqueOccurences {
  public static void main(String[] args) {
 int  arr[] = {1,2,2,1,3};


 HashMap<Integer,Integer> hs = new HashMap<>();

 for(int num: arr){
  hs.put(num, hs.getOrDefault(num, 0)+1);
 }

 System.out.println(hs);

 HashSet<Integer> ht = new HashSet<>();

   for(Map.Entry<Integer, Integer> e: hs.entrySet()){
    ht.add(e.getValue());
   }

  if(ht.size()==hs.size()) {
	  System.out.println(true);
  }
  
 
 


  }}

  



// Your previous Plain Text content is preserved below:

// This is just a simple shared plaintext pad, with no execution capabilities.

// When you know what language you'd like to use for your interview,
// simply choose it from the dots menu on the tab, or add a new language
// tab using the Languages button on the left.

// You can also change the default language your pads are created with
// in your account settings: https://app.coderpad.io/settings

// Enjoy your interview!