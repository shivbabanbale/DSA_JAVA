import java.util.*;

public class interleaves_two_half_queue {

    static class Queu {

        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean empty() {

            return q1.isEmpty();

        }

        public static void add(int size) {
            System.out.println("insert element half into q1");
            for (int i = 0; i < size / 2; i++) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                q1.add(num);
            }
            System.out.println("insert remaining elements into q2");
            for (int j = size / 2; j < size; j++) {

                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                q2.add(num);

            }

        }

        public static int removee() {
            return q1.remove();

        }

        public static void makeinterleaves() {
            while (!q1.isEmpty() && !q2.isEmpty()) {
                q1.add(q1.remove());
                q1.add(q2.remove());
            }
        }

    }

    public static void main(String args[]) {
        Queu qq = new Queu();
        qq.add(10);
        qq.makeinterleaves();
        System.out.println("chalu hoja guru");

        while (!qq.empty()) {
            System.out.print(qq.removee() + " ");

        }

    }

}
