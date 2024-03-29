
public class palindromest {
	
	public static void main(String args[]) {
		String s = "A man, a plan, a canal: Panama";
	    StringBuilder builder = new StringBuilder();

	    for (char ch : s.toCharArray()) {
	      if (Character.isLetterOrDigit(ch)) {
	        builder.append(Character.toLowerCase(ch));
	      }
	    }

	    String filteredString = builder.toString();
	    String reversedString = builder.reverse().toString();

	 System.out.println(filteredString.equals(reversedString));
	

}
	
	public boolean isPalindrome(String s) {
	    for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
	      while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
	        i++;
	      }
	      while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
	        j--;
	      }

	      if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
	        return false;
	    }

	    return true;
	  }
	



}
