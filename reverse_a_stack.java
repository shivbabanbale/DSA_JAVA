
import java.util.*;

public class reverse_a_stack {
    public static void push_at_bottom(Stack<Integer> stk, int data) {
        if (stk.isEmpty()) {
            stk.push(data);
            return;
        }
        int top = stk.pop();
        push_at_bottom(stk, data);
        stk.push(top);

    }

    public static void reverse_stack(Stack<Integer> stk) {

        if (stk.isEmpty()) {

            return;
        }
        int top = stk.pop();
        reverse_stack(stk);
        push_at_bottom(stk, top);
    }

    public static void printer(Stack<Integer> stk) {

        while (!stk.isEmpty()) {
            System.out.println(stk.pop());
        }

    }

    public static void main(String[] args) {

        Stack<Integer> stk = new Stack<>();
        stk.push(5);
        stk.push(6);

        stk.push(8);

        stk.push(9);
        printer(stk);
        reverse_stack(stk);

    }
}
