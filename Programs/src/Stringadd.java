import java.util.Arrays;

public class Stringadd {
  public static void main(String args[]) {
	int arr[] = {1,2,3,4};
	int temp = arr[arr.length-1];
		
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				temp += arr[j];
//
//			}
//			arr[i] = temp;
//			temp = 0;
//		}
//		System.out.println(Arrays.toString(arr));
//	
		
		for (int i = arr.length - 2; i > -1; i--) {

			int t = arr[i];
			arr[i] = temp;
			temp += t;
		}
		System.out.println(Arrays.toString(arr));
		 

    }}
