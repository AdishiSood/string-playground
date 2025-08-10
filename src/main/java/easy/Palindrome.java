package main.java.easy;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(checkPalindrome(s)); // Should print: true

        String s2 = "hello";
        System.out.println(checkPalindrome(s2)); // Should print: false
    }

    /**
     * Checks if a string is a palindrome using two-pointer technique.
     * Time Complexity: O(n/2) = O(n), Space Complexity: O(1)
     *
     * @param str the input string to check
     * @return true if palindrome, false otherwise (null/empty considered palindrome)
     */
    public static boolean checkPalindrome(String str) {
        // Handle edge cases: null or empty strings are considered palindromes
        if (str == null || str.isEmpty()) {
            return true;
        }

        // Initialize two pointers
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends moving towards center
        while (left < right) {
            // If characters don't match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;   // Move left pointer forward
            right--;  // Move right pointer backward
        }

        // If we've checked all pairs, and they match, it's a palindrome
        return true;
    }
}