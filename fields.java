
class Parent {
    void print() {
        System.out.print("Parent");
    }
}

class Child extends Parent {

    @Override
    void print() {
        System.out.print("Child");
    }

    void test() {
        this.print();   // Calls Child's print()
        super.print();  // Calls Parent's print()
    }

    void test1() {
        print();        // Calls Child's print()
        super.print();  // Calls Parent's print()
    }
}

public class fields{
    public static void main(String[] args) {
        Child obj = new Child();

        obj.test();   // Output: ChildParent
        System.out.println();

        obj.test1();  // Output: ChildParent
    }
}