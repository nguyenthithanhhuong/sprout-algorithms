package codelearn.Sorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLength = sc.nextInt();

        int[] array = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        insertionSort(array);
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key= array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
