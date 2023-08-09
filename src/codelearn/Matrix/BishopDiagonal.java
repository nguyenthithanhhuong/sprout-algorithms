package codelearn.Matrix;

import java.util.Scanner;

public class BishopDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bishop1 = sc.nextLine();
        String bishop2 = sc.nextLine();
        sc.close();

    }
    public static String[] bishopDiagonal(String bishop1, String bishop2) {
        char bishop1x = bishop1.charAt(0);
        char bishop1y = bishop1.charAt(1);
        char bishop2x = bishop2.charAt(0);
        char bishop2y = bishop2.charAt(1);

        if (Math.abs(bishop1x - bishop2x) != Math.abs(bishop1y - bishop2y)) {
            return new String[]{bishop2, bishop1};
        }

        if (bishop1y < bishop2y) {
            while (bishop1x != 'a' && bishop1y != '1') {
                bishop1x--;
                bishop1y--;
            }
            while (bishop2x != 'h' && bishop2y != '8') {
                bishop2x++;
                bishop2y++;
            }
            return new String[]{bishop1, bishop2};
        } else {
            while (bishop1x != 'a' && bishop1y != '8') {
                bishop1x--;
                bishop1y++;
            }
            while (bishop2x != 'h' && bishop2y != '1') {
                bishop2x++;
                bishop2y--;
            }
            return new String[]{bishop1, bishop2};
        }
    }
}
