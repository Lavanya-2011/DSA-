class Laptop {
    Laptop() {
        System.out.println("laptop");
    }
}

class Asus {
    Asus() {
        System.out.println("asus");
    }
}

class Processor {
    Processor() {
        System.out.println("processor");
    }
}

public class LaptopDemo1 {
    public static void main(String args[]) {

        new Laptop();
        new Asus();
        new Processor();
    }
}