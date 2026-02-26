
import java.util.PriorityQueue;
import java.util.Collections;

class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> a1 =
                new PriorityQueue<>(Collections.reverseOrder());

        a1.offer(10);
        a1.offer(1);
        a1.offer(4);
        a1.offer(-1);

        System.out.println(a1);
        System.out.println(a1.poll());
        System.out.println(a1.poll());
        System.out.println(a1.peek());
        System.out.println(a1.isEmpty());
    }
}