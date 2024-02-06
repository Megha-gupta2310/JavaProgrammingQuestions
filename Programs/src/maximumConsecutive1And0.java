import java.util.Arrays;

public class maximumConsecutive1And0 {
	
	/*
	 * Find the maximum consecutive 1's in an array of 0's and 1's. Example: a)
	 * 00110001001110 - Output :3 [Max num of consecutive 1's is 3] b) 1000010001 -
	 * Output :1 [Max num of consecutive 1's is 1]
	 */	
	public static void main (String args[]){
		
		int arr[] = {0,0,1,1,0,0,0,1,0,0,1,1,1,0};
		int count = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 0)
				count = 0;
			else
				count++;
			max = count > max ? count : max;
		}
		System.out.print(max);
	}

}
