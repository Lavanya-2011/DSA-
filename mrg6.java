import java.util.Scanner;
import java.util.Arrays;
class morning6{
    static int price=10;
     static int gst=2;
    static void display(){//static method
        System.out.println(price+gst);//only static properties
        return;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        morning6 ob=new morning6();
        ob.display();//method call

    }
}