
class admin{
    private String name;
    private String role;
    private admin(String name, String role) {
        this.name = name;
        this.role = role;
    }
    public static admin createAdmin(String name) {
        return new admin(name, "admin");
    }
    public void display() {
        System.out.println("Details of created user:");
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
    }

    public static void main(String[] args) {
        admin u = admin.createAdmin("Alice");

        u.display();
    }
}