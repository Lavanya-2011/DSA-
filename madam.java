import java.util.Scanner;
class madam{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        String reversed = sb.toString();
        if (input.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

        sc.close();
    }
}