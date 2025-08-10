package main.java.leetcode.easy;

import java.util.Stack;

public class ReverseOnlyLetters917 {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(s));
    }
    public static String reverseOnlyLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(stack.pop());
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
