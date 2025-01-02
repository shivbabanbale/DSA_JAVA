import java.util.Scanner;

public class largest_in_twoD {

    // finding max
    public static void max(int arr[][]) {
        int n = -1;
        int m = -1;
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                if (arr[i][j] > sum) {

                    sum = arr[i][j];
                    n = i;
                    m = j;
                }

            }
        }
        System.out.println("the maximum element is " + sum + "at position" + n + " " + m);

    }

    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = sc.nextInt();

            }
            System.out.println();

        }

        // printing array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();

        }

        max(arr);

    }
}
