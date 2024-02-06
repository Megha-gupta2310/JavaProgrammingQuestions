
public class fibonacci {
	 public static void main(String args[]) {
		 int N = 10;
		 fib(N);
	        
	    }

	 public static int fib(int N) {
	       int t1 = 0 ,t2 = 1;
	        int sum = 0;
	        if (N==0) {
	        	System.out.println(t1);
	        	return t1;}
	        if (N==1) {
	        	System.out.println(t2);
	        	return t2;
	        }
	        else {
	        for (int i = 1; i <N; i++)
	        	
	        {
	           sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	       System.out.println(sum);
	        return sum; 
	    }
			}
}
