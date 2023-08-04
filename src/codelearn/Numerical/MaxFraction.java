package Numerical;

public class MaxFraction {
    public static void main(String[] args) {
        int[] numerators = {5, 2, 5};
        int[] denominators = {6, 2, 4};
        System.out.print(maxFraction(numerators, denominators));
    }
    public static int maxFraction(int[] numerators, int[] denominators) {
        int result = 0;
        for (int i = 1; i < numerators.length; i++) {
            if (numerators[result]*denominators[i] < numerators[i]*denominators[result]) {
                result = i;
            }
        }
        return result;
    }
}
