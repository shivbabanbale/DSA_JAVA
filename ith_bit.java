public class ith_bit {

    public static int ith_bit_finder(int a, int b) {

        int bitmask = (1 << b);

        if ((a & bitmask) == 0) {

            // System.out.println(" " + 0);
            return 0;

        } else {
            // System.out.println(' ' + 1);
            return 1;
        }

    }

    public static int set_ith_bit(int a, int b) {

        int bitmask = (1 << b);

      int val =a| bitmask;
return val;
    }
    public static int clear_ith_bit(int a, int b) {

        int bitmask = (1 << b);
int negbitmask=~(bitmask);
      int val =a & negbitmask;
return val;
    }

    public static void main(String[] args) {
        // System.out.println(ith_bit_finder(10, 5));
        // System.out.println(set_ith_bit(10, 0));
        System.out.println(clear_ith_bit(10, 1));


    }
}
