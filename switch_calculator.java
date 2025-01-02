import java.util.*;
public class switch_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter firstnumber");
        int firstnumber=sc.nextInt();
        System.out.print("Enter secondnumbar");
        int secondnumbar=sc.nextInt();
        System.out.print("Enter operator");
        char operator=sc.next().charAt(0);
       
        switch (operator) {
            case '+':System.out.println((firstnumber+secondnumbar));
                
                break;
                case '-':System.out.println((firstnumber-secondnumbar));
                
                break;
                case '*':System.out.println((firstnumber*secondnumbar));
                
                break;
                case '/':System.out.println((firstnumber/secondnumbar));
                
                break;
            default:System.out.println("please enetr va valid ");
                break;
        }
    }
}
