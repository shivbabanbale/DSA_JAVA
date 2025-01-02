import java.util.*;

public class even_odd_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int osum = 0;
        do {
            System.out.print("enetr any number");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                sum = sum + n;
                System.out.println("the even Sum is " + sum);
            } else {
                osum = osum + n;
                System.out.println("The Odd Sum is " + osum);
            }

        } while (true);

    }
}
