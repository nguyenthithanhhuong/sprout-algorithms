import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int result = num1 * num2;

        if (result < 2) {
           result = 0;
        } else {
            result /= 2;
        }

        System.out.print(result);
    }
}
