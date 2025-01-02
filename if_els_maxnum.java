import java.util.Scanner;

public class if_els_maxnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the First Number ");
        int firstNum = sc.nextInt();
        System.out.print("enter the second  Number ");
        int secondNum = sc.nextInt();
        if (firstNum == secondNum) {
            System.out.println("Both are Same");
        } else {
            if (firstNum > secondNum) {
                System.out.println("Greater Name is " + firstNum);
            }
             else {

                System.out.println("Greater Name is " + secondNum);
             }}
        
        }
    }


