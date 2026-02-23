import java.util.Scanner;
class Basicmrg{
    class test{
        void display(){
            System.out.println("disp");
        }
    }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Basicmrg ob=new Basicmrg();
        Basicmrg.test obj =ob.new test();
        obj.display();//method call

    }
}