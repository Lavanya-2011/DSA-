import java.util.Scanner;

public class kuick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read base string
        String base = sc.nextLine();

        // Read string to insert
        String insert = sc.nextLine();

        // Read index
        int index = sc.nextInt();

        try {
            // Create StringBuilder object with base string
            StringBuilder sb = new StringBuilder(base);

            // Insert string at given index
            sb.insert(index, insert);

            // Print modified string
            System.out.println(sb.toString());
        } 
        catch (IndexOutOfBoundsException e) {
            // Handle invalid index
            System.out.println("IndexOutOfBoundsException");
        }

        sc.close();
    }
}