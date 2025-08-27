package main.java.leetcode.easy;

public class ExcelSheetColumnNumber171 {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
    public static int titleToNumber(String columnTitle){
        int ans=0;
        for(int i=0;i< columnTitle.length();i++) {
             ans = ans * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return ans;
    }
}
