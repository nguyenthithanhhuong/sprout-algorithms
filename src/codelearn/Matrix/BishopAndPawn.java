package codelearn.Matrix;

import java.util.Scanner;

public class BishopAndPawn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String bishop = sc.nextLine();
        String pawn = sc.nextLine();
        sc.close();

        System.out.print(bishopAndPawn(bishop, pawn));
    }

    public static boolean bishopAndPawn(String bishop, String pawn) {
        char bix = bishop.charAt(0);
        char biy = bishop.charAt(1);
        char pax = pawn.charAt(0);
        char pay = pawn.charAt(1);

        if (Math.abs(bix - pax) == Math.abs(biy - pay) && (bix - pax != 0)) {
            return true;
        }

        return false;
    }
}
