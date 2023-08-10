package codelearn.Geometry;

public class CountTriangles {
    public static void main(String[] args) {

    }

    public static int countTriangles(int[] x, int[] y) {
        int result = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                for (int k = j + 1; k < x.length; k++) {
                    if ((x[i] - x[j])*(y[k] - y[i]) != (y[i] - y[j])*(x[k] - x[i])) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
