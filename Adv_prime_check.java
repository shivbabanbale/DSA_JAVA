import java.util.*;

public class Adv_prime_check {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check");
        int num = sc.nextInt();
        boolean checked = primo(num);
        System.out.println(checked);
    }
}
