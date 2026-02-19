import java.util.Scanner;

public class PrimeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        outer: while (count < n) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    num++;
                    continue outer; // labeled continue (acts like early exit)
                }
            }
            System.out.print(num + " ");
            count++;
            num++;
        }
    }
}