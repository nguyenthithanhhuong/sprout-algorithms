package codeforces;

import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        sc.close();

        if (isDanger(inputStr)) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
    public static boolean isDanger(String inputStr) {
        if (inputStr.length() < 8) {
            return false;
        }

        String danger0 = "0000000";
        String danger1 = "1111111";

        if (inputStr.contains(danger0) || inputStr.contains(danger1)) {
            return true;
        }

        return false;
    }
}
