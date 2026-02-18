import java.util.Scanner;
class op{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        switch(str){
            case "AND" :System.out.println(a&b);break;
            case "XOR": System.out.println(a^b);break;
            case "OR" : System.out.println(a|b);break;
            case "NAND" : System.out.println(~(a&b));break;
            default:System.out.println("Invalid input");
        }
    }
}