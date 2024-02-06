
public class ReverseStringwithStringBuffer {
	
	public static void main(String args[]) {
		String s = "Let's take LeetCode contest";
		StringBuilder res = new StringBuilder();
		String words[] = s.split(" ");
		for(String word:words) {
			res.append(new StringBuffer(word).reverse().toString()+ " ");
			
		}
		
		System.out.println(res.toString().trim());
	}

}
