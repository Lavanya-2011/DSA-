
class Dnode1 {
    int data;
    Dnode1 left;
    Dnode1 right;
}

class Basic14 {

    Dnode1 head;
    Dnode1 tail;
    int length;

    void addFirst(int value) {
        Dnode1 newNode = new Dnode1();
        newNode.data = value;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.right = head;
            head.left = newNode;
            head = newNode;
        }
    }

    void addLast(int value) {
        Dnode1 newNode = new Dnode1();
        newNode.data = value;

        if (tail == null) {
            head = tail = newNode;
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

        Dnode1 newNode = new Dnode1();
        newNode.data = value;

        Dnode1 temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.right;
        }

        newNode.right = temp.right;
        newNode.left = temp;
        temp.right.left = newNode;
        temp.right = newNode;
    }

    void deleteFirst() {
        if (head == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.right;
            head.left = null;
        }
    }

    void deleteLast() {
        if (tail == null) return;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.left;
            tail.right = null;
        }
    }

    void deletePos(int pos) {
        if (pos < 0 || pos >= len()) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 0) {
            deleteFirst();
            return;
        }

        if (pos == len() - 1) {
            deleteLast();
            return;
        }

        Dnode1 temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.right;
        }

        temp.right = temp.right.right;
        temp.right.left = temp;
    }

    void update(int target, int value) {
        Dnode1 temp = head;
        while (temp != null) {
            if (temp.data == target) {
                temp.data = value;
            }
            temp = temp.right;
        }
    }

    void update2(int pos, int value) {
        if (pos < 0 || pos >= len()) {
            System.out.println("Invalid position");
            return;
        }

        Dnode1 temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.right;
        }

        temp.data = value;
    }

    int len() {
        Dnode1 temp = head;
        length = 0;

        while (temp != null) {
            length++;
            temp = temp.right;
        }
        return length;
    }

    void display() {
        Dnode1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.right;
        }
        System.out.println("\nForward");
    }

    void reverse() {
        Dnode1 temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.left;
        }
        System.out.println("\nReverse");
    }

    boolean contains(int target) {
        Dnode1 temp = head;
        while (temp != null) {
            if (temp.data == target)
                return true;
            temp = temp.right;
        }
        return false;
    }

    public static void main(String[] args) {

        Basic14 ob = new Basic14();

        ob.addFirst(10);
        ob.addFirst(20);
        ob.addLast(30);
        ob.addPos(3, 5);

        ob.update(10, 50);
        ob.update2(0, 80);

        System.out.println(ob.contains(30));
        ob.display();
        ob.reverse();
        System.out.println("Len = " + ob.len());
    }
}