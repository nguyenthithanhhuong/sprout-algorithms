package Numerical;

public class DigitsProduct {
    public static void main(String[] args) {
        int product = 450;
        System.out.print(digitsProduct(product));
    }

    public static int digitsProduct(int product) {
        if (product == 0) return 10;
        if (product == 1) return 1;

        int result0 = 0;

        for (int i = 9; i >= 2; i--) {
            while (product % i == 0) {
                result0 = result0 * 10 + i;
                product /= i;
            }
        }

        int result = 0;
        while (result0 > 0) {
            result = result * 10 + result0 % 10;
            result0 /= 10;
        }

        return (product == 1) ? result : -1;

    }
}
