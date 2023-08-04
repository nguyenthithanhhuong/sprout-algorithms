import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine().toLowerCase();
        sc.close();

        String outputStr = "";

        int strLength = inputStr.length();

        for (int i = 0; i < strLength; i++) {
            char ch = inputStr.charAt(i);
            if (ch != 'y' && ch !='e' && ch != 'u' &&
                ch != 'o' && ch != 'a' && ch != 'i') {
                outputStr += "." + String.valueOf(ch);
            }
        }

        System.out.print(outputStr);
    }
}
