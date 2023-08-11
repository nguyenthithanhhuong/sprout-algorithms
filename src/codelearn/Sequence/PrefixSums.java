package codelearn.Sequence;

import java.util.Scanner;

public class PrefixSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(prefixSums(arr));
    }
    public static int[] prefixSums(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}
