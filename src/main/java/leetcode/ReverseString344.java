package main.java.leetcode;

import java.util.Arrays;

public class ReverseString344 {
    public static void main(String[] args) {
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
     * @param s char array to reverse in-place
     */

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

