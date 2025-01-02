public class pattrn10 {
    public static void main(String[] args) {
        int n = 5;
        int pp = 0;
        int num = 10101;

        while (num != 0) {
            int bit = num % 10;
            pp = (pp * 10) + bit;
            System.out.println(pp + " ");
            num = num / 10;

        }

    }
}
