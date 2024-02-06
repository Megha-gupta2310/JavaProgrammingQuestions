import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class stringStrongDifference {
	
	
	/*
	 * Write the test cases for below logic. i/p: string, strong o/p: strng
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "String";
		String y = "Strong";
		Set<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < x.length(); i++) {
			//System.out.println(y.indexOf(x.charAt(i)));
			if (y.indexOf(x.charAt(i)) != -1) {
				set.add(x.charAt(i));
			}
		}

		Iterator<Character> it = set.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}
}