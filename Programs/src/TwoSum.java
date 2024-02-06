import java.util.Arrays;

public class TwoSum {

	
	public static void main (String args[]) {
		int n[] = new int[2];
		int nums[]= {3,2,3};
		int target = 6;
		if(nums.length>2) {
		for(int i =0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target) {
            n[0] = i;
            n[1] = j;}
        }}}else {
		
		n[0]=0;
		n[1]=1;
		
	}
		
		System.out.print(Arrays.toString(n));
}
}