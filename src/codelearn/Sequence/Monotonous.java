package codelearn.Sequence;

import java.util.Scanner;

public class Monotonous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = sc.nextInt();
        }
        sc.nextLine();

        System.out.println(isMonotonous(array));
    }
    public static boolean isMonotonous(int[] arr) {
        int arrLength = arr.length;
        if (arrLength == 1) return true;
        if (arrLength == 2) return (arr[0] != arr[1]);

        for (int i = 0; i < arrLength - 2; i++) {
            if ((arr[i+1] - arr[i])*(arr[i+2] - arr[i+1]) <= 0) {
                return false;
            }
        }

        return true;
    }
}
