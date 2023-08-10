package codelearn.Geometry;

public class CountTriangles {
    public static void main(String[] args) {

    }

    public static int countTriangles(int[] x, int[] y) {
        int result = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                for (int k = j + 1; k < x.length; k++) {
                    double d1 = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    double d2 = Math.sqrt(Math.pow(x[i] - x[k], 2) + Math.pow(y[i] - y[k], 2));
                    double d3 = Math.sqrt(Math.pow(x[j] - x[k], 2) + Math.pow(y[j] - y[k], 2));
                    if (Math.abs(d3 - d2) < d1 && d1 < d2 + d3) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
