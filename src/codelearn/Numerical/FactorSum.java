package codelearn.Numerical;

public class FactorSum {
    public static void main(String[] args) {
        int num = 9;
        System.out.print(factorSum(num));
    }
    public static int factorSum(int num) {
        while (num != solve(num)) {
            num = solve(num);
        }
        return num;
    }

    public static int solve(int num) {
        int k = 2;
        int sum = 0;

        while (num > 1) {
            while (num % k == 0) {
                sum += k;
                num /= k;
            }
            k++;
        }
        return sum;
    }
}
