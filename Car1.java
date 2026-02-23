class Car {
    // Private fields
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Year: " + year + ", Make: " + make + ", Model: " + model);
    }
}

public class Car1{
    public static void main(String[] args) {
        // Sample Test Case 1
        Car car1 = new Car("Toyota", "Corolla", 2021);
        car1.displayInfo();

        // Sample Test Case 2
        Car car2 = new Car("Ford", "Mustang", 1969);
        car2.displayInfo();
    }
}