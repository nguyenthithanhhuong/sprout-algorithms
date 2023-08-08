package codelearn.String;

import java.util.Scanner;

public class CheckStrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        sc.close();

        System.out.print(checkStrongPassword(password));
    }

    public static boolean checkStrongPassword(String password) {
        int passLength = password.length();

        if (passLength < 6) return false;

        String specChar = "!@#$%^&*()-+";

        boolean test_1 = false;
        boolean test_A = false;
        boolean test_a = false;
        boolean test_spec = false;

        for (int i = 0; i < passLength; i++) {
            char ch = password.charAt(i);
            if (ch >= 48 && ch <= 57) {
                test_1 = true;
            }
            if (ch >= 65 && ch <= 90) {
                test_A = true;
            }
            if (ch >= 97 && ch <= 122) {
                test_a = true;
            }
            if (specChar.indexOf(String.valueOf(ch)) != -1) {
                test_spec = true;
            }
        }

        return test_1 && test_A && test_a && test_spec;
    }
}
