import java.util.*;

public class decimal_binary3 {

    public static void convertor(int num) {
        int sum = 0;
        int i = 0;
        while (num != 0) {
            int bit = num % 2;
            sum = sum + (int) (bit * Math.pow(10, i));
            num = num / 2;
            i++;
        }
        System.out.println("binary value is " + sum);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("plese enter a value in decimal");
        int dec_val = sc.nextInt();
        convertor(dec_val);
    }
}
