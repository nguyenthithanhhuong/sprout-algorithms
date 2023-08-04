package Numerical;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 2;
        System.out.print(isPrime(num));
    }
    public static boolean isPrime(int num) {
        if (num < 3) {
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
