package codeforces;

import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
        int length, i = 1, sum = 0;
        int[] array = new int[50];
        String result = "";

        while (i <= numTest) {
            length = sc.nextInt();
            array = new int[length];

            sum = 0;

            for (int j = 0; j < length; j++) {
                array[j] = sc.nextInt();
                sum += array[j];
            }

            if (sum % 2 == 0) {
                result += "Yes\n";
            } else {
                result += "No\n";
            }
            i++;
        }
        sc.close();

        System.out.print(result);
    }
}
