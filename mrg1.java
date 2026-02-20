import java.util.Scanner;

public class mrg1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create Scanner object

        System.out.print("Enter a string: ");
        String str = sc.nextLine();            // Read input

        int count = 0;                        // Counter variable

        for(char ch : str.toCharArray()) {    // Convert string to char array
            count++;                          // Increase count
        }

        System.out.println("Length of string is: " + count);

        sc.close();                           // Close scanner
    }
}