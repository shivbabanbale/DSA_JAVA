public class nth_fibonacci {

    public static int fibbo(int n) {

        if (n == 0) {

            System.out.print(0 + " ");
            return 0;

        } else if (n == 1) {

            // System.out.print(1 + " ");
            return 1;

        }
        return fibbo(n - 1) + fibbo(n - 2);

        // int fn=fibbo(n - 1);
        // int fn1=fibbo(n - 2);

        // fn=fbn;

    }

    public static void main(String[] args) {
        System.out.print(fibbo(10));

    }
}
