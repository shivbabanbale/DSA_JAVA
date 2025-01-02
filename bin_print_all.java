public class bin_print_all {

    public static void binary_maker(int n, int lastplace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        if (lastplace == 0) {

            binary_maker(n - 1, 0, str + "0");
            binary_maker(n - 1, 1, str+"1");

        } else {

            binary_maker(n - 1, 0, str+"0");

        }

    }

    public static void main(String args[]) {
        int n = 3;
        int lastplace = 0;
        String str = new String();
        binary_maker(n, lastplace, str);

    }

}
