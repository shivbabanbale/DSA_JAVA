public class pattern14 {
    public static void main(String[] args) {
        int n = 9;
        int j;
        for (int i = 1; i <= 5; i++) {
            for (j = i; j <= n / 2; j++) {
                System.out.print(" ");

            }
            for (j = (n / 2); j <= n; j++) {

                System.out.print("* ");
            }

            System.out.println(" ");
        }
    }

}
