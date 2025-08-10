package main.java.leetcode;

import java.util.Arrays;

/**
 * LeetCode 344: Reverse String
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString344 {
    public static void main(String[] args) {
        // Test case matching LeetCode format
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        // Show input in LeetCode format
        System.out.println("Input: " + Arrays.toString(s));
        reverseString(s);
        System.out.println("Output: " + Arrays.toString(s));
    }

    /**
     * LeetCode 344: Reverse String
     * Reverses the input char array in-place using two-pointer technique.
     *
     * Time Complexity: O(n) where n is the length of the array
     * Space Complexity: O(1) - only using constant extra space
     *
     * @param s char array to reverse in-place
     */
    public static void reverseString(char[] s) {
        // Initialize two pointers at the start and end
        int left = 0;
        int right = s.length - 1;

        // Swap characters from both ends moving towards center
        while (left < right) {
            // Swap characters at left and right positions
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move pointers toward each other
            left++;
            right--;
        }
    }
}
