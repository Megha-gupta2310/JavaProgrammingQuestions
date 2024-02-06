package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class FindAllNumbersDisappearedinaArray {
   public static void main(String args[]) {
	   int nums[] = {4,3,2,7,8,2,3,1};
	   
	   Arrays.sort(nums);
	   int j=1;
	   List<Integer> missingNumbers = new ArrayList<>();
	  for(int i=0;i<nums.length;i++) {
		  
		  while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
              i++;
          }
		  if(j!=nums[i]) {
			  while (j < nums[i]) {
                  missingNumbers.add(j);
                  j++;
              }
		  }
		  
		  j++;
	  }
	  
	  System.out.println(missingNumbers);
   }
}
