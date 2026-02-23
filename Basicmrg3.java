
import java.util.Scanner;
class Basicmrg3{
        void display(Basicmrg3 t){
            System.out.println("disp");
            System.out.println(t);
        }
        Basicmrg3 print(Basicmrg3 t){
            System.out.println("print");
            return new Basicmrg3();
        }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Basicmrg3 ob=new Basicmrg3();
        Basicmrg3 obj=new Basicmrg3();

        ob.display(obj);//method call
        System.out.println(obj);
        Basicmrg3 copyob=ob.print(obj);
        System.out.println(copyob);


    }
}