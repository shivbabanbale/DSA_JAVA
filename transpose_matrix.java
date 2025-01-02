public class transpose_matrix {
    /// **************************With New Array***********
    public static void Transpose(int arr[][]) {

        int arr1[][] = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr1[j][i] = arr[i][j];

            }

        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {

                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 11, 12, 13 },
                { 21, 22, 23 }
        };

        Transpose(arr);
    }
}
