import java.util.Scanner;

public class Alternating{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        boolean upper = true; // first letter should be uppercase

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            if (Character.isLetter(ch)) {
                if (upper) {
                    sb.setCharAt(i, Character.toUpperCase(ch));
                } else {
                    sb.setCharAt(i, Character.toLowerCase(ch));
                }
                upper = !upper; // toggle only after a letter
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}