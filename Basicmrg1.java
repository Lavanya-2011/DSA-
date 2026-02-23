import java.util.Scanner;
class Basicmrg1{
    class test{
        void display(){
            System.out.println("disp");
        }
        static void print(){
            System.out.println("print");
        }
    }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Basicmrg1 ob=new Basicmrg1();
        Basicmrg1.test obj =ob.new test();
        obj.display();//method call
        Basicmrg1.test.print();

    }
}