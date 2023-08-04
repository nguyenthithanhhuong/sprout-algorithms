package Recursion;

public class RecursionTowerOfHN {
    public static void towerOfHN(int num, String start, String end, String mid) {
        if (num == 1) {
            System.out.printf("Chuyen 1 dia tu %s sang %s\n", start, end);
            return;
        }
        towerOfHN(num - 1, start, mid, end);

        System.out.printf("Chuyen 1 dia tu %s sang %s\n", start, end);

        towerOfHN(num - 1, mid, end, start);
    }

    public static void main(String[] args) {
        int num = 5;
        towerOfHN(num, "A", "B", "C");
    }
}
