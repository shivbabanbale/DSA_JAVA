import java.util.*;

public class ternary_oprator {
    public static void main(String[] args) {
        System.out.println((3 > 2) ? 3 : 2);
        String type = (6 % 2 == 0) ? "even" : "odd";
        System.out.println(type);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks=sc.nextInt();
        String result=(marks>35)? "Pass":"fail";
        System.out.println(result);
        


       

    }
}
