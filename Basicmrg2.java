import java.util.Scanner;
class Basicmrg2{
        void display(Basicmrg2 t){
            System.out.println("disp");
            System.out.println(t);
        }
        static void print(){
            System.out.println("print");
        }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Basicmrg2 ob=new Basicmrg2();
        Basicmrg2 obj=new Basicmrg2();
        ob.display(obj);//method call

    }
}