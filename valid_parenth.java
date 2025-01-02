import java.util.*;

public class valid_parenth {

    public static boolean valid_check(String str) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch == ')') {
                int count = 0;
                while (stk.peek() != '(') {
                    stk.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                } else {
                    stk.pop();
                }
            } else {
                stk.push(ch);
            }

        }
        return false;

    }

    public static void main(String args[]) {
        String str = "(a+b)(a-b)";
        // System.out.println(valid_check(str));

        if (valid_check(str)) {
            System.out.println("Sorry it is wrong");
        } else {

            System.out.println("yes it is totally correct");
        }

    }

}