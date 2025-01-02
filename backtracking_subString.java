public class backtracking_subString {

    public static void subStringFinder(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;

        }

        // choise is yes
        subStringFinder(str, ans + str.charAt(i), i + 1);

        // choise is no
        subStringFinder(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abcbb";
        subStringFinder(str, "", 0);

    }
}
