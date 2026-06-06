import java.util.Queue;
import java.util.LinkedList;

public class QueueInbuilt {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // Enqueue
        q.add(10);
        q.add(20);
        q.add(30);

        // Front Element
        System.out.println("Front: " + q.peek());

        // Dequeue
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}