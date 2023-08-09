package codelearn.Matrix;

import java.util.Scanner;

public class ChessBoardCellColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cell1 = sc.nextLine();
        String cell2 = sc.nextLine();
        sc.close();

        System.out.print(chessBoardCellColor(cell1, cell2));
    }

    public static boolean chessBoardCellColor(String cell1, String cell2) {
        char ch1x = cell1.charAt(0);
        char ch1y = cell1.charAt(1);
        char ch2x = cell2.charAt(0);
        char ch2y = cell2.charAt(1);

        if ((ch1x + ch1y + ch2x + ch2y) % 2 == 0) {
            return true;
        }

        return false;
    }
}
