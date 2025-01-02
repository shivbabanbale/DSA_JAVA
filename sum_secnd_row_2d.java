public class sum_secnd_row_2d {

    public static void Sum_Of_2nd_row(int arr[][]) {
        int sum = 0;
        int i = 1;
        for (int j = 0; j < arr[0].length; j++) {

            sum += arr[i][j];
        }

        System.out.println("the sum of second row number is " + sum);

    }

    public static void main(String[] args) {

        int arr[][] = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        Sum_Of_2nd_row(arr);
    }
}
