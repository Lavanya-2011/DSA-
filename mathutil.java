
class MathUtils {

    // Instance method
    int add(int a, int b) {
        return a + b;
    }

    // Static method
    static int multiply(int a, int b) {
        return a * b;
    }
}

public class mathutil {
    public static void main(String[] args) {

        // Calling instance method
        MathUtils math = new MathUtils();
        int sum = math.add(5, 10);

        // Calling static method
        int product = MathUtils.multiply(5, 10);

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}