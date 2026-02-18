import java.util.Scanner;

public class leap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int N = sc.nextInt();

        // Check Leap Year
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Common Year");
        }

        // Validate N
        if ((!isLeap && N > 365) || (isLeap && N > 366) || N < 1) {
            System.out.println("Invalid Day");
            return;
        }

        // Days of week array (Jan 1 = Monday)
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Day calculation using modulo arithmetic
        int dayIndex = (N - 1) % 7;

        System.out.println(days[dayIndex]);
    }
}
