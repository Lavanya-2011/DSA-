class Box {
    int l, w, h;

    // Parameterized constructor
    Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // No-argument constructor (constructor chaining)
    Box() {
        this(1, 1, 1);   // Must be first statement
    }

    void display() {
        System.out.println(l + "*" + w + "*" + h);
    }
}

public class chaining {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5, 6, 7);

        System.out.print("Box 1: ");
        b1.display();

        System.out.print("Box 2: ");
        b2.display();
    }
}