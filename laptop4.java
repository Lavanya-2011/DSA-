
import java.util.*;

public class laptop4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] result = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result[j] = s.charAt(i);
            j++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}