class Dnode {
    int data;
    Dnode left;
    Dnode right;
}

class Basic15 {

    Dnode head;
    Dnode tail;
    int length;

    void addFirst(int value) {
        Dnode newNode = new Dnode();
        newNode.data = value;

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.right = head;
            head.left = newNode;
            head = newNode;
        }
    }

    void addLast(int value) {
        Dnode newNode = new Dnode();
        newNode.data = value;

        if (tail == null) {   // if list is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.right = newNode;
            newNode.left = tail;
            tail = newNode;
        }
    }

    void addPos(int pos, int value) {

        if (pos < 0 || pos > len()) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            addFirst(value);
            return;
        }

        if (pos == len()) {
            addLast(value);
            return;
        }

        Dnode newNode = new Dnode();
        newNode.data = value;

        Dnode temp = head;

        for (int i = 0; i < pos - 1; i++) {
            temp = temp.right;
        }

        newNode.right = temp.right;
        newNode.left = temp;
        temp.right.left = newNode;
        temp.right = newNode;
    }

    int len() {
        Dnode temp = head;
        length = 0;

        while (temp != null) {
            length++;
            temp = temp.right;
        }
        return length;
    }

    void display() {
        Dnode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
        System.out.println("\nForward");
    }

    void reverse() {
        Dnode temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.left;
        }
        System.out.println("\nReverse");
    }

    public static void main(String[] args) {

        Basic15 ob = new Basic15();

        ob.addFirst(10);
        ob.addFirst(20);
        ob.addLast(30);
        ob.addPos(2, 5);   // correct order (position, value)

        ob.display();
        ob.reverse();

        System.out.println("Len = " + ob.len());
    }
}