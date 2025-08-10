package main.java.leetcode.medium;

/**
 * LeetCode 151: Reverse Words in a String
 * <p>
 * Problem: Given an input string s, reverse the order of the words.
 * A word is defined as a sequence of non-space characters.
 * The words in s will be separated by at least one space.
 */
public class ReverseWordsInString151 {

    public static void main(String[] args) {
        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1)); // Expected: "blue is sky the"

        String s2 = "  hello world  ";
        System.out.println(reverseWords(s2)); // Expected: "world hello"

        String s3 = "a good   example";
        System.out.println(reverseWords(s3)); // Expected: "example good a"
    }

    /**
     * Reverses the order of words in a string.
     * <p>
     * Algorithm:
     * 1. Trim leading and trailing spaces
     * 2. Split string by one or more spaces using regex
     * 3. Reverse the array of words
     * 4. Join words back with single spaces
     * <p>
     * Time Complexity: O(n), Space Complexity: O(n)
     *
     * @param s the input string with words separated by spaces
     * @return string with words in reversed order, extra spaces removed
     */
    public static String reverseWords(String s) {
        // Remove leading and trailing spaces, split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // StringBuilder for efficient string construction
        StringBuilder result = new StringBuilder();

        // Iterate through words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            // Add space between words (but not after the last word)
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
