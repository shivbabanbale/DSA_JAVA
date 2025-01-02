public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        int j;
        for (int i = 1; i <= n; i++) {
            for ( j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (j = (n - i)+1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
