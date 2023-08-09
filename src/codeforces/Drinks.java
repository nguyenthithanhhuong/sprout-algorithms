package codeforces;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        double[] arr = new double[length];
        double sum = 0;

        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextDouble();
            sum += (arr[i]/100);
        }

        double result = (sum/length)*100;
        System.out.printf("%.12f", result);
    }
}
