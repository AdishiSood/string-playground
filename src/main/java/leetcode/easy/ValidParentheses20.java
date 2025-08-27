package main.java.leetcode.easy;

import java.util.Stack;

public class ValidParentheses20 {
    public static void main(String[] args) {
        String s= "()[]{}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){return false;}
                int top = stack.pop();
                if((ch==']' && top!='[') ||
                        (ch==')' && top!='(') ||
                        (ch=='}' && top!='{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
