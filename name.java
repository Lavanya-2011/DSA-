import java.util.Scanner;
class Laptop{
    private String name="Dell";
    private int amount=70_000;

    public void set(String name,int amount){
        this.name=name;
        this.amount=amount;
    }
    public void get(){
        System.out.println(name);
        System.out.println(amount);
    }
    public String getName(){
        return name;
    }
}
class name extends Laptop {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Laptop ob=new Laptop();
        //System.out.println(ob.name);
        //System.out.println(ob.amount);
        name obj=new name();
        //System.out.println(obj.name);
        //System.out.println(obj.amount);
        obj.get();
        obj.set("lenovo",75_000);
        obj.get();
    }
    
}