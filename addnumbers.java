import java.util.Scanner;
public class addnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int s=0;
        for(;true;) { 
            num = sc.nextInt();
            if(num==0){
                break;
            }
            s = s+num;
        }
        System.out.println("Sum" + s);
    }
    
}