import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class AccessControl {

    public static void main(String[] args) {

        // Creating Linked List
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int k = 2;

        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;

        // Traverse linked list
        while(temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }

        int size = list.size();
        int index = size - k;

        System.out.println(list.get(index));
    }
}