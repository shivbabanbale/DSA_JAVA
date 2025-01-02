public class recursion_facto {

    public static int facto(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = facto(n - 1);

        int fn = n * fnm1;

        return fn;
    }

    public static int nsum(int n) {
        if (n == 1) {
            return 1;
        }
        int fnm1 = nsum(n - 1);

        int fn = n + fnm1;

        return fn;
    }

    public static void main(String[] args) {
        System.out.println(facto(5));
        System.out.println(nsum(5));
    }
}
