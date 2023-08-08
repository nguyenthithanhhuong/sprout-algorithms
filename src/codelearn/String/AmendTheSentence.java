package codelearn.String;

import java.util.Scanner;

public class AmendTheSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.print(amendTheSentence(str));
    }

    public static String amendTheSentence(String str) {
        String result = "";

        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            char ch = str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                result += " " + (char) (ch + 32);
            } else {
                result += ch;
            }
        }

        return result.trim();
    }
}
