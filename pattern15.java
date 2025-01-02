public class pattern15 {
    public static void main(String args[]) {

        int n = 9;
        int j;
        for (int i = 1; i <= 5; i++) {
            for (j = 1; j <= n; j++) {
                if ((i == 1 && j > (n / 2) + 1) || (i == 5 && j < n / 2 +1) ||
                        (i == i && j == ((n / 2) +1- i))||
                        (i == i && j == (n-i)+2)) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }

            }

            System.out.println(" ");
        }

    }
}