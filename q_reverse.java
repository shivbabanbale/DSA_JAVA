import java.util.*;

public class q_reverse {

    public static void reverse_kardo(Queue<Integer> qq) {
        Stack<Integer> stk = new Stack<>();
        while (!qq.isEmpty()) {
            stk.push(qq.remove());
        }
        while (!stk.isEmpty()) {
            qq.add(stk.pop());
        }

    }

    public static int remove(Queue<Integer> qq) {
        return qq.remove();
    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverse_kardo(q);
        while (!q.isEmpty()) {
            System.out.print(remove(q) + " ");
        }

    }

}