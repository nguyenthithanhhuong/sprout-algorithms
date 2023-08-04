package Recursion;

public class RecursionCombine {
    public static int combine(int n, int k) {
        if(k > n) {
            return 0;
        } else if (k == 0 || k == n) {
            return 1;
        } else {
            return combine(n-1, k-1) + combine(n-1, k);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int k = 2;
        System.out.printf("To hop chap %d cua %d bang %d", k, n, combine(n, k));
    }
}
