
import java.util.Scanner;

public class laptop5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                sb.deleteCharAt(i);
                i--; // adjust index after deletion
            }
        }

        System.out.print(sb.toString());
        sc.close();
    }
}