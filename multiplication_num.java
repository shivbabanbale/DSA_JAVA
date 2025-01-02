import java.util.*;

public class multiplication_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number you want multiple ");
        int num = sc.nextInt();
        int n;
        n = num;
        for (int i = 1; i <= 10; i++) {
            num = num * i;
            System.out.println(n + "*" + i + "=" + num);
            num = n;
        }
    }

}
