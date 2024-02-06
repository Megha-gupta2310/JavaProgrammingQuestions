public class nearestPalindrome {
    public static String nearestPalindromic(int n) {
        //long num = Long.parseLong(n);
        for (long i = 1;; i++) {
            if (isPalindrome(n - i))
                return "nearrest palindrome " + (n - i);
            if (isPalindrome(n + i))
                return "nearrest palindrome " + (n + i);
        }
    }
    static boolean isPalindrome(long num) {
    	long reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        return originalInteger == reversedInteger;
    }
    
    public static void main(String args[]) {
    	int n = 115;
    	System.out.println(nearestPalindromic(n));
    	
    }
}