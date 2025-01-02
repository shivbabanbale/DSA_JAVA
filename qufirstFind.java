import java.util.*;

public class qufirstFind {

    static class Queueu {
        static Queue<Character> q = new LinkedList<>();
        static int freq[] = new int[26];

        public static void removee() {

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1)
                q.remove();
        }

        public static char first__non_reapeating_number(String str) {

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                q.add(ch);
                freq[ch - 'a']++;

                removee();

            }
            return q.peek();
        }

    }

    public static void main(String[] args) {
        String str = "xadabbhccdx";
        Queueu qq = new Queueu();

        System.out.println(qq.first__non_reapeating_number(str));
    }

}
