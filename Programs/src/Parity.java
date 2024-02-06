import java.util.Arrays;

public class Parity {
	 public static void main(String args[]) {
		 int A[] = {1,4,4,3,0,3};
		 sortArrayByParity(A);
		 sortArrayByParityII(A);
		 
	        
	    }
	 
	 public static int[] sortArrayByParity(int[] A) {
		 int[] arr = new int[A.length];
	        int count = 0;
	        int dcount = A.length-1;
	        for(int i =0;i<A.length;i++){
	            if(A[i]%2==0 && count<dcount){
	                arr[count] = A[i];
	                count++;
	                
	            }
	            else{
	                arr[dcount] = A[i];
	                    dcount--;
	            }
	        }
	        System.out.print(Arrays.toString(arr));
			return arr;
	 } 
	 
	 public static int[] sortArrayByParityII(int[] A) {
         int[] arr = new int[A.length];
	        int count = 0;
	        int dcount = 1;
	        for(int i =0;i<A.length;i++){
	            if(A[i]%2==0){
	                arr[count] = A[i];
	                count += 2;
	                
	            }
	            else{
	                arr[dcount] = A[i];
	                    dcount +=2 ;
	            }
	        }
	        System.out.print(Arrays.toString(arr));
			return arr;
    }

	}