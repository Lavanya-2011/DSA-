class Rectangle {
    private double length;
    private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle scale(double factor) {
        return new Rectangle(this.length * factor, this.width * factor);
    }
    public void display(String name) {
        System.out.println(name + ": " + (int) length + "x" + (int) width);
    }
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = rect1.scale(2.0);
        rect1.display("Rect1");
        rect2.display("Rect2");
    }
}