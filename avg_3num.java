import java.util.*;

public class avg_3num {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int sum=(a+b+c);
        float avg=sum/3;
        System.out.println(avg);


   System.out.println("Enter length of side of a square ");
   int sidel=sc.nextInt();
    int area=(sidel*sidel);

    System.out.println(area);

    System.out.println("Enter price of pen");
    float pen=sc.nextInt();
    System.out.println("Enter price of pencil");
    float pencil=sc.nextInt();
    System.out.println("Enter price of eraser");
    float eraser=sc.nextInt();
  float biilAmmount= pen+pencil+eraser;
  System.out.println(biilAmmount);
  float AmmountwithGST=biilAmmount+(biilAmmount*18/100);
  System.out.println(AmmountwithGST);
    }
}
