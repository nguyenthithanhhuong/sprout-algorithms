package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        int i = 0;
        while (i < test) {
            i++;
            int aLength = sc.nextInt();
            int[] a = new int[aLength];
            for (int j = 0; j < aLength; j++) {
                a[j] = sc.nextInt();
            }
            solve(a);
            System.out.println();
        }
    }

    public static void solve(int[] a) {
        ArrayList b = new ArrayList();
        ArrayList c = new ArrayList();

        int aLength = a.length;
        int min = a[0];
        int count = 0;
        for (int i = 1; i < aLength; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] == a[0]) count++;
        }

        for (int i = 0; i < aLength; i++) {
            if (a[i] == min || a[i] == 1) {
                b.add(a[i]);
            } else {
                c.add(a[i]);
            }
        }
        if (count == aLength - 1) {
            System.out.print(-1);
        } else {
            int bLength = b.size();
            int cLength = c.size();

            System.out.printf("%d %d\n", bLength, cLength);

            for (int i = 0; i < bLength; i++) {
                System.out.print(b.get(i) + " ");
            }
            System.out.println();
            for (int i = 0; i < cLength; i++) {
                System.out.print(c.get(i) + " ");
            }
        }
    }
}
