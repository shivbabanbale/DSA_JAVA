public class QusingArray {
    public static class Queue {
        public static int array[];
        public static int size;
        public static int rear;

        Queue(int n) {
            array = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;

        }

        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Bro your list is Empty bro");
                return;
            }
            rear = rear + 1;
            array[rear] = data;

        }

        public static int remove() {

            if (isEmpty()) {
                System.out.println("Your list is empty bro");
            }
            int front = array[0];
            for (int i = 0; i < rear; i++) {
                array[i] = array[i + 1];

            }
            rear = rear - 1;
            return front;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("your list is empty");
                return -1;
            } else {
                return array[0];
            }

        }

    }

    public static void main(String[] args) {
        Queue Q = new Queue(5);
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        while (!Q.isEmpty()) {
            System.out.println(Q.peek());
            Q.remove();

        }

    }
}