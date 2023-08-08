package codelearn.String;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(checkPalindrome(str));
    }

    public static boolean checkPalindrome(String str) {
        int strLength = str.length();
        for (int i = 0; i < strLength/2; i++) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(strLength - i - 1);
            if (ch1 != ch2) return false;
        }
        return true;
    }
}
