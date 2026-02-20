import java.util.Arrays;

public class reverse {

    // Function to reverse the character array
    public static void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        // Example 1
        char[] s1 = {'h','e','l','l','o'};
        reverseString(s1);
        System.out.println("Reversed: " + Arrays.toString(s1));

        // Example 2
        char[] s2 = {'H','a','n','n','a','h'};
        reverseString(s2);
        System.out.println("Reversed: " + Arrays.toString(s2));
    }
}