import java.util.*;

public class stack_deque {

    public static void push(Deque<Integer> dq, int data) {

        dq.addFirst(data);

    }

    public static int pop(Deque<Integer> dq) {

        return dq.removeFirst();

    }

    public static void main(String args[]) {

        Deque<Integer> dg = new LinkedList<>();
        push(dg, 1);
        push(dg, 2);
        push(dg, 3);
        push(dg, 4);

        while (!dg.isEmpty()) {
            System.out.println(pop(dg));
        }

    }
}
