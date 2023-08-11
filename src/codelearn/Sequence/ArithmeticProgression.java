package codelearn.Sequence;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(isArithmeticProgression(arr));
    }

    public static boolean isArithmeticProgression(int[] arr) {
        int arrLength = arr.length;

        if (arrLength == 1) return true;

        int d = arr[1] - arr[0];

        for (int i= 0; i < arrLength - 1; i++) {
            if ((arr[i+1] - arr[i]) != d) return false;
        }

        return true;
    }
}
