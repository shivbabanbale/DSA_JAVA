public class repeting_char_chech {

    public static void charcheck(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                char ch = str.charAt(i);
                System.out.println(ch);
                return;
            }

        }

    }

    public static void main(String[] args) {
        String str = "asbcdabb";

        charcheck(str);

    }
}
