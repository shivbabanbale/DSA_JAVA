import java.util.*;

public class incom_tax {
    public static void main(String[] args) {
        int tax=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your income");
        int income = sc.nextInt();
        if (income <= 500000) {
          
        } else {
            if ((income > 500000) && (income <= 1000000)) {
                tax = (int) (income * 0.20);
            } else {
                if ((income > 1000000) && (income <= 1500000)) {
                    tax = (int) (income * 0.40);
                }else{
                    tax=(int)(income*0.45);
                }
            }
        }
    System.out.println(tax);
    }


}
