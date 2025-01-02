import java.util.*;

public class java_input {
    public static void main(String arg[]) {
        // importing class and creating object that is Scanner present in util package
        System.out.println("Enetr Data");
        Scanner sc = new Scanner(System.in);

        // String inputdata = sc.nextLine();
        // System.out.println(inputdata);


        // int val=sc.nextInt();
        // System.out.println(val);


        // float val = sc.nextFloat();
        // System.out.println(val);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println(sum);


        //Area of Circle= 3.14*r*r so lets find out
        float rad=sc.nextFloat();
        double area= 3.14* rad* rad;
        System.out.println(area);




    }
}
