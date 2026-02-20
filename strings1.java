import java.util.Scanner;
class strings1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s="Dell";
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)>='Z')
                System.out.println((char)(s.charAt(i)-32));
            else
                System.out.println(s.charAt(i));
        }

    }
}