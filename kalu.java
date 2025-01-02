import java.util.*;
public class kalu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a key");
    int key = sc.nextInt();
    switch (key) {

      case 1:
        System.out.println("You Enter 1");
        break;
      case 2:
        System.out.println("You Enter 2 ");
        break;
      case 3:
        System.out.println("You Enter 3");
        break;
      case 4:
        System.out.println("you Enter 4");
        break;
        default:
        System.out.println("Enterd key more than 4");
        break;
    }

  }
}


