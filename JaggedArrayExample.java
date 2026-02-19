import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();
        int arr[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of elements in row " + (i + 1) + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ":");
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}