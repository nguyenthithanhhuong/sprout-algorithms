package codeforces;

import java.util.Scanner;

public class LoveStory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        String[] strArray = new String[test + 1];
        String result = "";

        for (int i = 0; i <= test; i++) {
            strArray[i] = sc.nextLine();
        }
        sc.close();

        for (int i = 1; i <= test; i++) {
            result += solve(strArray[i]) + "\n";
        }

        System.out.println(result);
    }

    public static int solve(String inputStr) {
        String s = "codeforces";
        int strLength = inputStr.length();
        int result = 0;
        for (int i = 0; i < strLength; i++) {
            char ch1 = inputStr.charAt(i);
            char ch2 = s.charAt(i);
            if (ch1 != ch2) result++;
        }
        return result;
    }
}
