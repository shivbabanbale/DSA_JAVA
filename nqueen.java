public class nqueen {

    static int count = 0;

    public static boolean issafe(char arr[][], int row, int column) {

        // for verticall row
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][column] == 'Q') {
                return false;
            }
        }
        // for verticle left
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // for verticle right
        for (int i = row - 1, j = column + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }

    public static boolean row_wise_queen(char arr[][], int n, int row) {

        if (row == n) {
            // printer(arr);
            count++;
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (issafe(arr, row, i)) {
                arr[row][i] = 'Q';
                if (row_wise_queen(arr, n, row + 1)) {
                    return true;
                }

                arr[row][i] = '.';
            }
        }
        return false;

    }

    public static void main(String args[]) {
        int n = 4;
        char arr[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';

            }

        }
        if (row_wise_queen(arr, n, 0)) {

            System.out.println("**************the solution are possible***************");
            printer(arr);
        } else {
            System.out.println("solution are not possible");
        }
        // printer(arr);
        // System.out.println("the number of ways solutions are " + count);

    }

    public static void printer(char arr[][]) {
        System.out.println("...................Queens with unique place................");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}