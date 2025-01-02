public class diagonal_add {

    public static void diagonal_add(int arr[][]) {
        int sum = 0;
        int rsum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum +=arr[i][i];
            int m = arr.length - 1 - i;
            rsum = arr[i][m] + rsum;
        }

        System.out.println("left diagonal sum is " + sum);
        System.out.print("right diagonal sum is " + rsum);

    }

    public static void main(String[] args) {
        int arr[][] = { { 2, 5, 9, 7 },
                { 6, 8, 1, 2 },
                { 6, 8, 2, 3 },
                { 5, 8, 9, 4 } };

        diagonal_add(arr);
    }
}
