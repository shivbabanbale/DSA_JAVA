import java.util.*;

public class prime_number {
    public static boolean primo(int n) {
        if (n == 2) {
            return true;

        }

        for (int i = 2; i < n; i++) { // optimize approch is we not going up to n , on that <=math.sqrt(n)
            if (n % i == 0) {
                return false;

            }
        }
        return true;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a range ");
        int range = sc.nextInt();
        for (int i = 2; i <= range; i++) {

            boolean primechecked = primo(i);
            if (primechecked == true) {
                System.out.print(i + " ");
            }
        }
    }
}
