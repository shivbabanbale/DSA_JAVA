public class patterntriangle {
    public static void main(String[] args) {
        int n = 12;
        int j;
        for (int i = 1; i <= 4; i++) {
            for (j = 1; j <= (n / 2)+1 - i; j++) {
                System.out.print(" ");
            }
            for (j = (n / 2)+5; j <= n + i; j++) {

                System.out.print(" *");
            }

            System.out.println(" ");
        }

    }
}
