import java.util.*;

public class while_loop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello Word");
            i++;
        }
        int j = 1;
        while (j <= 100) {
            System.out.print(j + " ");
            j++;

        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter n number to print");
        int n = sc.nextInt();
        int e = 1;
        int sum = 0;
        while (e <= n) {
            
            e++;
        }
        System.out.println("The Sum of " + n + " is " + sum);
    }

}
