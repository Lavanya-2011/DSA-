
class A {
    A() {
        System.out.println("A");
    }
}

class B extends A {

    B() {
        this(10);          // calls B(int)
        System.out.println("B");
    }

    B(int i) {
        super();           // calls A()
    }
}

public class none {
    public static void main(String[] args) {
        new B();
    }
}