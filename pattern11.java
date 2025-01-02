public class pattern11 {
    public static void main(String arg[]) {
        int n = 8;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == (n / 2) || i == (n / 2) + 1

                ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}