
import java.util.*;

public class decimal_binary {

    public static void converter(int num) {
        int i = 0;
        while (num != 0) {

            int bit = (num & 1);

            System.out.print(bit);
            num = num >> 1;
        }

        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please enter a decimal number contain 0 and 1 ");
        int number = sc.nextInt();
        converter(number);
        // System.out.println("conversion of " + number + " to binary is " +
        // binary_num);
        System.out.print("Thank you so much for using me because you are nalla !!");

    }
}
