import java.util.Scanner;

class TernaryFourInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        // Finding largest using ternary operator
        int max1 = (a > b) ? a : b;
        int max2 = (c > d) ? c : d;
        int largest = (max1 > max2) ? max1 : max2;

        System.out.println("Largest number is: " + largest);

        sc.close();
    }
}
