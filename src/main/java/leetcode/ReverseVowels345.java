package main.java.leetcode;

import java.util.Stack;

/**
 * LeetCode 345: Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', 'u', and they can appear in both cases.
 */
public class ReverseVowels345 {

    public static void main(String[] args) {
        ReverseVowels345 solution = new ReverseVowels345();
        String s = "IceCreAm";
        System.out.println("Input: \"" + s + "\"");
        System.out.println("Output: \"" + solution.reverseVowels(s) + "\"");

        // Additional test case
        String s2 = "leetcode";
        System.out.println("Input: \"" + s2 + "\"");
        System.out.println("Output: \"" + solution.reverseVowels(s2) + "\"");
    }

    /**
     * Reverses only the vowels in the given string using stack approach.
     *
     * Algorithm:
     * 1. First pass: Extract all vowels and push them onto a stack (LIFO order)
     * 2. Second pass: Replace vowels in original positions with popped vowels
     * 3. Non-vowel characters remain in their original positions
     *
     * Time Complexity: O(n) where n is the length of string (two passes)
     * Space Complexity: O(v) where v is the number of vowels in the string
     *
     * @param s the input string
     * @return string with vowels reversed
     */
    public String reverseVowels(String s) {
        // Stack to store vowels in reverse order (LIFO)
        Stack<Character> stack = new Stack<>();

        // First pass: Extract all vowels and push to stack
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                stack.push(ch);
            }
        }

        // StringBuilder for efficient string building
        StringBuilder sb = new StringBuilder();

        // Second pass: Build result string
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                // Replace vowel with the last vowel found (from stack)
                sb.append(stack.pop());
            } else {
                // Keep non-vowel characters in original position
                sb.append(ch);
            }
        }

        // Convert StringBuilder to string
        return sb.toString();
    }

    /**
     * Helper method to check if a character is a vowel.
     * Handles both lowercase and uppercase vowels.
     *
     * @param c the character to check
     * @return true if the character is a vowel, false otherwise
     */
    public static boolean isVowel(char c) {
        // Check if character exists in vowel string (both cases)
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
