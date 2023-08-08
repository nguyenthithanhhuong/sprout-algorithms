package codelearn.String;

import java.util.Scanner;

public class FormatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        sc.close();
        System.out.print(formatString(inputStr));
    }

    public static String formatString(String inputStr) {
        inputStr = inputStr.replaceAll("\\s+", " ");
        return inputStr.trim();
    }
}
