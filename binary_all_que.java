import java.util.*;

public class binary_all_que {

    static Queue<String> q = new LinkedList<>();

    public static void generate_print_binary(int num) {
        q.add("1");
        while (num-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
            
        }

    }

    public static void main(String args[]) {

        int n = 10;
        generate_print_binary(n);

    }
}
