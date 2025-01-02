import java.util.*;

public class twod_array {
    public static void search(int arr[][], int key) {
        boolean checker = false;
        
        for (int  i = 0; i < arr.length; i++) {
            for ( int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] == key) {
                    checker = true;
                    System.out.print("The Element " + key + " is present at" + i + " " + j);

                    break;

                } else {
                    checker = false;

                }

            }
            System.out.println();

        }
        if (checker == false) {
            System.out.println("Element not found");
        } 
    }

    public static void main(String args[]) {

        int arr[][] = new int[3][3];
        int n = 3, m = 3;
        Scanner sc = new Scanner(System.in);
System.out.println("plz give input" );
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                arr[i][j] = sc.nextInt();

            }
            System.out.println();

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("please eneter a element that you have search");
        int key = sc.nextInt();

        search(arr, key);
    }
}