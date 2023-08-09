package codeforces;

import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yNum = sc.nextInt();
        int wNum = sc.nextInt();
        sc.close();

        solve(yNum, wNum);
    }

    public static void solve(int num1, int num2) {
        int temp = 7 - Math.max(num1, num2);

        int commonDiv = ucln(temp, 6);

        if (temp == 0) {
            System.out.print("0/1");
        } else if (temp == 6) {
            System.out.print("1/1");
        } else {
            System.out.printf("%d/%d", temp/commonDiv, 6/commonDiv);
        }
    }

    public static int ucln(int num1, int num2) {
        if (num2 == 0) return num1;
        return ucln(num2, num1 % num2);
    }
}
