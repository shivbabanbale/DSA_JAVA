import java.util.*;

public class factorial_function {
    public static int facto(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate ");
        int a = sc.nextInt();
        int fact = facto(a);
        System.out.println(fact);
    }
}
