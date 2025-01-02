public class clear_last_bits {

    public static int clear_bit(int n, int i) {

       return n & (-(1) << i);

    }

    public static void main(String[] args) {
        System.out.println(clear_bit(15, 2));
    }
}
