package main.java.org.easy;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(reverse(s));
    }
    /**
     * Reverses a string using the two-pointer approach.
     * Time Complexity: O(n), Space Complexity: O(n) for char array
     *
     * @param str the input string to reverse
     * @return reversed string, or "String is Empty" if input is null/empty
     */
    public static String reverse(String str) {
        // Handle edge cases: null or empty strings
        if (str == null || str.isEmpty()) {
            return "String is Empty";
        }
        // Initialize two pointers: start and end of string
        int left = 0;
        int right = str.length() - 1;
        // Convert to mutable character array for in-place swapping
        char[] ch = str.toCharArray();
        // Swap characters from both ends moving towards center
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;  // Move left pointer forward
            right--; // Move right pointer backward
        }
        // Convert character array back to string
        return new String(ch);
    }
}