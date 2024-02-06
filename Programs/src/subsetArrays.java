import java.util.HashMap;
import java.util.Map;

public class subsetArrays {

	public static void main(String[] args) {
		int[] S1 = {1,5,4,6,8,2};
		int[] S2 = {5,8,2};
		int[] S3 = {5,8,2,7};
		
		Map<Integer, Integer> map = new HashMap();
		for(int i=0;i<S1.length;i++)
		{
			map.put(S1[i], 1);
		}
		
		for(int i=0;i<S2.length;i++)
		{
			if(!map.containsKey(S2[i]))
				System.out.println("S2 is not subset");
		}
		
		for(int i=0;i<S3.length;i++)
		{
			if(!map.containsKey(S3[i]))
				System.out.println("S3 is not subset");
		}


	}

}