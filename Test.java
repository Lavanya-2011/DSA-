class Test {
    int ID;   // removed final

    Test() {
        ID = 100;
    }

    void changeValue() {
        System.out.println(ID);
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.changeValue();
    }
}