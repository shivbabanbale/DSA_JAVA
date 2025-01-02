import java.util.*;

public class binary_decimal {

    public static double converter(int num) {
        double dec_num = 0;
        int i = 0;
        while (num != 0) {
            int bit = (num % 10);
            if (bit == 1) {
                dec_num = dec_num + Math.pow(2, i);

            }
            i++;
            num = num / 10;
        }
        return dec_num;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a binary number contain 0 and 1 ");
        int number = sc.nextInt();
        double decimal_num = converter(number);
        System.out.println("conversion of " + number + " to decimal is " + decimal_num);
        System.out.print("Thank you so much for using me..... because you are nalla !!");

    }
}