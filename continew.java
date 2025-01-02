import java.util.*;

public class continew {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.print(i + " ");
        // }
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number");
            int num = sc.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println(num + " ");
        }
    }
}
