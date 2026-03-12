import java.util.Scanner;

public class SkipMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();  // Read input

        for (int i = 1; i <= 100; i++) {
            if (i % M == 0) {
                continue; // Skip multiples of M
            }
            System.out.print(i + " ");
        }

        sc.close();
    }
}