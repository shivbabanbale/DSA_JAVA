import java.util.*;

public class functions {

    public static void hellow() {
        System.out.println("Lome me like you do 💌");
        System.out.println("Lome me like you do :anatomical_heart:");
        System.out.println("Lome me like you do :bikini: ");

    }

    public static int sum(int num1, int num2) {

        int sum = num1 + num2;
        return (sum);
    }

    public static void main(String[] args) {
        hellow();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number ");
        int i = sc.nextInt();
        System.out.print("enter second number ");
        int j = sc.nextInt();
        int sum = sum(i, j); // we can esily assign the function value at that particular variable but only
                             // when return available

        System.out.println(sum);
    }
}
