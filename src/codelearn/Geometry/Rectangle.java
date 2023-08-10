package codelearn.Geometry;

public class Rectangle {
    public static void main(String[] args) {
        int[][] x = {{0,0}, {2,0}, {2,1}, {0,1}};

        System.out.println(isRectangle(x));
    }

    public static boolean isRectangle(int[][] x) {
        int x01 = x[0][0] - x[1][0];
        int y01 = x[0][1] - x[1][1];

        int x12 = x[1][0] - x[2][0];
        int y12 = x[1][1] - x[2][1];

        int x23 = x[2][0] - x[3][0];
        int y23 = x[2][1] - x[3][1];

        int x03 = x[0][0] - x[3][0];
        int y03 = x[0][1] - x[3][1];

        boolean res1 = false;
        boolean res2 = false;
        boolean res3 = false;

        if (x01*x12 + y01*y12 == 0) res1 = true;
        if (x12*x23 + y12*y23 == 0) res2 = true;
        if (x23*x03 + y23*y03 == 0) res3 = true;

        return res1 && res2 && res3;
    }

}
