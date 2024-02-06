import java.util.PriorityQueue;

public class KthLargestElement {
	
	
	public int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	    for(int i: nums){
	        q.offer(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	 
	    return q.peek();
	}
	
	
	public static void main(String args[]) {
		
		int nums[] = {2,7,1,6,5};
		int k =2;
		KthLargestElement kio = new KthLargestElement();
		System.out.println(kio.findKthLargest( nums,k));
	}

}
