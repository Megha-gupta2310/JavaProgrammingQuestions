import java.util.Arrays;

public class BubbleSort {

public static void main(String args[]) {
      int arr[] = {2,7,1,6,7,2,3};
      for (int i=0;i<arr.length-1;i++) {
    	  for(int j=i;j<arr.length;j++) {
    		  if(arr[i]>arr[j]) {
        		  int temp = arr[i];
        		  arr[i]=arr[j];
        		  arr[j]=temp;
    	  }
    	  }
      }
      System.out.println(Arrays.toString(arr));
}



}
