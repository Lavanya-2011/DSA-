class Thing {
    private static int count = 0;
    public Thing() {
        count++;
    }
    public static int getCount() {
        return count;
    }
}

public class counter{
    public static void main(String[] args) {
        Thing t1 = new Thing();
        Thing t2 = new Thing();
        Thing t3 = new Thing();
        System.out.println("Things created: " + Thing.getCount());
    }
}
