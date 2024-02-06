import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesHaspmap {
	public static void main(String args[]) {
	int arr[] = {2,3,4,5,2,5};
	HashMap<Integer,Boolean>mp = new HashMap<>();
	
    for(int i=0;i<arr.length;i++) {
    	//System.out.println(mp.get(arr[i]));
    	if(mp.get(arr[i])==null)
    		
    			System.out.print(arr[i]);
    	mp.put(arr[i],true);
    	
    }
    
}
	}
