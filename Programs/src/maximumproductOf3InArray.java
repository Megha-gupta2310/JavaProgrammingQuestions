
public class maximumproductOf3InArray {
	
	//public static void main(String[] args) {
		
		
		
		
//		int[] a= {-1,-2, 1,2,3,5,-9};
//		int maxProd =0, temp, i1=0, i2=0, i3=0;
//		
//		for(int i=0; i<a.length; i++) {
//			for(int j=i+1; j<a.length; j++) {
//				for(int k=j+1; k<a.length; k++) {
//					temp = a[i] * a[j] * a[k];
//					if(temp>maxProd) {
//						maxProd = temp;
//						i1 = a[i];
//						i2 = a[j];
//						i3 = a[k];
//					}
//				}
//			}
//		}
//		System.out.println("Max product is " + maxProd + " with values: " + i1 + " * " + i2 + " * " + i3);
	
	
	/* Find the max poduct value of 3 number from the given array . */
	    public static void main(String args[]) {
	    	int[] nums =  {-1, 2, 3, -4, -5, -2, -8, -4};
	        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
	        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
	        for (int n: nums) {
	            if (n <= min1) {
	                min2 = min1;
	                min1 = n;
	            } else if (n <= min2) {     // n lies between min1 and min2
	                min2 = n;
	            }
	            if (n >= max1) {            // n is greater than max1, max2 and max3
	                max3 = max2;
	                max2 = max1;
	                max1 = n;
	            } else if (n >= max2) {     // n lies betweeen max1 and max2
	                max3 = max2;
	                max2 = n;
	            } else if (n >= max3) {     // n lies betwen max2 and max3
	                max3 = n;
	            }
	        }
	        System.out.print(Math.max(min1 * min2 * max1, max1 * max2 * max3));
	    }
	
	}

