package codelearn.Matrix;

import java.util.Scanner;

public class ChessKnight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cell = sc.nextLine();
        sc.close();

        System.out.print(chessKnight(cell));
    }

    public static int chessKnight(String cell) {
        char chx = cell.charAt(0);
        char chy = cell.charAt(1);

        int result = 0;

        if ((chx - 1) >= 'a' && (chy - 2) >= '1') result++;

        if ((chx - 2) >= 'a' && (chy - 1) >= '1') result++;

        if ((chx + 1) <= 'h' && (chy - 2) >= '1') result++;

        if ((chx + 2) <= 'h' && (chy - 1) >= '1') result++;

        if ((chx - 2) >= 'a' && (chy + 1) <= '8') result++;

        if ((chx - 1) >= 'a' && (chy + 2) <= '8') result++;

        if ((chx + 2) <= 'h' && (chy + 1) <= '8') result++;

        if ((chx + 1) <= 'h' && (chy + 2) <= '8') result++;

        return result;
    }
}
