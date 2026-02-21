import java.util.Scanner;
public class laptop2 {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder("11223344556");
        System.out.println(sb);
        System.out.println(sb.reverse());
         System.out.println(sb.charAt(0));
        System.out.println(sb.charAt(0));
         System.out.println(sb.insert(0,"00"));
          System.out.println(sb.replace(0,3,"-1"));
          System.out.println(sb.delete(0,1));
          System.out.println(sb.deleteCharAt(2));
          System.out.println(sb.replace(0,3,"-1"));
          System.out.println(sb.isEmpty());
          System.out.println(sb.equals("1544332211"));
          System.out.println(sb.substring(4));
          System.out.println(sb.substring(0,4));
          System.out.println(sb.toString());
          System.out.println();
          
          
          


    }
}

