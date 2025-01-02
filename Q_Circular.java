public class Q_Circular {
    public static class Queue {

        static int arr[];
        static int rear;
        static int front;
        static int size;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public static boolean isEmpty() {
            return (rear == -1 && front == -1);

        }

        public static void add(int data) {
            if ((rear + 1) % size == front) {
                System.out.println("Queue is full bro");
                return;
            }
            if (front == -1) {
                front = arr[0];
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("nanga nahyega kya aur nichodega kya");
                return -1;
            }

            int result = arr[front];

            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

    }

    public static void main(String[] args) {
        Queue Q = new Queue(3);
        Q.add(1);
        Q.add(2);
        Q.add(3);

        System.out.println(Q.remove());
        Q.add(4);
        System.out.println(Q.remove());
        Q.add(5);
        System.out.println(Q.remove());
        Q.add(6);
        System.out.println(Q.remove());
    }
}
