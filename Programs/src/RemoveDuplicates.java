import java.util.Arrays;

public class RemoveDuplicates {
	public static void main (String args[]) {
		 int a[] = {2,3,3,4,5,6};
//		 int n = a.length;
//	        int[] temp = new int[n];  
//	        int j = 0;  
//	        for (int i=0; i<n-1; i++){  
//	            if (a[i] != a[i+1]){  
//	            	temp[j++] = a[i];  
//	            }  
//	         }  
//	        temp[j++] = a[n-1];     
//	        // Changing original array  
//	        for (int i=0; i<j; i++){  
//	            a[i] = temp[i];  
//		 }
		 
		 
		 int j=1;
	        for(int i =1;i<a.length;i++){
	            if(a[i-1]!=a[i]){
	                a[j]= a[i];
	                j++;
	        
	        System.out.println(j);
	}


}}}
