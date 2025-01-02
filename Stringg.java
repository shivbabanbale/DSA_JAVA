
import java.util.Scanner;

public class Stringg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());

        String lname = sc.next();

        System.out.println(name + " " + lname);
        System.out.println(name.charAt(2));

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

    }
}
