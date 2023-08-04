import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0 && num > 2) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}
