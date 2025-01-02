import java.util.*;

public class interleaves_two_half {

    static class Qu {
        static Queue<Character> q1 = new LinkedList<>();
        static Queue<Character> q2 = new LinkedList<>();

        public static void Interleaves_two_half(String str) {
            int size = str.length() / 2;
            for (int i = 0; i < str.length(); i++) {
                q1.add(str.charAt(i));
            }
            for (int j = 0; j < size; j++) {
                q2.add(q1.remove());

            }
            printer();
        }

        public static void printer2() {
            if (q1.isEmpty()) {
                System.out.println("end");
                return;
            }
            System.out.print(q1.remove() + " ");
            printer();

        }

        public static void printer() {
            if (q2.isEmpty()) {
                System.out.println("end");
                return;
            }
            System.out.print(q2.remove() + " ");
            printer2();
        }

    }

    public static void main(String[] args) {

        String str = "1234567891";
        Qu Q = new Qu();
        Q.Interleaves_two_half(str);

    }

}
