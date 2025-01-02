public class half_piryamid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            int num = 1;
            for (int j = 1; j <= n - i; j++) {

                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
