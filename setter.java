class Person {
    private int age;

    // Setter with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    // Getter
    public int getAge() {
        return age;
    }
}

public class setter{
    public static void main(String[] args) {
        Person p = new Person();

        // Valid age
        p.setAge(25);
        System.out.println("Initial Age: " + p.getAge());

        // Invalid age
        p.setAge(-5);
        System.out.println("After setAge(-5): " + p.getAge());
    }
}