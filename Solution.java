import java.util.Scanner;
import java.util.ArrayList;

class Student {}
class Rockstar {}
class Hacker {}

public class Solution {

    static void count(ArrayList mylist) {
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < mylist.size(); i++) {
            Object element = mylist.get(i);

            if (element instanceof Student)
                a++;
            if (element instanceof Rockstar)
                b++;
            if (element instanceof Hacker)
                c++;
        }

        System.out.println(a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList mylist = new ArrayList();

        while (t-- > 0) {
            String s = sc.next();
            if (s.equals("Student"))
                mylist.add(new Student());
            else if (s.equals("Rockstar"))
                mylist.add(new Rockstar());
            else if (s.equals("Hacker"))
                mylist.add(new Hacker());
        }

        count(mylist);
    }
}