package Numerical;

public class GreatestCommonPrimeDivisor {
    public static boolean[] array = new boolean[10001];

    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 18;
        System.out.print(gcpd(num1, num2));
    }

    public static void snt(int num) {
        array[0] = array[1] = false;

        for (int i = 2; i <= num; i++) {
            array[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (array[i]) {
                for (int j = 2*i; j <= num; j += i) {
                    array[j] = false;
                }
            }
        }
    }

    public static int gcpd(int num1, int num2) {
        int min = Math.min(num1, num2);
        snt(min);

        for (int i = min; i >= 2; i--) {
            if (array[i] && (num1 % i == 0) && (num2 % i == 0)) {
                return i;
            }
        }

        return -1;
    }
}
