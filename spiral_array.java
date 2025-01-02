// import java.util.*;

public class spiral_array {

    public static void spiral_num(int arr[][]) {

        int startrow = 0;
        int endrow = arr.length - 1;
        int startcolumn = 0;
        int endcolumn = arr[0].length - 1;

        while ((startrow <= endrow) && (startcolumn <=  endcolumn)) {
            // startrow
            for (int i = startcolumn; i <= endcolumn; i++) {

                System.out.print(arr[startrow][i] + " ");

            }

            for (int i = startrow + 1; i <= endrow; i++) {

                System.out.print(arr[i][endcolumn] + " ");

            }
            for (int i = endcolumn - 1; i >= startcolumn; i--) {
                System.out.print(arr[endrow][i] + " ");

            }

            for (int i = endrow - 1; i >= startrow + 1; i--) {

                System.out.print(arr[i][startcolumn] + " ");

            }
            startrow++;
            endrow--;
            startcolumn++;
            endcolumn--; 

        }

       
    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int arr[][] = new int[4][4];

        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {

        // arr[i][j] = sc.nextInt();

        // }

        // }
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[0].length; j++) {

        // System.out.print(arr[i][j] + " ");

        // }
        // System.out.println();

        // }

        int arr[][] = { { 2, 5, 9, 7 },
                { 6, 8, 1, 2 },
                { 6, 8, 2, 3 },
                { 5, 8, 9, 4 } };

        spiral_num(arr);

    }
}
