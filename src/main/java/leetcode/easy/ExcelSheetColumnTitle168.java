package main.java.leetcode.easy;

public class ExcelSheetColumnTitle168 {
    public static void main(String[] args) {
        int columnNumber = 45;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            int p = columnNumber % 26;
            char ch = (char) ('A' + p);
            sb.append(ch);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }
}
