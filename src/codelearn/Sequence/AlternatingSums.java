package codelearn.Sequence;

public class AlternatingSums {
    public static void main(String[] args) {
        int[] arr = {50, 60, 60, 45, 70};
        System.out.print(alternatingSums(arr));
    }

    public static int[] alternatingSums(int[] arr) {
        int sumTeam1 = 0;
        int sumTeam2 = 0;
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            if (i % 2 != 0) {
                sumTeam2 += arr[i];
            } else {
                sumTeam1 += arr[i];
            }
        }

        return new int[]{sumTeam1, sumTeam2};
    }
}
