package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
	public static void main(String args[]) {
		int arr[] = {1,1,2};
		int a[] = new int[arr.length];
		HashSet<Integer> hs = new HashSet<>();
		
		for(int num: arr) {
		hs.add(num);	
			}
		
		int index = 0;

		
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext()) {
			a[index]= it.next();
			index++;
		}
		System.out.println(index);
		}
	}


