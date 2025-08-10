package main.java.leetcode.easy;

/**
 * ReverseDegree
 * --------------
 * This program calculates a "reverse alphabetical degree" for a given string.
 *
 * For each character in the string:
 *   - Convert it to lowercase.
 *   - Find its position in the reverse alphabet ('z' = 1, 'y' = 2, ..., 'a' = 26).
 *   - Multiply that reverse position by the character's index (starting from 1).
 *   - Add the result to a running sum.
 *
 * Example:
 *   Input: "abc"
 *   Reverse positions: a → 26, b → 25, c → 24
 *   Weighted sum: (26*1) + (25*2) + (24*3) = 26 + 50 + 72 = 148
 *   Output: 148
 */
public class ReverseDegree {

    public static void main(String[] args) {
        String s = "abc"; // Input string
        System.out.println(reverseDegree(s)); // Expected output: 148
    }

    /**
     * Calculates the reverse alphabetical degree of a string.
     *
     * @param s the input string
     * @return the sum of weighted reverse alphabetical positions
     */
    public static int reverseDegree(String s) {
        char ch[] = s.toCharArray(); // Convert string to character array
        int index = 1;               // Position multiplier starting at 1
        int sum = 0;                  // Running total

        // Loop over each character in the string
        for (char c : ch) {
            // Calculate reverse alphabetical position:
            // 'z' - lowercase(c) + 1 → ('z' = 1, 'y' = 2, ..., 'a' = 26)
            int result = 'z' - Character.toLowerCase(c) + 1;

            // Multiply the reverse position by the index and add to sum
            sum += result * index;

            // Increment index for next character
            index++;
        }

        return sum;
    }
}
