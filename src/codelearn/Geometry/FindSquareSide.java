package codelearn.Geometry;

import java.util.Scanner;

public class FindSquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[4];
        int[] y = new int[4];

        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            y[i] = sc.nextInt();
        }

        sc.close();

        System.out.println(findSquareSide(x, y));
    }
    public static int findSquareSide(int[] x, int[] y) {
        double s01, s02, s03;

        s01 = Math.pow(x[0] - x[1], 2) + Math.pow(y[0] - y[1], 2);
        s02 = Math.pow(x[0] - x[2], 2) + Math.pow(y[0] - y[2], 2);
        s03 = Math.pow(x[0] - x[3], 2) + Math.pow(y[0] - y[3], 2);

        if (s01 == s02) {
            return (int) s01;
        } else {
            return (int) s03;
        }
    }
}
