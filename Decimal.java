import java.util.Scanner;

class DecimalShiftExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();

        System.out.print("Enter number of positions to shift: ");
        int shift = sc.nextInt();

        // Left Shift
        int leftShift = number << shift;

        // Right Shift
        int rightShift = number >> shift;

        System.out.println("Left Shift Result: " + leftShift);
        System.out.println("Right Shift Result: " + rightShift);

        sc.close();
    }
}
