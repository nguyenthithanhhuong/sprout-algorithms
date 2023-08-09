package codelearn.String;

import java.util.Scanner;

public class TandemRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.print(isTandemRepeat(str));
    }
    public static boolean isTandemRepeat(String str) {
        int strLength = str.length();

        if (strLength % 2 != 0) return false;

        for (int i = 0; i < strLength/2; i++) {
                char ch1 = str.charAt(i);
                char ch2 = str.charAt(i + (strLength/2));

                if (ch1 != ch2) return false;
        }
        return true;
    }
}
