class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListDemo {
    public static void main(String[] args) {

        Node n1 = new Node(100);
        Node n2 = new Node(200);
        Node n3 = new Node(300);
        Node n4 = new Node(400);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node current = n1;

        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}