package main.java.leetcode.easy;

/**
 * LeetCode 541: Reverse String II
 * Given a string s and an integer k, reverse the first k characters
 * for every 2k characters counting from the start of the string.
 *
 * Rules:
 * - If there are fewer than k characters left, reverse all of them.
 * - If there are less than 2k but greater than or equal to k characters,
 *   then reverse the first k characters and leave the other as original.
 */
public class ReverseStringII541 {
    public static void main(String[] args) {
        // Test case 1: Normal case
        String s1 = "abcdefg";
        int k1 = 2;
        System.out.println("Input: s = \"" + s1 + "\", k = " + k1);
        System.out.println("Output: \"" + reverseStr(s1, k1) + "\"");
        System.out.println();

        // Test case 2: k larger than string length
        String s2 = "abcdefg";
        int k2 = 8;
        System.out.println("Input: s = \"" + s2 + "\", k = " + k2);
        System.out.println("Output: \"" + reverseStr(s2, k2) + "\"");
    }

    /**
     * Reverses the first k characters for every 2k characters in the string.
     *
     * Algorithm:
     * 1. Convert string to character array for in-place manipulation
     * 2. Process the string in chunks of 2k characters
     * 3. For each chunk, reverse only the first k characters
     * 4. Use two-pointer technique to perform the reversal
     * 5. Handle edge cases where remaining characters are less than k
     *
     * Time Complexity: O(n) where n is the length of the string
     * Space Complexity: O(n) for the character array conversion
     *
     * @param s the input string
     * @param k the number of characters to reverse in each 2k chunk
     * @return the modified string with reversed segments
     */
    public static String reverseStr(String s, int k) {
        // Convert to character array for efficient in-place swapping
        char[] chars = s.toCharArray();

        // Process string in chunks of 2k characters
        for (int start = 0; start < chars.length; start += 2 * k) {
            // Set left pointer to start of current chunk
            int left = start;

            // Set right pointer to end of k characters or end of array, whichever is smaller
            // subtract 1 because we need the index, not the length
            int right = Math.min(start + k - 1, chars.length - 1);

            // Reverse the first k characters of current 2k chunk
            while (left < right) {
                // Swap characters and move pointers
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        // Convert character array back to string
        return new String(chars);
    }
}
