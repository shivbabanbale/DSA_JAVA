import java.util.*;

public class patternStar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println(" ");
        }

    }
}
