class Laptop {
    int amount = 50000;
    String name = "lenovo";

    Laptop() {
        System.out.println("laptop");
    }

    void display() {
        System.out.println(name);
        System.out.println(amount);
    }
}

class Dell extends Laptop {
    Dell() {
        System.out.println("dell");
    }
}

public class LaptopDemo {
    public static void main(String args[]) {
        Dell obj = new Dell();

        System.out.println(obj.name);
        System.out.println(obj.amount);
        obj.display();
    }
}