import java.util.Arrays;

public class newSortedArray {
	
	/*
	 * Given two sorted arrays A and B that may have repeated elements. Form a new
	 * sorted array C that contains the elements of A and B [Condition : You are not
	 * allowed to merge the two arrays and then sort. ]
	 */
	
	
	public static void main(String args[]) {
		int[] ar1 = { 1,3,5,7,9,11,45,67};
        int[] ar2 = { 2,4,6,8,9,11,34,56,789,789,999,1000};
        int[] result;
        int maxarrlen = (ar1.length > ar2.length) ? ar1.length : ar2.length ;
        int minarrlen = (ar1.length > ar2.length) ? ar2.length : ar1.length ;
        
        result = new int[maxarrlen+minarrlen];
        int counter = 0;
        int total=maxarrlen + minarrlen;
        for (int i = 0; i < maxarrlen; i++)
        {
            if (i < minarrlen)
            {
                if (ar1[i] >= ar2[i])
                {
                    result[counter++] = ar2[i];
                    result[counter++] = ar1[i];
                }
                else
                {
                    result[counter++] = ar1[i];
                    result[counter++] = ar2[i];
                }
            }
            else
            {
                result[counter++] = ar2[i];
            }
        }
       
        System.out.print(Arrays.toString(result));

}
}