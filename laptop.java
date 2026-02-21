import java.util.Scanner;
public class laptop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=new String();
        StringBuilder sb=new StringBuilder();
        System.out.println(s.length());
        System.out.println(sb.length());
        s="laptop";
        s=s+s;
        sb.append("11223344556677889");
        System.out.println(s.length());
        System.out.println(sb.length());
        System.out.println(s);
        System.out.println(sb);
        System.out.println(sb.capacity());

    }
}