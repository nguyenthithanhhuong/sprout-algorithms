package codelearn.Geometry;

import java.util.Scanner;

public class InsideCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] point = new int[2];
        point[0] = sc.nextInt();
        point[1] = sc.nextInt();

        int[] center = new int[2];
        center[0] = sc.nextInt();
        center[1] = sc.nextInt();

        int radius = sc.nextInt();

        System.out.println(insideCircle(point, center, radius));
    }
    public static boolean insideCircle(int[] point, int[] center, int radius) {
        int disc2 = (int) (Math.pow(point[0] - center[0], 2) + Math.pow(point[1] - center[1], 2));
        if (disc2 <= Math.pow(radius, 2)) return true;
        return false;
    }
}
