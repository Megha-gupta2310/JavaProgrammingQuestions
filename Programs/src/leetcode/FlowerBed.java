package leetcode;

public class FlowerBed {

	
	public static void main(String args[]) {
		int flowerbed[] = {1,0,0,0,1};
	    int n = 2;
	    int j = 0;
	    boolean b = false;

	    for (int i = 0; i < flowerbed.length; i++) {
	        if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) && flowerbed[i] == 0) {
	            b = true;
	            j++;
	            i++;  // Skip the next plot since you can't plant in adjacent plots
	        } else {
	            b = false;
	        }

	        if (j >= n) {
	            break;  // We have planted enough flowers
	        }
	    }

	    System.out.println(b);
	}}