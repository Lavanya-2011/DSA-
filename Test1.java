// Parent class
class Test1 {

    // default access modifier (package-private)
    int num = 234;

    // public access modifier
    public String name = "dell";

    // private access modifier (only inside this class)
    private int ram = 16;

    // protected access modifier (accessible in child class)
    protected int hdd = 2;

    public static void main(String[] args) {

        // Creating object of parent class
        Test1 ob = new Test1();

        // Accessing members of Test1
        System.out.println(ob.num);    // default
        System.out.println(ob.name);   // public
        System.out.println(ob.ram);    // private (allowed here)
        System.out.println(ob.hdd);    // protected

        // Creating object of child class
        Test2 ob2 = new Test2();

        // Accessing members through child class object
        System.out.println(ob2.num1);
        System.out.println(ob2.name1);
        System.out.println(ob2.ram1);
        System.out.println(ob2.hdd1);

        // Accessing parent variables again
        System.out.println(ob.num);
        System.out.println(ob.name);
        // System.out.println(ob.ram); // private → only within Test1
        System.out.println(ob.hdd);
    }
}

// Child class
class Test2 extends Test1 {

    // Child class variables copying values from parent
    int num1 = num;          // default → accessible
    String name1 = name;     // public → accessible
    int ram1 = 16;           // cannot access private directly
    int hdd1 = hdd;          // protected → accessible
}