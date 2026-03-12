class student {
    String name;
    int id;

    // Constructor using 'this' keyword
    student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        student s = new student("Alice", 101);
        s.display();
    }
}