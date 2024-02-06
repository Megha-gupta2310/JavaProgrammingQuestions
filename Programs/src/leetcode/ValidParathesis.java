package leetcode;

import java.util.Stack;

public class ValidParathesis {
	
	public static void main (String args[]) {
		
		String s =  "{()}";
		
		Stack<Character> stack = new Stack<>();
		boolean bo = true;
		
		 for (char c : s.toCharArray()){
			 if (c == '(' || c == '[' || c == '{') {
	                stack.push(c);
	            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	                stack.pop();
	            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	                stack.pop();
	            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	                stack.pop();
	            } else {
	            	bo =false;
	                
	            }
	        }
		 
		 System.out.println(stack.isEmpty());
		 
		 
		
		
				
		
		
	}

}
