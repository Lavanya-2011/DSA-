import java.util.Scanner;

public class toggle{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create Scanner object

        System.out.print("Enter input: ");
        String input = sc.nextLine();          // Read input

        String result = "";                   // Store toggled result

        for(int i = 0; i < input.length(); i++) {   // Loop through each character
            
            char ch = input.charAt(i);              // Get character
            
            if(Character.isUpperCase(ch)) {         // If uppercase
                result = result + Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)) {    // If lowercase
                result = result + Character.toUpperCase(ch);
            }
            else {                                  // If not letter
                result = result + ch;
            }
        }

        System.out.println("Output: " + result);    // Print result

        sc.close();                                 // Close scanner
    }
}