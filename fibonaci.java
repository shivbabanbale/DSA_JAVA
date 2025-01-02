import java.util.*;

public class fibonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a range ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        int i = 0;
        while (i < num - 1) {
            int nextnum = a + b;
            System.out.print(nextnum + " ");
            a = b;
            b = nextnum;
            i++;
        }
    }
}
