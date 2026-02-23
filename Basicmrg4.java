import java.util.Scanner;

class Basicmrg4 {
    String name;
    int rollNo;
    String dept;
    String Native;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Basicmrg4 obj[] = new Basicmrg4[2];

        // Creating objects
        obj[0] = new Basicmrg4();
        obj[1] = new Basicmrg4();

        obj[0].name = "Dell";
        obj[0].dept = "laptop";
        obj[0].rollNo = 1;
        obj[0].Native = "USA";

        obj[1].name = "Lenovo";
        obj[1].dept = "laptop";
        obj[1].rollNo = 2;
        obj[1].Native = "USA";

        // Printing output
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Name: " + obj[i].name);
            System.out.println("Dept: " + obj[i].dept);
            System.out.println("RollNo: " + obj[i].rollNo);
            System.out.println("Native: " + obj[i].Native);
            System.out.println();
        }
    }
}