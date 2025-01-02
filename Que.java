public class Que {

    public static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {

        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {

            return head == null && tail == null;
        }

        public static void add(int data) {

            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
            }

            tail.next = newnode;
            tail = newnode;

        }

        public static int remove() {

            if (isEmpty()) {

                System.out.println("your list is alraidy empty bro");
                return -1;
            }
            int front = head.data;

            if (tail == head) {
                head = tail = null;
            } else {
                head = head.next;

            }

            return front;

        }

    }

    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.add(5);
        Q.add(8);
        Q.add(2);

        while (!Q.isEmpty()) {

            System.out.println(Q.remove());
        }
    }

}
