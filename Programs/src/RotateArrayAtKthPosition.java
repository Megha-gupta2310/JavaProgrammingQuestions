import java.util.Arrays;

public class RotateArrayAtKthPosition {

	public static void main(String args[]) {
	int nums[] = {1,2,3,4,5,6,7};
	int k = 3;
	int count= 0;
	
	while(count<k) {
		int previous = nums.length-1;
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			temp = nums[previous];
			nums[previous] = nums[i];
			nums[i]=temp;
			
		}
		count++;
		
	}
	
	System.out.print(Arrays.toString(nums));

}
}