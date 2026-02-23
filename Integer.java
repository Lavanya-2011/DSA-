import java.util.Scanner;

class IntegerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.BYTES);

        System.out.println(Integer.parseInt("453"));
        System.out.println(Integer.parseInt("1010", 2));

        System.out.println(Integer.bitCount(4));

        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isAlphabetic('w'));
        System.out.println(Character.isLetterOrDigit('$'));
    }
}