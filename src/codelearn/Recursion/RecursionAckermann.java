package Recursion;

public class RecursionAckermann {
    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else {
            if (n == 0) {
                return ack(m - 1, 1);
            } else {
                return ack(m - 1, ack(m, n - 1));
            }
        }
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        System.out.printf("A(%d,%d) = %d", m, n, ack(m, n));
    }
}
