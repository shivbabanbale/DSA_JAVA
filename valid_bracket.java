import java.util.*;

public class valid_bracket {

    public static boolean Checker(String str) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '(') {
                stk.push(ch);
            } else {
                if (stk.empty()) {
                    return false;
                }
                if ((stk.peek() == '[' && ch == ']') || (stk.peek() == '{' && ch == '}')
                        || (stk.peek() == '(' && ch == ')')) {
                    stk.pop();
                } else {
                    return false;
                }
            }

        }
        if (stk.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        String str = "({}(()))";
        System.out.println(Checker(str));

    }

}
