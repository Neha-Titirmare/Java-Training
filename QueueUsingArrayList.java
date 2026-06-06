import java.util.ArrayList;

class QueueUsingArrayList {
    ArrayList<Integer> list = new ArrayList<>();

    // Enqueue
    void add(int data) {
        list.add(data);
    }

    // Dequeue
    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return list.remove(0);
    }

    
    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return list.get(0);
    }

    
    boolean isEmpty() {
        return list.size() == 0;
    }

    public static void main(String[] args) {
        QueueUsingArrayList q = new QueueUsingArrayList();

        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println("Front: " + q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}