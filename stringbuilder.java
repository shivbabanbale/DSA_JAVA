public class stringbuilder {

    public static void appendr(StringBuilder str) {

        for (char i = 'a'; i <= 'z'; i++) {
            str.append(i + " ");
        }
        System.out.println(str);
    }

    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("");
        appendr(str);
    }
}
