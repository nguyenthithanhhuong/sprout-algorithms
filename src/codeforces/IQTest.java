package codeforces;

import java.util.Scanner;

public class IQTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        int temp = 0, resEven = 0, resOdd = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                temp++;
                resEven = i;
            } else {
                resOdd = i;
            }
        }

        if (temp == 1) {
            System.out.print(resEven + 1);
        } else {
            System.out.print(resOdd + 1);
        }
    }
}
