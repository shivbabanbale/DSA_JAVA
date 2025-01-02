import java.util.*;

public class half_priryamid {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("enter a range ");
        // int n = sc.nextInt();
        int n = 4;
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = n - i; j < n; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }

}
