package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class GreatestCommonDivisorStrings {
    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";

        String gcd = findGCD(str1, str2);

        System.out.println("Greatest Common Divisor: " + gcd);
    }

    public static String findGCD(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            // If the strings do not have the same repeated pattern, return an empty string
            return "";
        }

        // Use Euclidean algorithm to find GCD of lengths
        int len1 = str1.length();
        int len2 = str2.length();

        while (len2 != 0) {
            int temp = len2;
            len2 = len1 % len2;
            len1 = temp;
        }

        // Extract the substring of length GCD from either string
        return str1.substring(0, len1);
    }
}

