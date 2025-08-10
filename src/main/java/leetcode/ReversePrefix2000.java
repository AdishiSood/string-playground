package main.java.leetcode;

/**
 * LeetCode 2000: Reverse Prefix of Word
 *
 * Problem: Given a 0-indexed string word and a character ch, reverse the segment
 * of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive).
 * If the character ch does not exist in word, do nothing.
 */
public class ReversePrefix2000 {
    public static void main(String[] args) {
        // Test case 1: Character exists in string
        String s = "abcdefd";
        char c = 'd';  // Changed from 'p' to 'd' for a valid test case
        System.out.println("Input: word = " + s + ", ch = '" + c + "'");
        System.out.println("Output: " + reverse(s, c) + " ");

        // Test case 2: Character doesn't exist in string
        String s2 = "abcdefd";
        char c2 = 'p';
        System.out.println("\nInput: word = " + s2 + ", ch = '" + c2 + "'");
        System.out.println("Output: " + reverse(s2, c2) + " ");

        // Test case 3: Character is at beginning
        String s3 = "abcdefd";
        char c3 = 'a';
        System.out.println("\nInput: word = " + s3 + ", ch = '" + c3 + "'");
        System.out.println("Output: " + reverse(s3, c3) + " ");
    }

    /**
     * Reverses the prefix of a word up to and including the first occurrence of a character.
     * Uses two-pointer technique for in-place character swapping.
     *
     * Time Complexity: O(n) where n is the length of word (indexOf + reversal)
     * Space Complexity: O(n) for the character array conversion
     *
     * @param word the input string to process
     * @param ch the character to find for determining the prefix end
     * @return string with prefix reversed, or original string if character not found
     */
    public static String reverse(String word, char ch) {
        // Convert string to character array for in-place manipulation
        char[] c = word.toCharArray();

        // Set left pointer to start of string
        int left = 0;

        // Find the index of first occurrence of target character
        // This determines the right boundary of the prefix to reverse
        int right = word.indexOf(ch);

        // If character not found, indexOf returns -1
        // The while loop won't execute, returning original string
        while (left < right) {
            // Swap characters at left and right positions
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;

            // Move pointers toward each other
            left++;   // Move left pointer forward
            right--;  // Move right pointer backward
        }

        // Convert character array back to string and return
        return new String(c);
    }
}
