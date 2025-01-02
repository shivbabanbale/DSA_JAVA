public class recursion_inc {

    public static void rec_inc(int n) {
        // if (n == 1) {
        // System.out.print(n + " ");
        // return;
        // }

        // rec_inc(n - 1);
        // System.out.print(n + " ");

        if (n > 1) {
            rec_inc(n - 1);
        }
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        rec_inc(10);
    }
}
