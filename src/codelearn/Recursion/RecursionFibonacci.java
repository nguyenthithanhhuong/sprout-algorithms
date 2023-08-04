package Recursion;

public class RecursionFibonacci {
    public static int fibonacci(int num) {
        if (num < 3) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.printf("f(%d) = %d", num, fibonacci(num));
    }
}
