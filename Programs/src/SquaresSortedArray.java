import java.util.Arrays;

public class SquaresSortedArray {
	
	 public static void main(String args[]) {
		 int A[] = {-4,-1,0,3,10};
		 sortedSquares(A);
		 
	        
	    }
	
	 public static int[] sortedSquares(int[] A) {
     int[] arr = new int[A.length];
      int j = 0;
     for(int i=0;i<A.length;i++){
      arr[j] = A[i] * A[i];
         j++;
         
     }
     Arrays.sort(arr);
     System.out.print(Arrays.toString(arr));
	 return arr;
     
 }

}
