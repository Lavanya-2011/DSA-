import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicate {

    public static void main(String[] args) {

        // Creating Linked List
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        ArrayList<Integer> list = new ArrayList<>();

        Node temp = head;

        // Traverse Linked List
        while(temp != null)
        {
            if(!list.contains(temp.data))
            {
                list.add(temp.data);
            }

            temp = temp.next;
        }

        // Print unique values
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}