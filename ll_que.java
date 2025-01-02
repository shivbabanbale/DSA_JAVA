public class ll_que {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

        static class Queue {
            public static Node head = null;
            public static Node tail = null;

            public static boolean isEmpty() {

                return head == null;

            }

            public static void add(int data) {
                Node newnode = new Node(data);
                if (head == null) {
                    head = tail = newnode;
                }
                newnode.next = head;
                head = newnode;
            }

        }

    }

}
