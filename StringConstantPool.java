import java.util.*;
public class StringConstantPool {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="dell";
        System.out.println(System.identityHashCode(s));
        String str=new String("dell");
        String new_str=new String();
        new_str="dell";
        System.out.println(s==str);
        System.out.println(new_str==str);
        System.out.println(new_str==s);
        
    }
    
}