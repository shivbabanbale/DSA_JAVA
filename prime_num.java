import java.util.*;

public class prime_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please Enter a Number to check ");
        int num = sc.nextInt();
        if (num == 2) {
            System.out.print("Prime hai bhai");

        } else {
            boolean pcheck = true;
            for (int i = 2; i <= Math.sqrt(num); i++) { // num <1 chy jah+gi under root of n wapru shakto karn garj nhi
                                                        // purn value sobt cheeck karachi 50% paryant karatch
                if (num % i == 0) {
                    pcheck = false;
                    break;
                } else {
                    pcheck = true;
                }

            }
            if (pcheck == false) {
                System.out.println("it is non prime number");
            } else {
                System.out.println("It is a Prime number");
            }
        }
    }
}
