public class pattern16 {
    public static void main(String args[]) {
        int n = 6;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            int g = 1;
            for (int j = 1; j <= i; j++) {

                System.out.print(g + " ");
                g++;
            }
            System.out.println();
        }

    }
}
