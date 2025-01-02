import java.util.Scanner;

public class mitiple_10_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("enter number ");
            n = sc.nextInt();
            if (n % 10 == 0) { // Without breack also we can complit task by given condition ( n%10 != 0 );
                break;
            }
            System.out.println(n);

        } while (true);
    }
}