import java.util.Scanner;

public class after5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String base = sc.nextLine();
        String target = sc.nextLine();
        String replacement = sc.nextLine();

        StringBuilder sb = new StringBuilder(base);

        int index = sb.indexOf(target);
        while (index != -1) {
            sb.replace(index, index + target.length(), replacement);
            index = sb.indexOf(target, index + replacement.length());
        }

        System.out.print(sb.toString());
        sc.close();
    }
}