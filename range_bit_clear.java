public class range_bit_clear {

    public static void Clear_range(int num, int i, int j) {

        int mask1 = ~(1) << j+1;
        int mask2 = (1 << i)-1;
        int mainMask = mask1 | mask2;
        // System.out.println(mainMask);
        int Ans = num & mainMask;

        System.out.println(Ans);

    }

    public static void main(String[] args) {
        int i = 2;
        int j = 3;
        int num = 15;
        Clear_range(num, i, j);
    }
}
