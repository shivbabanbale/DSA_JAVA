import java.util.*;

public class Queu_using_stack {

    static class Qstack {
        static Stack<Integer> stk2 = new Stack<>();
        static Stack<Integer> stk1 = new Stack<>();

        public static void add(int data) {
            while (!stk1.empty()) {
                stk2.push(stk1.pop());

            }
            stk1.push(data);

            while (!stk2.empty()) {

                stk1.push(stk2.pop());
            }

        }

        public static boolean isempty() {
            return stk1.empty();
        }

        public static int remove() {

            if (stk1.empty()) {
                System.out.println("your list is alredy empty bro");
                return -1;
            } else {
                return stk1.pop();
            }

        }

    }

    public static void main(String[] args) {
        Qstack qt = new Qstack();
        qt.add(1);
        qt.add(2);
        qt.add(3);

        while (!qt.isempty()) {
            System.out.println(qt.remove());

        }

    }

}
